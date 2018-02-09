/**
 * UserDaoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tutorialspoint;

public class UserDaoServiceLocator extends org.apache.axis.client.Service implements com.tutorialspoint.UserDaoService {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7405738933918310594L;

	public UserDaoServiceLocator() {
    }


    public UserDaoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserDaoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserDao
    private java.lang.String UserDao_address = "http://localhost:8080/UserManagementWsdlSoapService/services/UserDao";

    public java.lang.String getUserDaoAddress() {
        return UserDao_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserDaoWSDDServiceName = "UserDao";

    public java.lang.String getUserDaoWSDDServiceName() {
        return UserDaoWSDDServiceName;
    }

    public void setUserDaoWSDDServiceName(java.lang.String name) {
        UserDaoWSDDServiceName = name;
    }

    public com.tutorialspoint.UserDao getUserDao() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserDao_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserDao(endpoint);
    }

    public com.tutorialspoint.UserDao getUserDao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tutorialspoint.UserDaoSoapBindingStub _stub = new com.tutorialspoint.UserDaoSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserDaoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserDaoEndpointAddress(java.lang.String address) {
        UserDao_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.tutorialspoint.UserDao.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tutorialspoint.UserDaoSoapBindingStub _stub = new com.tutorialspoint.UserDaoSoapBindingStub(new java.net.URL(UserDao_address), this);
                _stub.setPortName(getUserDaoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserDao".equals(inputPortName)) {
            return getUserDao();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tutorialspoint.com", "UserDaoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tutorialspoint.com", "UserDao"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserDao".equals(portName)) {
            setUserDaoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
