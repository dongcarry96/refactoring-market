package com.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String email;
    private String name;
    private String password; // 비밀번호
    private String userId;
    private String address; // 주소
    private String phone; //전화번호
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
