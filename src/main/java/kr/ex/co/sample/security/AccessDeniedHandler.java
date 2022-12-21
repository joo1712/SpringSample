/**
 * 
 */
package kr.ex.co.sample.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;

import kr.ex.co.sample.security.AccessDeniedHandler;

/**
 * @author jxt30
 *
 */
public class AccessDeniedHandler implements org.springframework.security.web.access.AccessDeniedHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(AccessDeniedHandler.class);
	
	/* (non-Javadoc)
	 * @see org.springframework.security.web.access.AccessDeniedHandler#handle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.access.AccessDeniedException)
	 */
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException)
			throws IOException, ServletException {
		
		logger.error("Access Denied Handler ! ");
		
		logger.error("Redirect....");
		
		response.sendRedirect("/accessError");
		
	}

}
