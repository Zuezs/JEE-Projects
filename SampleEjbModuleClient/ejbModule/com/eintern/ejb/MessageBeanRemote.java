package com.eintern.ejb;

import javax.ejb.Remote;

@Remote
public interface MessageBeanRemote {
	public String getMessage();
	
}
