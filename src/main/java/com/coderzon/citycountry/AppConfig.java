package com.coderzon.citycountry;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

 @Bean
 public FilterRegistrationBean< LogFilter > filterRegistrationBean() {
  FilterRegistrationBean < LogFilter > registrationBean = new FilterRegistrationBean();
  LogFilter logFilter = new LogFilter();

  registrationBean.setFilter(logFilter);
  registrationBean.addUrlPatterns("/customers/*");
  registrationBean.setOrder(2); //set precedence
  return registrationBean;
 }
}