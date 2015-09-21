package com.eintern.service.client;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.client.Options;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import com.eintern.training.soap.service.RussellSecureServiceStub;
import com.eintern.training.soap.service.RussellSecureServiceStub.AddInts;
import com.eintern.training.soap.service.RussellSecureServiceStub.AddIntsResponse;
import com.eintern.training.soap.service.RussellSecureServiceStub.ProcessMessage;
import com.eintern.training.soap.service.RussellSecureServiceStub.ProcessMessageResponse;

public class ServiceClient {

	public static void main(String[] args) {
		
		ConfigurationContext ctx = null;
		RussellSecureServiceStub stub = null;
		org.apache.axis2.client.ServiceClient client = null;
		
		try{
			ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem("C:\\Program Files\\Apache\\axis2-1.6.1\\repository\\");
			stub = new RussellSecureServiceStub(ctx, "http://192.168.60.91:8080/WSSecurityServiceDemo/services/RussellSecureService");
			client = stub._getServiceClient();
			
			Options ops = client.getOptions();
			ops.setUserName("russell");
			ops.setPassword("p4ssw0rd");
			client.engageModule("rampart");
			
			OMFactory omFactory = OMAbstractFactory.getOMFactory();
			OMElement omSecurityElement = omFactory.createOMElement(new QName( "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
												"Security", "wsse"), null);
			
			OMElement omusertoken = omFactory.createOMElement(new QName(null, "wsse:UsernameToken", "wsse"), null);
			
			OMElement omuserName = omFactory.createOMElement(new QName("", "wsse:Username", "wsse"), null);
			omuserName.setText("russell");
			
			OMElement omPassword = omFactory.createOMElement(new QName("", "wsse:Password", "wsse"), null);
			omPassword.setText("p4ssw0rd");
			
			omusertoken.addChild(omuserName);
			omusertoken.addChild(omPassword);
			omSecurityElement.addChild(omusertoken);
			client.addHeader(omSecurityElement);
			
			AddInts input = new AddInts();
			input.setVar1(1);
			input.setVar2(2);
			
			AddIntsResponse response = stub.addInts(input);
			
			System.out.println(input.getVar1() + " + " +
								input.getVar2() + " = " +
								response.get_return());
			
		ProcessMessage msg = new ProcessMessage();
		msg.setMessage("Helllo, Russell");
		ProcessMessageResponse resp = stub.processMessage(msg);
		
		System.out.println(resp.get_return());
			
		}catch(Exception e){
			
			try{
				System.out.println(client.getLastOperationContext().getMessageContext("Out").getEnvelope().toString());
			}catch(Exception z){
				z.printStackTrace();
			}
			
			e.printStackTrace();
		}
	}
	
	
}
