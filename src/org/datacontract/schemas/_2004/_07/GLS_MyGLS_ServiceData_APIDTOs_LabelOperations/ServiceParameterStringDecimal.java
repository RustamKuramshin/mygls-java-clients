/**
 * ServiceParameterStringDecimal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class ServiceParameterStringDecimal  implements java.io.Serializable {
    private java.math.BigDecimal decimalValue;

    private String stringValue;

    public ServiceParameterStringDecimal() {
    }

    public ServiceParameterStringDecimal(
           java.math.BigDecimal decimalValue,
           String stringValue) {
           this.decimalValue = decimalValue;
           this.stringValue = stringValue;
    }


    /**
     * Gets the decimalValue value for this ServiceParameterStringDecimal.
     * 
     * @return decimalValue
     */
    public java.math.BigDecimal getDecimalValue() {
        return decimalValue;
    }


    /**
     * Sets the decimalValue value for this ServiceParameterStringDecimal.
     * 
     * @param decimalValue
     */
    public void setDecimalValue(java.math.BigDecimal decimalValue) {
        this.decimalValue = decimalValue;
    }


    /**
     * Gets the stringValue value for this ServiceParameterStringDecimal.
     * 
     * @return stringValue
     */
    public String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this ServiceParameterStringDecimal.
     * 
     * @param stringValue
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServiceParameterStringDecimal)) return false;
        ServiceParameterStringDecimal other = (ServiceParameterStringDecimal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.decimalValue==null && other.getDecimalValue()==null) || 
             (this.decimalValue!=null &&
              this.decimalValue.equals(other.getDecimalValue()))) &&
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue())));
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
        if (getDecimalValue() != null) {
            _hashCode += getDecimalValue().hashCode();
        }
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceParameterStringDecimal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ServiceParameterStringDecimal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decimalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "DecimalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "StringValue"));
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
