package com.soap.wsdl.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.soap.wsdl.Add;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.Divide;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.Multiply;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.Subtract;
import com.soap.wsdl.SubtractResponse;

public class SoapClient extends WebServiceGatewaySupport{

	
	
	
	/**
	 * Metodo encargado de sumar dos numeros 
	 * @param numeroA
	 * @param numeroB
	 * @return addResponse
	 */
	public AddResponse getAddResponse (int numeroA, int numeroB) {
		
		Add addRequest = new Add();
		addRequest.setIntA(numeroA);
		addRequest.setIntB(numeroB);
		
		
		SoapActionCallback actionCallback= new SoapActionCallback("http://tempuri.org/Add");
		
		
		AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",addRequest,actionCallback);
		
		
		
		return addResponse;
	}
	
	/**
	 * Metodo encargado de restar dos numeros 
	 * @param numberA
	 * @param numberB
	 * @return subtractResponse
	 */
	
public SubtractResponse subtractResponse (int numberA, int numberB) {
    	
	Subtract subtractRequest = new Subtract();
	subtractRequest.setIntA(numberA);
	subtractRequest.setIntB(numberB);
	
	SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");
	
	SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",subtractRequest,soapActionCallback);
	
	return subtractResponse;
    }

/**
 * Metodo encargado de mulriplicar los numeros 
 * @param numberA
 * @param numberB
 * @return multiplyResponse
 */
public MultiplyResponse getMultiplyResponse(int numberA, int numberB) {
	
	
	Multiply multiplyRequest = new Multiply();
			 
	 multiplyRequest.setIntA(numberA);
	 multiplyRequest.setIntB(numberB);
	 
	 
	 SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");
	 
	 MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",multiplyRequest,soapActionCallback);
	 
	 return multiplyResponse;
	 

 }

/**
 * metodo q divide dos numeros 
 * @param numberA
 * @param numberB
 * @return divideResponse
 */

public DivideResponse  getDivideResponse(int numberA, int numberB) {
	
	
	Divide DivideRequest = new Divide();
			 
	DivideRequest.setIntA(numberA);
	DivideRequest.setIntB(numberB);
	 
	 
	 SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");
	 
	 DivideResponse divideResponse =  (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",DivideRequest,soapActionCallback);
	 
	 return divideResponse;
	 

 }

}
