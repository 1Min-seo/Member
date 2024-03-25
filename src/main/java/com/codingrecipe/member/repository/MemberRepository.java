package com.codingrecipe.member.repository;

import com.codingrecipe.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//어떤 entity 클래스를 받을 것인가, entity 클래스의 pk 타입
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일로 회원 정보 조회 (select * from member_table where member_email=?)
    //Optinal : null 방지
    Optional<MemberEntity> findByMemberEmail(String memberEmail);
    //모든 Repository에서 주고받는 객체들은 entity
}