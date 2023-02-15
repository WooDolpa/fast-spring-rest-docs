package com.rest.docs;

import com.rest.docs.member.Member;
import com.rest.docs.member.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * file           : DataSetup
 * author         : jwlee
 * date           : 2023-02-15
 * description    :
 */
@Component
@AllArgsConstructor
public class DataSetup implements ApplicationRunner {

    private final MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        final List<Member> members = new ArrayList<>();

        members.add(new Member("lee@bbb.com", "lee"));
        members.add(new Member("park@bbb.com", "park"));
        members.add(new Member("hong@bbb.com", "hong"));

        memberRepository.saveAll(members);
    }
}
