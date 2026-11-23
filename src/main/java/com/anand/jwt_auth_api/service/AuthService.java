package com.anand.jwt_auth_api.service;

import com.anand.jwt_auth_api.dto.LoginRequest;
import com.anand.jwt_auth_api.dto.LoginResponse;
import com.anand.jwt_auth_api.dto.RegisterRequest;
import com.anand.jwt_auth_api.entity.User;
import com.anand.jwt_auth_api.repository.UserRepository;
import com.anand.jwt_auth_api.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public String register(RegisterRequest request) {

        if(userRepository.existsByEmail(request.getEmail())) {
            return "Email already exists";
        }

        User user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role("USER")
                .build();

        userRepository.save(user);

        return "User registered successfully";
    }

    public LoginResponse login(LoginRequest request) {

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new RuntimeException("User not found"));

        boolean matches =
                passwordEncoder.matches(
                        request.getPassword(),
                        user.getPassword());

        if (!matches) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtService.generateToken(user.getEmail());

        return new LoginResponse(token);
    }
}