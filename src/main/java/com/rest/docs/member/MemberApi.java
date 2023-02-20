package com.rest.docs.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * file           : MemberApi
 * author         : jwlee
 * date           : 2023-02-20
 * description    :
 */
@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberApi {

    private final MemberRepository memberRepository;

    /**
     *  1. Member 단일 조회
     *  2. Member 생성
     *  3. Member 수정
     *  4. Member 페이징 조회
     */

    @GetMapping
    public void createMember(@RequestBody MemberSignUpRequest dto){

    }
}
