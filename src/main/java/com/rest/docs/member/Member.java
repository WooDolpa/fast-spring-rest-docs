package com.rest.docs.member;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * file           : Member
 * author         : jwlee
 * date           : 2023-02-15
 * description    :
 */
@Entity
@Getter
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updateAt;

    public Member(String email, String name) {
        this.email = email;
        this.name = name;
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    public void modify(final String name) {
        this.name = name;
    }
}
