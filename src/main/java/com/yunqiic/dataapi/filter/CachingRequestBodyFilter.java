package com.yunqiic.dataapi.filter;

import com.yunqiic.dataapi.wrapper.CustomHttpServletRequestWrapper;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class CachingRequestBodyFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest currentRequest = (HttpServletRequest) servletRequest;
        CustomHttpServletRequestWrapper wrappedRequest = new CustomHttpServletRequestWrapper(currentRequest);

        chain.doFilter(wrappedRequest, servletResponse);
    }
}
