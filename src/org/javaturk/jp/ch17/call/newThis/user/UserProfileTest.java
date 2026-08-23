package org.javaturk.jp.ch17.call.newThis.user;

class UserProfileTest {

    public static void main(String[] args) {
        System.out.println("--- Testing UserProfile ---\n");

        // 1. Test using the direct constructor
        System.out.println("Creating profile via direct constructor:");
        UserProfile profile1 = new UserProfile("jdoe", "jane.doe@example.com");

        // 2. Test using the raw input constructor (The "Parsing" constructor)
        System.out.println("\nCreating profile via raw input string:");
        try {
            UserProfile profile2 = new UserProfile("sking:stephen.king@horror.com");
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating profile: " + e.getMessage());
        }

        // 3. Test with invalid input to see the exception handling
        System.out.println("\nCreating profile with invalid format:");
        try {
            UserProfile profile3 = new UserProfile("invalid_format_string");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
