package kr.ex.co.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {

	private static Logger logger = LoggerFactory.getLogger(ErrorController.class);
	
	@RequestMapping("/error404")
	public String Error404(HttpServletRequest req, Model model) {
		logger.info("======================================================");
		logger.info("URI :" + req.getRequestURI());
		logger.info("======================================================");
		model.addAttribute("code", "ERROR_404");
		return "jspviews/error/404";
	}
	
	@RequestMapping("/error500")
	public String Error500(HttpServletRequest req, Model model) {
		logger.info("======================================================");
		logger.info("URI :" + req.getRequestURI());
		logger.info("======================================================");
		model.addAttribute("code", "ERROR_500");
		return "/error/500";
	}
}
