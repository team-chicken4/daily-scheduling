package com.example.scheduling.domain.controller;

import com.example.scheduling.domain.user.entity.User;
import com.example.scheduling.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public User signup(@RequestBody User user){
        return userService.save(user);
    }


}
