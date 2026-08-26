package org.javaturk.jp.ch17.call.newThis.user;

class UserProfile {
    final String username;
    final String email;

    UserProfile(String newUsername, String newEmail) {
        username = newUsername;
        email = newEmail;
    }

    // Format: username:email
    UserProfile(String rawInput) {
        // 1. Logic BEFORE the this() call (The "Prologue")
        if (!rawInput.contains(":")) {
            throw new IllegalArgumentException("Format must be \"username:email\"");
        }

        int split = rawInput.indexOf(':');
        String name = rawInput.substring(0, split);
        String mail = rawInput.substring(split + 1);

        // 2. The explicit constructor call
        this(name, mail);

        // 3. Logic AFTER the this() call (The "Epilogue")
        System.out.println("Profile created for: " + name);
    }
}
