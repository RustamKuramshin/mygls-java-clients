/**
 * Routing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData;

public class Routing  implements java.io.Serializable {
    private String depotNumber;

    private String depotSortingInfo;

    private String hubSortingInfo;

    public Routing() {
    }

    public Routing(
           String depotNumber,
           String depotSortingInfo,
           String hubSortingInfo) {
           this.depotNumber = depotNumber;
           this.depotSortingInfo = depotSortingInfo;
           this.hubSortingInfo = hubSortingInfo;
    }


    /**
     * Gets the depotNumber value for this Routing.
     * 
     * @return depotNumber
     */
    public String getDepotNumber() {
        return depotNumber;
    }


    /**
     * Sets the depotNumber value for this Routing.
     * 
     * @param depotNumber
     */
    public void setDepotNumber(String depotNumber) {
        this.depotNumber = depotNumber;
    }


    /**
     * Gets the depotSortingInfo value for this Routing.
     * 
     * @return depotSortingInfo
     */
    public String getDepotSortingInfo() {
        return depotSortingInfo;
    }


    /**
     * Sets the depotSortingInfo value for this Routing.
     * 
     * @param depotSortingInfo
     */
    public void setDepotSortingInfo(String depotSortingInfo) {
        this.depotSortingInfo = depotSortingInfo;
    }


    /**
     * Gets the hubSortingInfo value for this Routing.
     * 
     * @return hubSortingInfo
     */
    public String getHubSortingInfo() {
        return hubSortingInfo;
    }


    /**
     * Sets the hubSortingInfo value for this Routing.
     * 
     * @param hubSortingInfo
     */
    public void setHubSortingInfo(String hubSortingInfo) {
        this.hubSortingInfo = hubSortingInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Routing)) return false;
        Routing other = (Routing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depotNumber==null && other.getDepotNumber()==null) || 
             (this.depotNumber!=null &&
              this.depotNumber.equals(other.getDepotNumber()))) &&
            ((this.depotSortingInfo==null && other.getDepotSortingInfo()==null) || 
             (this.depotSortingInfo!=null &&
              this.depotSortingInfo.equals(other.getDepotSortingInfo()))) &&
            ((this.hubSortingInfo==null && other.getHubSortingInfo()==null) || 
             (this.hubSortingInfo!=null &&
              this.hubSortingInfo.equals(other.getHubSortingInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDepotNumber() != null) {
            _hashCode += getDepotNumber().hashCode();
        }
        if (getDepotSortingInfo() != null) {
            _hashCode += getDepotSortingInfo().hashCode();
        }
        if (getHubSortingInfo() != null) {
            _hashCode += getHubSortingInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Routing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Routing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DepotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depotSortingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DepotSortingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hubSortingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "HubSortingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
