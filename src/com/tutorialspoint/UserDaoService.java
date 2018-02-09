/**
 * UserDaoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tutorialspoint;

public interface UserDaoService extends javax.xml.rpc.Service {
    public java.lang.String getUserDaoAddress();

    public com.tutorialspoint.UserDao getUserDao() throws javax.xml.rpc.ServiceException;

    public com.tutorialspoint.UserDao getUserDao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
