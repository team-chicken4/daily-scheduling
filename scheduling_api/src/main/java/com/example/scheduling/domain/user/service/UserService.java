package com.example.scheduling.domain.user.service;

import com.example.scheduling.domain.user.entity.User;
import com.example.scheduling.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
}
