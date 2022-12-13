package kr.ex.co.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public ModelAndView login (HttpServletRequest req) {
		logger.info("======================================================");
		logger.info("URI :" + req.getRequestURI());
		logger.info("======================================================");
		return new ModelAndView("jspviews/login/login");
	}
}
