package com.example.demo.resource;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class ApplicationResource extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		restConfiguration().component("servlet").port(8080).host("localhost").bindingMode(RestBindingMode.json);
		
		
//		rest("/api")
//        .get("/hello")
//            .to("direct:hello");
//
//    from("direct:hello")
//        .setBody(constant("Hello, World!"));
		rest()            
			.get("/hello")             
			.to("direct:hello"); 
		
		from("direct:hello") 
			.setBody(constant("Hello, World!"))
			.log("Success");
	}

}
