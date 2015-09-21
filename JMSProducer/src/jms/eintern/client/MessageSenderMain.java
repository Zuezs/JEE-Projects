package jms.eintern.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MessageSenderMain {

	public final static String WEBLOGIC_URL = "t3://localhost:7001";
	public final static String JNDI_FACTORY = "weblogic.jndi.WLInitialContextFactory";
	public final static String JMS_FACTORY = "jms/QCF";
	public final static String QUEUE = "jms/QueueTy";
	
	
	public static void main(String[] args) throws Exception {
		
		InitialContext ic = MessageSender.getInitialContext(JNDI_FACTORY, WEBLOGIC_URL);
		
		MessageSender ms = new MessageSender();
		ms.init(ic, JMS_FACTORY, QUEUE);
		ms.send("Hello Losers! What ya doing?");
		ms.close();
	}
	
}
