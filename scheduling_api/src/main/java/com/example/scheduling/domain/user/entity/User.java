package com.example.scheduling.domain.user.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Builder
@AllArgsConstructor // 전체필드에 대한 생성자 만들어줌
@NoArgsConstructor  // 기본생성자 만들어줌
public class User {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "이름은 필수 입력 항목입니다.")
  //  @Pattern(regexp = "^[a-z0-9]{4,20}$", message = "아이디는 영어 소문자와 숫자만 사용하여 4~20자리여야 합니다.")
    @Column(nullable = false, unique = true)
    private String username;

    @NotEmpty(message = "비밀번호 입력은 필수 입니다.")
    @Size(min = 5, message = "비밀번호는 최소 5자 이상이어야 합니다.")
    @Column(nullable = false)
    private String password;

    @NotEmpty(message = "이메일은 필수 입력 항목입니다.")
    @Email(message = "이메일 형식에 맞지 않습니다.")
    @Column(nullable = false, unique = true)
    private String email;

    //  현재날짜 자동입력
    @CreatedDate
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd/HH:mm:ss")
    private LocalDateTime createdAt = LocalDateTime.now();

    //  수정날짜 자동입력
//    @CreatedDate
//    @Column(nullable = false)
//    @UpdateTimestamp(pattern = "yyyy-MM-dd/HH:mm:ss")
//    private LocalDateTime updateAt = LocalDateTime.now();
}
