/**
 * ParcelService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ParcelService_ServiceLocator extends org.apache.axis.client.Service implements ParcelService_Service {

    public ParcelService_ServiceLocator() {
    }


    public ParcelService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ParcelService_ServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ParcelService
    private String BasicHttpBinding_ParcelService_address = "https://api.test.mygls.hu/ParcelService.svc/soap";

    public String getBasicHttpBinding_ParcelServiceAddress() {
        return BasicHttpBinding_ParcelService_address;
    }

    // The WSDD service name defaults to the port name.
    private String BasicHttpBinding_ParcelServiceWSDDServiceName = "BasicHttpBinding_ParcelService";

    public String getBasicHttpBinding_ParcelServiceWSDDServiceName() {
        return BasicHttpBinding_ParcelServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_ParcelServiceWSDDServiceName(String name) {
        BasicHttpBinding_ParcelServiceWSDDServiceName = name;
    }

    public ParcelService_PortType getBasicHttpBinding_ParcelService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ParcelService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ParcelService(endpoint);
    }

    public ParcelService_PortType getBasicHttpBinding_ParcelService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            BasicHttpBinding_ParcelServiceStub _stub = new BasicHttpBinding_ParcelServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ParcelServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ParcelServiceEndpointAddress(String address) {
        BasicHttpBinding_ParcelService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ParcelService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                BasicHttpBinding_ParcelServiceStub _stub = new BasicHttpBinding_ParcelServiceStub(new java.net.URL(BasicHttpBinding_ParcelService_address), this);
                _stub.setPortName(getBasicHttpBinding_ParcelServiceWSDDServiceName());
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
        if ("BasicHttpBinding_ParcelService".equals(inputPortName)) {
            return getBasicHttpBinding_ParcelService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "ParcelService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_ParcelService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ParcelService".equals(portName)) {
            setBasicHttpBinding_ParcelServiceEndpointAddress(address);
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
