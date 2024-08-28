package com.example.controller;

import com.example.login.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
/**
 *  @Controller 사용 시??
 * 스프링이 실행될때 스프링 컨테니어너가 통으로 뜨게되는데
 * 이 @Controller가 있으면 MemberController 객체를 생성해서 스프링이 넣어두고 관리를 한다
 */

/*
    💥private final MemberService memberService = new MemberService();
*
    MemberService를 new로 생성해서 사용가능하지만

    Spring을 사용 시 Spring이 관리를 하게되는데
    스프링 컨테이너로 받아서 쓰도록 변경해야한다.

    + new로 객체 생성 시 문제
    MemberController 말고도 다른 여러 컨트롤러에서 멤버 서비스를 가져다가 사용할 수 있다.
    하지만 이렇게 여러곳에서 여러번 생성하기 보다는
    Spring 컨테이너에 등록하고 사용하게되면은 딱 하나만 등록된다. + 이렇게 컨테이너에 등록 시 부가기능이 생긴다.
* */
    private final MemberService memberService;

    /**
     * 💥생성자에 @Autowired를 사용 시??
     * 스프링 컨테이너에 있는 MemberService를 가져다가 연결을 딱 시켜준다.
     * (MemberService도 스프링 컨테이너에 등록이 되어있어야 한다. (@Service:비즈니스로직을 적으면 된다.). 등록을 안하면 순수한 자바코드일 뿐이다.)
     *
     * 💥@Autowired를 사용 시 - 이게바로 DI 즉 의존관계를 주입해주는거다.
     * */
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


}
