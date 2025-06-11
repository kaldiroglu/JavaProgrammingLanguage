package org.javaturk.jp.game.numberGuessing.Claude;

/**
 * Cloude Sonnet 3.7, 06032025
 * I'll develop a solution for this number guessing game using only basic arrays in Java.
 * Number Guessing Game Implementation with Basic ArraysClick to open codeTap to open
 * This implementation of the number guessing game uses only basic arrays and primitive data types, avoiding Java Collections like List. Here's how the algorithm works:
 * Key Components:
 *
 * Candidate Tracking:
 *
 * Uses a boolean array candidates[10000] where true means a number is still a possible solution
 * Tracks the count of remaining candidates with an integer variable
 *
 *
 * Number Validation:
 *
 * Checks for no repeating digits using a boolean array to track used digits
 * Automatically excludes numbers starting with 0 by starting from 1000
 *
 *
 * Feedback Calculation:
 *
 * Breaks down numbers into digit arrays
 * Uses boolean arrays to track which digits have been matched
 * First identifies correct positions (plus)
 * Then finds correct digits in wrong positions (minus)
 *
 *
 * Candidate Selection:
 *
 * Randomly selects from remaining valid candidates
 * Uses an approach that counts through the valid candidates until reaching the randomly selected index
 *
 *
 * Filtering Process:
 *
 * After each guess and feedback, eliminates candidates that wouldn't give the same feedback
 * Recounts remaining candidates after filtering
 *
 *
 *
 * Game Flow:
 *
 * Computer initializes all valid 4-digit numbers
 * Computer makes a guess by randomly selecting from valid candidates
 * Player provides feedback in +X-Y format
 * Computer eliminates candidates that don't match the feedback
 * Process repeats until the computer correctly guesses the number (+4)
 *
 * This implementation is efficient in terms of memory usage, as it only needs a boolean flag for each possible number rather than storing all the numbers themselves.
 * Would you like me to explain any specific part of the code in more detail?
 */


import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    // Use a boolean array to track valid candidates
    private boolean[] candidates;
    private int remainingCandidates;
    private Scanner scanner;
    private Random random;

    public NumberGuessingGame() {
        // Initialize to track numbers from 1000-9999
        candidates = new boolean[10000];
        scanner = new Scanner(System.in);
        random = new Random();
        remainingCandidates = 0;

        // Initialize all valid numbers (no repeating digits, no leading zero)
        for (int i = 1000; i <= 9999; i++) {
            if (isValidNumber(i)) {
                candidates[i] = true;
                remainingCandidates++;
            }
        }
    }

    // Check if a number has no repeating digits
    private boolean isValidNumber(int num) {
        boolean[] used = new boolean[10];
        int digit;

        // Check each digit
        while (num > 0) {
            digit = num % 10;

            // If digit already used, not valid
            if (used[digit]) {
                return false;
            }

            used[digit] = true;
            num /= 10;
        }

        return true;
    }

    // Calculate feedback for a guess compared to potential secret
    private String calculateFeedback(int secret, int guess) {
        int[] secretDigits = new int[4];
        int[] guessDigits = new int[4];
        boolean[] secretMatched = new boolean[4];
        boolean[] guessMatched = new boolean[4];

        // Extract digits
        for (int i = 0; i < 4; i++) {
            secretDigits[3-i] = secret % 10;
            guessDigits[3-i] = guess % 10;
            secret /= 10;
            guess /= 10;
        }

        // Count correct positions (plus)
        int plus = 0;
        for (int i = 0; i < 4; i++) {
            if (secretDigits[i] == guessDigits[i]) {
                plus++;
                secretMatched[i] = true;
                guessMatched[i] = true;
            }
        }

        // Count correct digits in wrong positions (minus)
        int minus = 0;
        for (int i = 0; i < 4; i++) {
            if (!secretMatched[i]) {
                for (int j = 0; j < 4; j++) {
                    if (!guessMatched[j] && secretDigits[i] == guessDigits[j]) {
                        minus++;
                        guessMatched[j] = true;
                        break;
                    }
                }
            }
        }

        return "+" + plus + "-" + minus;
    }

    // Select a random candidate from the remaining valid ones
    private int selectCandidate() {
        if (remainingCandidates == 0) {
            return -1;
        }

        // Pick a random number between 1 and remainingCandidates
        int targetIndex = random.nextInt(remainingCandidates) + 1;
        int count = 0;

        // Find the candidate at that position
        for (int i = 1000; i <= 9999; i++) {
            if (candidates[i]) {
                count++;
                if (count == targetIndex) {
                    return i;
                }
            }
        }

        return -1; // Should not reach here
    }

    // Start the game
    public void play() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a 4-digit number with no repeating digits and not starting with 0.");
        System.out.println("After each guess, enter feedback as +X-Y where:");
        System.out.println("  +X = number of correct digits in correct positions");
        System.out.println("  -Y = number of correct digits in wrong positions");
        System.out.println("For example, if your number is 5174 and my guess is 1234, enter: +1-1");
        System.out.println();

        int turns = 0;

        while (remainingCandidates > 0) {
            turns++;

            // Computer makes a guess
            int guess = selectCandidate();
            if (guess == -1) {
                System.out.println("Error: No valid candidates left.");
                return;
            }

            System.out.println("Turn " + turns + ": My guess is " + guess);
            System.out.print("Enter feedback: ");
            String feedback = scanner.nextLine().trim();

            // Check if game is won
            if (feedback.equals("+4") || feedback.equals("+4-0")) {
                System.out.println("I found your number in " + turns + " turns!");
                return;
            }

            // Filter candidates based on feedback
            filterCandidates(guess, feedback);
            System.out.println("Remaining possibilities: " + remainingCandidates);

            if (remainingCandidates == 0) {
                System.out.println("I'm confused. There might be an error in the feedback provided.");
                return;
            }
        }
    }

    // Filter candidates that don't match the feedback
    private void filterCandidates(int guess, String feedback) {
        int newCount = 0;

        for (int i = 1000; i <= 9999; i++) {
            if (candidates[i]) {
                String calculatedFeedback = calculateFeedback(i, guess);
                if (!calculatedFeedback.equals(feedback)) {
                    candidates[i] = false;
                } else {
                    newCount++;
                }
            }
        }

        remainingCandidates = newCount;
    }

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.play();
    }
}