/**
 * RussellClassService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eintern.training.soap.service;

public interface RussellClassService extends javax.xml.rpc.Service {
    public java.lang.String getRussellClassAddress();

    public com.eintern.training.soap.service.RussellClass getRussellClass() throws javax.xml.rpc.ServiceException;

    public com.eintern.training.soap.service.RussellClass getRussellClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
