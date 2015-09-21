package com.eintern.soap.callback;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class PWCBHandler implements CallbackHandler{

	@Override
	public void handle(Callback[] arg0) throws IOException, UnsupportedCallbackException {
		
		for(Callback callback : arg0){
			WSPasswordCallback pwcb = (WSPasswordCallback) callback;
			
			if(pwcb.getIdentifier().equals("ty") && pwcb.getPassword().equals("p4$$w0rd")){
				return;
			}else{
				throw new UnsupportedCallbackException(callback, "Incorrect login/password");
			}
		}
	}

}
