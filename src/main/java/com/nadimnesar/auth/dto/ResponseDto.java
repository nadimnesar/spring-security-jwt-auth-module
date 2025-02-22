package com.nadimnesar.auth.dto;

import com.nadimnesar.auth.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private String jwt;
    private String refreshToken;
    private UserRole userRole;
}