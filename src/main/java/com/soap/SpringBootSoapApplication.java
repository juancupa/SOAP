package com.soap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.soap.wsdl.AddResponse;
import com.soap.wsdl.client.SoapClient;

@SpringBootApplication
public class SpringBootSoapApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}
	
	
	/*Metodo q se encarga de sumar dos metodos*/
	
	/*@Bean
	CommandLineRunner init(SoapClient soapClient) {
		
		
		return args ->{
			AddResponse addResponse = soapClient.getAddResponse(2, 2);
			
			LOGGER.info("el resultado de la suma es {} y {} es: {}",2,2, addResponse.getAddResult());
			
		};
	}*/
	

}
