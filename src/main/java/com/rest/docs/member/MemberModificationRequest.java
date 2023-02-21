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
public class MemberModificationRequest {
    @NotEmpty
    private String name;
}
