package kr.ex.co.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RootController {
	
	private static final Logger logger = LoggerFactory.getLogger(RootController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Home(HttpServletRequest req) {
		logger.info("===============================================");
		logger.info("URI :" + req.getRequestURI());
		logger.info("===============================================");
		return new ModelAndView("index");
	}
}