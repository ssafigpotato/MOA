package com.MOA.backend.domain.member.repository;

import com.MOA.backend.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByGroupGroupId(Long groupId);

    List<Member> findByUserUserId(Long userId);

    void deleteByGroupGroupIdAndUserUserId(Long groupId, Long userId);

    Boolean existsByUserUserId(Long userId);


}
