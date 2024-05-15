package com.soap.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soap.wsdl.AddResponse;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.SubtractResponse;
import com.soap.wsdl.client.SoapClient;

@RestController
@RequestMapping("/soap")
public class SoapController {
	
	
	@Autowired
	private SoapClient soapClient;
	
	
	@PostMapping("/sumar")
	public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB){
		
		Map<String, Integer> response = new HashMap<>();
		
		
	AddResponse addResponse=	soapClient.getAddResponse(numberA, numberB);
	
	response.put("resultado", addResponse.getAddResult());
	return ResponseEntity.ok().body(response);
		
	}
	
	@PostMapping("/restar")
	public ResponseEntity<?> subtract(@RequestParam int numberA, @RequestParam int numberB){
		
		
		Map<String, Integer> response = new HashMap<>();
		SubtractResponse subtractResponse = soapClient.subtractResponse(numberA, numberB);
		
		response.put("resultado",subtractResponse.getSubtractResult());
		
		return ResponseEntity.ok().body(response);
	}
	
	
	@PostMapping("/multiplicar")
	public ResponseEntity<?> multiply(@RequestParam int numberA, @RequestParam int numberB){
		
		Map<String, Integer> response = new HashMap<>();
		
		MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(numberA, numberB);
		
		response.put("resultado",multiplyResponse.getMultiplyResult());
		return ResponseEntity.ok().body(response);
		
	}
	
	@PostMapping("/dividir")
	public ResponseEntity<?> divide(@RequestParam int numberA, @RequestParam int numberB){
		Map<String, Integer> response = new HashMap<>();
		
		DivideResponse divideResponse= soapClient.getDivideResponse(numberA, numberB);
		
		response.put("resultado",divideResponse.getDivideResult());
		return ResponseEntity.ok().body(response);
		
	}

}
