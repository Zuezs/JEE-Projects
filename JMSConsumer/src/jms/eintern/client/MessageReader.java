package jms.eintern.client;

import java.util.Hashtable;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class MessageReader {

	private QueueConnectionFactory qconFactory;
	private QueueConnection qcon;
	private QueueSession qsession;
	private QueueReceiver qreceiver;
	private Queue queue;
	
	
	public void init(Context ctx, String jmsFactory, String queueName)throws NamingException, JMSException{
		
		//Lookup the JMS Factory with the JNDI name
		qconFactory = (QueueConnectionFactory)ctx.lookup(jmsFactory);
				
		//Create a connection object
		qcon = qconFactory.createQueueConnection();
				
		//Create a session object. Boolean is the transaction ON/OFF switch
		qsession = qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
				
		//Create a queue object
		queue = (Queue) ctx.lookup(queueName);
		
		//Create a receiver object
		qreceiver = qsession.createReceiver(queue);
		
		//Create a new JSM Listener instance
		JMSListener jmsListener = new JMSListener();
		
		//Create a jms receiver object
		qreceiver.setMessageListener(jmsListener);
		
		//Start the connection or IT WONT WORK
		qcon.start();
		
		
	}
	
	public void close() throws JMSException{
		qreceiver.close();
		qsession.close();
		qcon.close();
	}
		
	public static InitialContext getInitialContext(String jndiFactory, String weblogicURL)throws NamingException{
		
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, jndiFactory);
		env.put(Context.PROVIDER_URL, weblogicURL);
		
		return new InitialContext(env);
		
	}
	
}
