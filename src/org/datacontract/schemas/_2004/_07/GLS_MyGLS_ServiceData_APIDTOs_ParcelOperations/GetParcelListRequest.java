/**
 * GetParcelListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations;

public class GetParcelListRequest  extends org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.APIRequestBase  implements java.io.Serializable {
    private java.util.Calendar pickupDateFrom;

    private java.util.Calendar pickupDateTo;

    private java.util.Calendar printDateFrom;

    private java.util.Calendar printDateTo;

    public GetParcelListRequest() {
    }

    public GetParcelListRequest(
           int[] clientNumberList,
           byte[] password,
           String username,
           java.util.Calendar pickupDateFrom,
           java.util.Calendar pickupDateTo,
           java.util.Calendar printDateFrom,
           java.util.Calendar printDateTo) {
        super(
            clientNumberList,
            password,
            username);
        this.pickupDateFrom = pickupDateFrom;
        this.pickupDateTo = pickupDateTo;
        this.printDateFrom = printDateFrom;
        this.printDateTo = printDateTo;
    }


    /**
     * Gets the pickupDateFrom value for this GetParcelListRequest.
     * 
     * @return pickupDateFrom
     */
    public java.util.Calendar getPickupDateFrom() {
        return pickupDateFrom;
    }


    /**
     * Sets the pickupDateFrom value for this GetParcelListRequest.
     * 
     * @param pickupDateFrom
     */
    public void setPickupDateFrom(java.util.Calendar pickupDateFrom) {
        this.pickupDateFrom = pickupDateFrom;
    }


    /**
     * Gets the pickupDateTo value for this GetParcelListRequest.
     * 
     * @return pickupDateTo
     */
    public java.util.Calendar getPickupDateTo() {
        return pickupDateTo;
    }


    /**
     * Sets the pickupDateTo value for this GetParcelListRequest.
     * 
     * @param pickupDateTo
     */
    public void setPickupDateTo(java.util.Calendar pickupDateTo) {
        this.pickupDateTo = pickupDateTo;
    }


    /**
     * Gets the printDateFrom value for this GetParcelListRequest.
     * 
     * @return printDateFrom
     */
    public java.util.Calendar getPrintDateFrom() {
        return printDateFrom;
    }


    /**
     * Sets the printDateFrom value for this GetParcelListRequest.
     * 
     * @param printDateFrom
     */
    public void setPrintDateFrom(java.util.Calendar printDateFrom) {
        this.printDateFrom = printDateFrom;
    }


    /**
     * Gets the printDateTo value for this GetParcelListRequest.
     * 
     * @return printDateTo
     */
    public java.util.Calendar getPrintDateTo() {
        return printDateTo;
    }


    /**
     * Sets the printDateTo value for this GetParcelListRequest.
     * 
     * @param printDateTo
     */
    public void setPrintDateTo(java.util.Calendar printDateTo) {
        this.printDateTo = printDateTo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetParcelListRequest)) return false;
        GetParcelListRequest other = (GetParcelListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pickupDateFrom==null && other.getPickupDateFrom()==null) || 
             (this.pickupDateFrom!=null &&
              this.pickupDateFrom.equals(other.getPickupDateFrom()))) &&
            ((this.pickupDateTo==null && other.getPickupDateTo()==null) || 
             (this.pickupDateTo!=null &&
              this.pickupDateTo.equals(other.getPickupDateTo()))) &&
            ((this.printDateFrom==null && other.getPrintDateFrom()==null) || 
             (this.printDateFrom!=null &&
              this.printDateFrom.equals(other.getPrintDateFrom()))) &&
            ((this.printDateTo==null && other.getPrintDateTo()==null) || 
             (this.printDateTo!=null &&
              this.printDateTo.equals(other.getPrintDateTo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPickupDateFrom() != null) {
            _hashCode += getPickupDateFrom().hashCode();
        }
        if (getPickupDateTo() != null) {
            _hashCode += getPickupDateTo().hashCode();
        }
        if (getPrintDateFrom() != null) {
            _hashCode += getPrintDateFrom().hashCode();
        }
        if (getPrintDateTo() != null) {
            _hashCode += getPrintDateTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetParcelListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "GetParcelListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "PickupDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "PickupDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "PrintDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "PrintDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
