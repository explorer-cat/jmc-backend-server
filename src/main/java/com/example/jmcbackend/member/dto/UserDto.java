package com.example.jmcbackend.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDto {
    private String userId;
    private String userName;
    private String userNickname;
    private LocalDateTime regDt;
    private String password;
}
