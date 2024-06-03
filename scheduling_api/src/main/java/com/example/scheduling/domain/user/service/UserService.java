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

    public User save(User user){
        return userRepository.save(user);
    }

    public void findTest(){
        List<User> users = userRepository.findAll();
        System.out.println("test : " + users);
    }
}
