//package com.d0uwhs.sbreacttodoserver.filter;
//
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class CORSFilter implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//        httpServletResponse.setHeader("Access-Control-Allow-Origin","*");
//        httpServletResponse.setHeader("Access-Control-Allow-Method","POST, GET, DELETE, PUT");
//        httpServletResponse.setHeader("Access-Control-Allow-Max-Age","3600");
//        httpServletResponse.setHeader("Access-Control-Allow-Headers","x-requested-with, origin, content-type, accept");
//        chain.doFilter(request, response);
//    }
//}
