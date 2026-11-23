package com.anand.jwt_auth_api.controller;

import com.anand.jwt_auth_api.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

    private final JwtService jwtService;

    @GetMapping("/extract")
    public String extractEmail(
            @RequestParam String token) {

        return jwtService.extractEmail(token);
    }
}