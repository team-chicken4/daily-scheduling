package com.example.scheduling.domain.user.dto;

import com.example.scheduling.domain.user.entity.User;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserRequestDto {

    private String username;
    private String password;
    private String email;

}
