package com.example.scheduling.domain.user.service;

import com.example.scheduling.domain.user.entity.User;
import com.example.scheduling.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void builderTest() {
        User user = User
                .builder()
                .username("길기환")
                .email("khgil@github.com")
                .build();
    }
}
