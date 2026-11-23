package com.anand.jwt_auth_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProfileResponse {

    private Long id;
    private String username;
    private String email;
    private String role;
}