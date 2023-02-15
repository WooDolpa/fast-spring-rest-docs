package com.rest.docs.member;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * file           : MemberRepository
 * author         : jwlee
 * date           : 2023-02-15
 * description    :
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}
