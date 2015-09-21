package jms.eintern.client;

import javax.jms.*;



public class JMSListener implements MessageListener{

	
	public void onMessage(Message msg) {
		
		try{
			
			String msgText;
			
			//Make sure the message is a text type
			if(msg instanceof TextMessage){
				
				msgText = ((TextMessage)msg).getText();
				
			}else{
				
				msgText = msg.toString();
			}
			
			//Print out the message
			System.out.println("Message Received: " + msgText);
			
		}catch(JMSException jmse){
			jmse.getMessage();
		}
			
		
	}

}
