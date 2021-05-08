/**
 * MasterDataService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class MasterDataService_ServiceLocator extends org.apache.axis.client.Service implements MasterDataService_Service {

    public MasterDataService_ServiceLocator() {
    }


    public MasterDataService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MasterDataService_ServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_MasterDataService
    private String BasicHttpBinding_MasterDataService_address = "https://api.test.mygls.hu/MasterDataService.svc/soap";

    public String getBasicHttpBinding_MasterDataServiceAddress() {
        return BasicHttpBinding_MasterDataService_address;
    }

    // The WSDD service name defaults to the port name.
    private String BasicHttpBinding_MasterDataServiceWSDDServiceName = "BasicHttpBinding_MasterDataService";

    public String getBasicHttpBinding_MasterDataServiceWSDDServiceName() {
        return BasicHttpBinding_MasterDataServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_MasterDataServiceWSDDServiceName(String name) {
        BasicHttpBinding_MasterDataServiceWSDDServiceName = name;
    }

    public MasterDataService_PortType getBasicHttpBinding_MasterDataService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_MasterDataService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_MasterDataService(endpoint);
    }

    public MasterDataService_PortType getBasicHttpBinding_MasterDataService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            BasicHttpBinding_MasterDataServiceStub _stub = new BasicHttpBinding_MasterDataServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_MasterDataServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_MasterDataServiceEndpointAddress(String address) {
        BasicHttpBinding_MasterDataService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MasterDataService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                BasicHttpBinding_MasterDataServiceStub _stub = new BasicHttpBinding_MasterDataServiceStub(new java.net.URL(BasicHttpBinding_MasterDataService_address), this);
                _stub.setPortName(getBasicHttpBinding_MasterDataServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
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
        String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_MasterDataService".equals(inputPortName)) {
            return getBasicHttpBinding_MasterDataService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "MasterDataService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_MasterDataService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_MasterDataService".equals(portName)) {
            setBasicHttpBinding_MasterDataServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
