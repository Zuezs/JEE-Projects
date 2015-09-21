package com.eintern.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class MessageBean
 */
@Stateless(mappedName = "MessageBean")
public class MessageBean implements MessageBeanRemote {

    /**
     * Default constructor. 
     */
    public MessageBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "This is a message from my bean";
	}

}
