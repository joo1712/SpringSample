package kr.ex.co.sample.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/login")
	public void loginPage(String error, String logout, Model model) {
		logger.info("로그인 페이지");
		logger.info("err :" + error);
		logger.info("logout : " + logout);
		
		if(error != null) {
			model.addAttribute("error","로그인 실패");
		}
		
		if(logout != null) {
			model.addAttribute("logout","로그아웃");
		}
	}
	
	@RequestMapping(value="/login-processing", method=RequestMethod.POST)
	public void loginProcessing(String error) {
		logger.info("login-processing");
		logger.info("err : "+ error);
	}
	
	@RequestMapping("/member")
	public void doMember() {
		logger.info("멤버 로그인");
	}
	
	@RequestMapping("/admin")
	public void doAdmin() {
		logger.info("관리자 로그인");
	}
}
