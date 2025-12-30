package com.BugFix.freeLancing.user;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String login(String email, String password) {

        User user = userRepository
                .findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Email not found"));

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return "Login successful";
    }
}
