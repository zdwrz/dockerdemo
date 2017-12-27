package com.aweiz.dockerdemo;


import org.springframework.stereotype.Component;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class MyFilter implements Filter {

    public static final String THE_HEADER_NAME = "myHeader";

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        req = (HttpServletRequest)req;
        String value = ((HttpServletRequest) req).getHeader(THE_HEADER_NAME);
        UserContext.getUserContext().setUserHeader(value);
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {}

    @Override
    public void init(FilterConfig arg0) throws ServletException {}

}