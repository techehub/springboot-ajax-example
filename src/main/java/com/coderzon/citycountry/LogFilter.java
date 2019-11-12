package com.coderzon.citycountry;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class LogFilter implements Filter {
 
	private static final Logger LOGGER = LoggerFactory.getLogger(MyConytroller.class);
	
    @Override
    public void doFilter(
      ServletRequest request, 
      ServletResponse response, 
      FilterChain chain) throws IOException, ServletException {
  
        HttpServletRequest req = (HttpServletRequest) request;
        LOGGER.info("#########################################################");
        LOGGER.info("Logging Request  {} : {}", ((HttpServletRequest)request).getMethod(), ((HttpServletRequest)request).getRequestURI());

        //call next filter in the filter chain
        chain.doFilter(request, response);

        LOGGER.info("Logging Response :{}", response.getContentType());
        LOGGER.info("Logging Response :{}", response.toString());
 
        LOGGER.info("#########################################################");
        
    // other methods 
}
    
}