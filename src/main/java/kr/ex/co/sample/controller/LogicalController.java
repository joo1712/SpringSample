package kr.ex.co.sample.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/logical")
public class LogicalController {

	private static final Logger logger = LoggerFactory.getLogger(LogicalController.class);
	
	@RequestMapping("/chart")
	public ModelAndView chartMain(HttpServletRequest req) {
		logger.info("===============================================");
		logger.info("chart URI :" + req.getRequestURI());
		logger.info("===============================================");
		return new ModelAndView("/logical/chart");
	}
	
	@RequestMapping("/boardList")
	public ModelAndView boardList(HttpServletRequest req) {
		logger.info("===============================================");
		logger.info("boardList URI :" + req.getRequestURI());
		logger.info("===============================================");
		return new ModelAndView("/logical/boardList");
	} 
}
