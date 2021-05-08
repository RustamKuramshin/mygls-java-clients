/**
 * CachedResponseBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common;

public class CachedResponseBase  extends ResponseBase  implements java.io.Serializable {
    private Boolean isChanged;

    private java.util.Calendar lastUpdateTime;

    public CachedResponseBase() {
    }

    public CachedResponseBase(
           Integer errorCode,
           String errorDescription,
           Boolean isChanged,
           java.util.Calendar lastUpdateTime) {
        super(
            errorCode,
            errorDescription);
        this.isChanged = isChanged;
        this.lastUpdateTime = lastUpdateTime;
    }


    /**
     * Gets the isChanged value for this CachedResponseBase.
     * 
     * @return isChanged
     */
    public Boolean getIsChanged() {
        return isChanged;
    }


    /**
     * Sets the isChanged value for this CachedResponseBase.
     * 
     * @param isChanged
     */
    public void setIsChanged(Boolean isChanged) {
        this.isChanged = isChanged;
    }


    /**
     * Gets the lastUpdateTime value for this CachedResponseBase.
     * 
     * @return lastUpdateTime
     */
    public java.util.Calendar getLastUpdateTime() {
        return lastUpdateTime;
    }


    /**
     * Sets the lastUpdateTime value for this CachedResponseBase.
     * 
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(java.util.Calendar lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CachedResponseBase)) return false;
        CachedResponseBase other = (CachedResponseBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isChanged==null && other.getIsChanged()==null) || 
             (this.isChanged!=null &&
              this.isChanged.equals(other.getIsChanged()))) &&
            ((this.lastUpdateTime==null && other.getLastUpdateTime()==null) || 
             (this.lastUpdateTime!=null &&
              this.lastUpdateTime.equals(other.getLastUpdateTime())));
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
        if (getIsChanged() != null) {
            _hashCode += getIsChanged().hashCode();
        }
        if (getLastUpdateTime() != null) {
            _hashCode += getLastUpdateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CachedResponseBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "CachedResponseBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "IsChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "LastUpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
