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
import org.springframework.security.core.Authentication;

/**
 * @author jxt30
 *
 */
public class LogoutSuccessHandler implements org.springframework.security.web.authentication.logout.LogoutSuccessHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(LogoutSuccessHandler.class);
	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.logout.LogoutSuccessHandler#onLogoutSuccess(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
	 */
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
			throws IOException, ServletException {
		
		logger.warn("Logout Success !");
		if (auth != null && auth.getDetails() != null) {
			try {
				logger.info(">>"+ request.getSession());
				request.getSession().invalidate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		response.setStatus(HttpServletResponse.SC_OK);
		logger.warn("response.setStatus :" + HttpServletResponse.SC_OK);
		response.sendRedirect("/");
	}

}
