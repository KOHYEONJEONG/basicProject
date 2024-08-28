package com.example.login.service;

import com.example.login.repository.LoginRepository;
import com.example.login.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    /**
     * 💥MemberService는 MemberRepository가 필요하다.
     * MemberController -> MemberService -> MemberRepository
     * */
    @Autowired//@Autowired가 있으면 - 너는 MemberRepository가 필요하구나 해서 스프링 컨테이너에 있는 MemberRepository를 꺼내준다.
    public MemberService(MemberRepository memberRepository){
        //컨테이너에 있는 MemberRepository를 이렇게 딱 넣어준다.(스프링 컨테이너에 등록을 하면서 이 생성자를 호출하기 때문이다)
        //MemberRepository(인터페이스)의 구현체(MemoryMemberRepository)가 MemberService에 주입된다.
        this.memberRepository = memberRepository;
    }

}
