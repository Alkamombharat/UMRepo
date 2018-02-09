package com.tutorialspoint;

import java.rmi.RemoteException;

public class UserDaoProxy implements com.tutorialspoint.UserDao {
  private String _endpoint = null;
  private com.tutorialspoint.UserDao userDao = null;
  
  public UserDaoProxy() {
    _initUserDaoProxy();
  }
  
  public UserDaoProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserDaoProxy();
  }
  
  private void _initUserDaoProxy() {
    try {
      userDao = (new com.tutorialspoint.UserDaoServiceLocator()).getUserDao();
      if (userDao != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userDao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userDao)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userDao != null)
      ((javax.xml.rpc.Stub)userDao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.tutorialspoint.UserDao getUserDao() {
    if (userDao == null)
      _initUserDaoProxy();
    return userDao;
  }
  
  public com.tutorialspoint.User getUser(int id) throws RemoteException{
    if (userDao == null)
      _initUserDaoProxy();
    return userDao.getUser(id);
  }
  
  public int addUser(com.tutorialspoint.User pUser) throws RemoteException{
    if (userDao == null)
      _initUserDaoProxy();
    return userDao.addUser(pUser);
  }
  
  public int updateUser(com.tutorialspoint.User pUser) throws RemoteException{
    if (userDao == null)
      _initUserDaoProxy();
    return userDao.updateUser(pUser);
  }
  
  public int deleteUser(int id) throws RemoteException{
    if (userDao == null)
      _initUserDaoProxy();
    return userDao.deleteUser(id);
  }
  
  
}