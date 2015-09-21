package com.eintern.training.soap.service;

public class RussellClassProxy implements com.eintern.training.soap.service.RussellClass {
  private String _endpoint = null;
  private com.eintern.training.soap.service.RussellClass russellClass = null;
  
  public RussellClassProxy() {
    _initRussellClassProxy();
  }
  
  public RussellClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initRussellClassProxy();
  }
  
  private void _initRussellClassProxy() {
    try {
      russellClass = (new com.eintern.training.soap.service.RussellClassServiceLocator()).getRussellClass();
      if (russellClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)russellClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)russellClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (russellClass != null)
      ((javax.xml.rpc.Stub)russellClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.eintern.training.soap.service.RussellClass getRussellClass() {
    if (russellClass == null)
      _initRussellClassProxy();
    return russellClass;
  }
  
  public java.lang.String getMessage() throws java.rmi.RemoteException{
    if (russellClass == null)
      _initRussellClassProxy();
    return russellClass.getMessage();
  }
  
  
}