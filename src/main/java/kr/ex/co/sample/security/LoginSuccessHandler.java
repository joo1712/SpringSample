/**
 * 
 */
package kr.ex.co.sample.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @author jxt30
 *
 */
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	private static final Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);
	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AuthenticationSuccessHandler#onAuthenticationSuccess(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
			throws IOException, ServletException {
		
		logger.warn("Login Success");
		
		List<String> roleNames = new ArrayList<String>();
		
		auth.getAuthorities().forEach(AuthorityGranter -> {
			roleNames.add(AuthorityGranter.getAuthority());
		});
		
		logger.warn("ROLE NAMES :" + roleNames);
		
		if(roleNames.contains("ROLE_AMDIN") || roleNames.contains("ROLE_USER")) {
			response.sendRedirect("/");
			return;
		}
		
		response.sendRedirect("/user/loginPage");
	}
	
}
