package com.example.scheduling.domain.user.service;

import com.example.scheduling.domain.user.entity.User;
import com.example.scheduling.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.rmi.server.ExportException;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    // 회원 정보 저장
    public User save(User user){
        return userRepository.save(user);
    }
    // 회원 전체 조회
    public List<User> findAll(){
        return userRepository.findAll();
    }




//    @Transactional
//    //회원 정보 수정(특정값)
//    public void modify(Long id, String username){
//
//    }
}
