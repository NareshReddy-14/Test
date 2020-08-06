package com.naresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naresh.model.Member;

public interface MemberRepository  extends JpaRepository<Member, Integer>{

}
