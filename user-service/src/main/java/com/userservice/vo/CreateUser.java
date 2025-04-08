package com.userservice.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateUser {
    @NotNull(message = "이메일을 입력해주세요")
    @Size(min = 2, message = "더 길게")
    @Email
    private String email;

    @NotNull(message = "이름을 입력해주세요")
    @Size(min = 2, message = "더 길게")
    private String name;

    @NotNull(message = "비밀번호를 입력해주세요")
    @Size(min = 8, message = "더 길게")
    private String password;

    @NotNull(message = "주소를 입력해 주세요")
    private String address; // 주소

    @NotNull(message = "핸드폰 번호를 입력해주세요")
    private String phone; //전화번호

}
