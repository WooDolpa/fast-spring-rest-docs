package com.rest.docs.member;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * file           : MemberSignUpRequest
 * author         : jwlee
 * date           : 2023-02-20
 * description    :
 */
@Getter
public class MemberSignUpRequest {

    @Email
    private String email;
    @NotEmpty
    private String name;

    public Member toEntity() {
        return new Member(email, name);
    }
}
