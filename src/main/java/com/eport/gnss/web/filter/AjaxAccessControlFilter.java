package com.eport.gnss.web.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;

public class AjaxAccessControlFilter extends AccessControlFilter {
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
		if (isLoginRequest(request, response)) {
			return true;
		} else {
			Subject subject = getSubject(request, response);
			// If principal is not null, then the user is known and should be
			// allowed access.
			return subject.getPrincipal() != null;
		}
	}

	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		try {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			if (!"XMLHttpRequest".equalsIgnoreCase(httpRequest.getHeader("X-Requested-With"))) {
				if (httpRequest.getRequestURL().toString().contains(".json"))
					response.getWriter().write("{\"result\":false,\"message\": \"not login\"}");
				else
					saveRequestAndRedirectToLogin(request, response);
			}
			else
				response.getWriter().append("SC_UNAUTHORIZED");
				//WebUtils.toHttp(response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
		} catch (Exception e) {
			saveRequestAndRedirectToLogin(request, response);
		}
		return false;
	}
}
