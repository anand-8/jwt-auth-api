package com.anand.jwt_auth_api.controller;

import com.anand.jwt_auth_api.dto.ProfileResponse;
import com.anand.jwt_auth_api.entity.User;
import com.anand.jwt_auth_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/profile")
    public ProfileResponse profile(
            Authentication authentication) {

        String email = authentication.getName();

        User user = userRepository
                .findByEmail(email)
                .orElseThrow();

        return new ProfileResponse(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getRole()
        );
    }
}