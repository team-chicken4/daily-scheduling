package com.example.scheduling.domain.user.service;

import com.example.scheduling.domain.user.entity.User;
import com.example.scheduling.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void builderTest() {
        User user = User
                .builder()
                .id(1L)
                .password("1234")
                .username("길기환")
                .email("khgil@github.com")
                .build();
        userRepository.save(user);
    }

    public void findTest(){
        List<User> users = userRepository.findAll();
        System.out.println("test : " + users);
    }
}
