package com.example.demo;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CamelRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelRestApplication.class, args);
	}

	@Bean
    public ServletRegistrationBean camelServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(
                new CamelHttpTransportServlet(), "/camel/*");
        registration.setName("CamelServlet");
        return registration;
    }
}
