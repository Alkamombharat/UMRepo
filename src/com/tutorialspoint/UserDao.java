/**
 * UserDao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tutorialspoint;

public interface UserDao extends java.rmi.Remote {
    public com.tutorialspoint.User getUser(int id) throws java.rmi.RemoteException;
    public int addUser(com.tutorialspoint.User pUser) throws java.rmi.RemoteException;
    public int updateUser(com.tutorialspoint.User pUser) throws java.rmi.RemoteException;
    public int deleteUser(int id) throws java.rmi.RemoteException;
}
