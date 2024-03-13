package com.jgharris314.kendamaconnection.controller;

import com.jgharris314.kendamaconnection.model.Member;
import com.jgharris314.kendamaconnection.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    @Autowired
    MemberService memberService;

    @PostMapping("/new")
    @ResponseBody
    public ResponseEntity<Member> createMember(@RequestBody Member member){
        try {
            Member createdMember =  memberService.createMember(member);
            return new ResponseEntity<>(createdMember, HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<List<Member>> getAllMembers(){
        List<Member> members = memberService.getAllMembers();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

    @GetMapping("/username")
    @ResponseBody
    public ResponseEntity<Member> getMemberByUsername(@RequestParam String username){
        try {
            Member member = memberService.getUser(username);
            return new ResponseEntity<>(member, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
