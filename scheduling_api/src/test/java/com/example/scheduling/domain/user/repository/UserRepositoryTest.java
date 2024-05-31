package com.example.scheduling.domain.user.repository;

import com.example.scheduling.domain.user.entity.User;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hibernate.query.sqm.tree.SqmNode.log;

import java.util.List;


@DataJpaTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;


    @Test
    @DisplayName("회원 정보 저장")
    void saveTest(){
        User user = User.builder()
                .username("신동억")
                .password("1234")
                .email("AA@com")
                .build();

        User saveUser = userRepository.save(user);
        saveUser.getId();












    }


}