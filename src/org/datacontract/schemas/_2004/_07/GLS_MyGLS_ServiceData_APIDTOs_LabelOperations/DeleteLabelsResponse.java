/**
 * DeleteLabelsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class DeleteLabelsResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] deleteLabelsErrorList;

    private SuccessfullyDeleted[] successfullyDeletedList;

    public DeleteLabelsResponse() {
    }

    public DeleteLabelsResponse(
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] deleteLabelsErrorList,
           SuccessfullyDeleted[] successfullyDeletedList) {
           this.deleteLabelsErrorList = deleteLabelsErrorList;
           this.successfullyDeletedList = successfullyDeletedList;
    }


    /**
     * Gets the deleteLabelsErrorList value for this DeleteLabelsResponse.
     * 
     * @return deleteLabelsErrorList
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getDeleteLabelsErrorList() {
        return deleteLabelsErrorList;
    }


    /**
     * Sets the deleteLabelsErrorList value for this DeleteLabelsResponse.
     * 
     * @param deleteLabelsErrorList
     */
    public void setDeleteLabelsErrorList(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] deleteLabelsErrorList) {
        this.deleteLabelsErrorList = deleteLabelsErrorList;
    }


    /**
     * Gets the successfullyDeletedList value for this DeleteLabelsResponse.
     * 
     * @return successfullyDeletedList
     */
    public SuccessfullyDeleted[] getSuccessfullyDeletedList() {
        return successfullyDeletedList;
    }


    /**
     * Sets the successfullyDeletedList value for this DeleteLabelsResponse.
     * 
     * @param successfullyDeletedList
     */
    public void setSuccessfullyDeletedList(SuccessfullyDeleted[] successfullyDeletedList) {
        this.successfullyDeletedList = successfullyDeletedList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeleteLabelsResponse)) return false;
        DeleteLabelsResponse other = (DeleteLabelsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteLabelsErrorList==null && other.getDeleteLabelsErrorList()==null) || 
             (this.deleteLabelsErrorList!=null &&
              java.util.Arrays.equals(this.deleteLabelsErrorList, other.getDeleteLabelsErrorList()))) &&
            ((this.successfullyDeletedList==null && other.getSuccessfullyDeletedList()==null) || 
             (this.successfullyDeletedList!=null &&
              java.util.Arrays.equals(this.successfullyDeletedList, other.getSuccessfullyDeletedList())));
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
        if (getDeleteLabelsErrorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeleteLabelsErrorList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeleteLabelsErrorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccessfullyDeletedList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessfullyDeletedList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSuccessfullyDeletedList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteLabelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "DeleteLabelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteLabelsErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "DeleteLabelsErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successfullyDeletedList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "SuccessfullyDeletedList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "SuccessfullyDeleted"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "SuccessfullyDeleted"));
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
