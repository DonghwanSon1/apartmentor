package com.kh.apartmentor.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.apartmentor.member.model.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;

}
