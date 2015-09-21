package com.eintern.ejb.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.eintern.ejb.MessageBeanRemote;

public class MyClient {

	public static void main(String[] args) {
		
		 Properties props = new Properties();
		 
		props.put(Context.PROVIDER_URL, "t3://localhost:7001");
		props.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		
		try{
			
			Context ctx = new InitialContext(props);
			MessageBeanRemote stub = (MessageBeanRemote) ctx.lookup("MessageBean#com.eintern.ejb.MessageBeanRemote");
			
			System.out.println(stub.getMessage());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
