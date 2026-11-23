package com.anand.jwt_auth_api.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/dashboard")
    public String dashboard() {
        return "Welcome Admin";
    }
}