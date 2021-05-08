/**
 * ModifyCODResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations;

public class ModifyCODResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] modifyCODError;

    private Boolean successful;

    public ModifyCODResponse() {
    }

    public ModifyCODResponse(
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] modifyCODError,
           Boolean successful) {
           this.modifyCODError = modifyCODError;
           this.successful = successful;
    }


    /**
     * Gets the modifyCODError value for this ModifyCODResponse.
     * 
     * @return modifyCODError
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getModifyCODError() {
        return modifyCODError;
    }


    /**
     * Sets the modifyCODError value for this ModifyCODResponse.
     * 
     * @param modifyCODError
     */
    public void setModifyCODError(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] modifyCODError) {
        this.modifyCODError = modifyCODError;
    }


    /**
     * Gets the successful value for this ModifyCODResponse.
     * 
     * @return successful
     */
    public Boolean getSuccessful() {
        return successful;
    }


    /**
     * Sets the successful value for this ModifyCODResponse.
     * 
     * @param successful
     */
    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ModifyCODResponse)) return false;
        ModifyCODResponse other = (ModifyCODResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modifyCODError==null && other.getModifyCODError()==null) || 
             (this.modifyCODError!=null &&
              java.util.Arrays.equals(this.modifyCODError, other.getModifyCODError()))) &&
            ((this.successful==null && other.getSuccessful()==null) || 
             (this.successful!=null &&
              this.successful.equals(other.getSuccessful())));
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
        if (getModifyCODError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifyCODError());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getModifyCODError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccessful() != null) {
            _hashCode += getSuccessful().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyCODResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ModifyCODResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyCODError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ModifyCODError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successful");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "Successful"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
