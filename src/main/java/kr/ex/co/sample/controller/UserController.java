package kr.ex.co.sample.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/login")
	public ModelAndView loginPage(HttpServletRequest req) {
		logger.info("===============================================");
		logger.info("login URI :" + req.getRequestURI());
		logger.info("===============================================");
		return new ModelAndView("/login/loginPage");
	}
	
	@RequestMapping("/register")
	public ModelAndView registerPage(HttpServletRequest req) {
		logger.info("===============================================");
		logger.info("register URI :" + req.getRequestURI());
		logger.info("===============================================");
		return new ModelAndView("/login/registerPage");
	}
	
	@RequestMapping("/forgotPw")
	public ModelAndView forgotPwPage(HttpServletRequest req) {
		logger.info("===============================================");
		logger.info("forgotPw URI :" + req.getRequestURI());
		logger.info("===============================================");
		return new ModelAndView("/login/forgotPwPage");
	}
}
