package com.jgharris314.kendamaconnection.service;

import com.jgharris314.kendamaconnection.model.Member;
import com.jgharris314.kendamaconnection.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public Member getUser(String username) {
        return memberRepository.findByUsername(username);
    }

    public List<Member> getAllMembers(){
        List<Member> members = new ArrayList<Member>();
        memberRepository.findAll().forEach(member -> members.add(member));
        return members;
    }

    public Member createMember(Member member) {
        return memberRepository.save(new Member(member.getUsername()));
    }
}
