/**
 * ParcelInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class ParcelInfo  implements java.io.Serializable {
    private String clientReference;

    private Integer parcelId;

    public ParcelInfo() {
    }

    public ParcelInfo(
           String clientReference,
           Integer parcelId) {
           this.clientReference = clientReference;
           this.parcelId = parcelId;
    }


    /**
     * Gets the clientReference value for this ParcelInfo.
     * 
     * @return clientReference
     */
    public String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this ParcelInfo.
     * 
     * @param clientReference
     */
    public void setClientReference(String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the parcelId value for this ParcelInfo.
     * 
     * @return parcelId
     */
    public Integer getParcelId() {
        return parcelId;
    }


    /**
     * Sets the parcelId value for this ParcelInfo.
     * 
     * @param parcelId
     */
    public void setParcelId(Integer parcelId) {
        this.parcelId = parcelId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ParcelInfo)) return false;
        ParcelInfo other = (ParcelInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            ((this.parcelId==null && other.getParcelId()==null) || 
             (this.parcelId!=null &&
              this.parcelId.equals(other.getParcelId())));
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
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        if (getParcelId() != null) {
            _hashCode += getParcelId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParcelInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ClientReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
