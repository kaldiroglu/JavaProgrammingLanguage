package org.javaturk.jp.game.numberGuessing.DeepSeek;

/**
 * DeepSeek, 06032025
 Explanation
 Generating Valid Numbers: The generatePossibleNumbers method iterates through all numbers from 1000 to 9999, checking each for unique digits using hasUniqueDigits.

 Tracking Candidates: The isPossible boolean array keeps track of which numbers are still valid candidates after each feedback.

 Feedback Calculation: The calculateFeedback method computes the number of pluses and minuses by comparing each digit of the guess with the candidate number, ensuring digits are not reused once matched.

 Iterative Guessing: The main loop selects the next valid guess, presents it to the player, and updates the possible candidates based on the feedback received, continuing until the correct number is guessed.

 This approach efficiently narrows down the possible candidates using feedback, ensuring the computer can guess the number in a reasonable number of attempts.
 */

/*
* It always starts with 1023!
 * Try with 1239.
 */

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int[] possibleNumbers = generatePossibleNumbers();
        boolean[] isPossible = new boolean[possibleNumbers.length];
        for (int i = 0; i < isPossible.length; i++) {
            isPossible[i] = true;
        }
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            int guess = -1;
            for (int i = 0; i < possibleNumbers.length; i++) {
                if (isPossible[i]) {
                    guess = possibleNumbers[i];
                    break;
                }
            }
            if (guess == -1) {
                System.out.println("Error: No possible numbers left. The feedback might be incorrect.");
                break;
            }

            System.out.println("Computer's guess: " + formatNumber(guess));
            attempts++;
            System.out.print("Enter the number of plus signs and minus signs (e.g., 1 2): ");
            int plus = scanner.nextInt();
            int minus = scanner.nextInt();

            if (plus == 4) {
                System.out.println("Computer won in " + attempts + " attempts!");
                break;
            }

            for (int i = 0; i < possibleNumbers.length; i++) {
                if (isPossible[i]) {
                    int[] feedback = calculateFeedback(guess, possibleNumbers[i]);
                    if (feedback[0] != plus || feedback[1] != minus) {
                        isPossible[i] = false;
                    }
                }
            }
        }
        scanner.close();
    }

    private static String formatNumber(int num) {
        return String.format("%04d", num);
    }

    private static int[] generatePossibleNumbers() {
        int[] numbers = new int[4536];
        int index = 0;
        for (int num = 1000; num <= 9999; num++) {
            if (hasUniqueDigits(num)) {
                numbers[index++] = num;
            }
        }
        return numbers;
    }

    private static boolean hasUniqueDigits(int num) {
        int[] digits = new int[4];
        digits[0] = num / 1000;
        digits[1] = (num / 100) % 10;
        digits[2] = (num / 10) % 10;
        digits[3] = num % 10;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (digits[i] == digits[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[] calculateFeedback(int guess, int candidate) {
        int[] guessDigits = getDigits(guess);
        int[] candidateDigits = getDigits(candidate);
        boolean[] usedGuess = new boolean[4];
        boolean[] usedCandidate = new boolean[4];
        int plus = 0;

        for (int i = 0; i < 4; i++) {
            if (guessDigits[i] == candidateDigits[i]) {
                plus++;
                usedGuess[i] = true;
                usedCandidate[i] = true;
            }
        }

        int minus = 0;
        for (int i = 0; i < 4; i++) {
            if (usedGuess[i]) continue;
            for (int j = 0; j < 4; j++) {
                if (!usedCandidate[j] && guessDigits[i] == candidateDigits[j]) {
                    minus++;
                    usedCandidate[j] = true;
                    break;
                }
            }
        }

        return new int[]{plus, minus};
    }

    private static int[] getDigits(int num) {
        return new int[]{
                num / 1000,
                (num / 100) % 10,
                (num / 10) % 10,
                num % 10
        };
    }
}