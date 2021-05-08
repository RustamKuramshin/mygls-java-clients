/**
 * PrepareLabelsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class PrepareLabelsResponse  implements java.io.Serializable {
    private ParcelInfo[] parcelInfoList;

    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] prepareLabelsError;

    public PrepareLabelsResponse() {
    }

    public PrepareLabelsResponse(
           ParcelInfo[] parcelInfoList,
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] prepareLabelsError) {
           this.parcelInfoList = parcelInfoList;
           this.prepareLabelsError = prepareLabelsError;
    }


    /**
     * Gets the parcelInfoList value for this PrepareLabelsResponse.
     * 
     * @return parcelInfoList
     */
    public ParcelInfo[] getParcelInfoList() {
        return parcelInfoList;
    }


    /**
     * Sets the parcelInfoList value for this PrepareLabelsResponse.
     * 
     * @param parcelInfoList
     */
    public void setParcelInfoList(ParcelInfo[] parcelInfoList) {
        this.parcelInfoList = parcelInfoList;
    }


    /**
     * Gets the prepareLabelsError value for this PrepareLabelsResponse.
     * 
     * @return prepareLabelsError
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getPrepareLabelsError() {
        return prepareLabelsError;
    }


    /**
     * Sets the prepareLabelsError value for this PrepareLabelsResponse.
     * 
     * @param prepareLabelsError
     */
    public void setPrepareLabelsError(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] prepareLabelsError) {
        this.prepareLabelsError = prepareLabelsError;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PrepareLabelsResponse)) return false;
        PrepareLabelsResponse other = (PrepareLabelsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parcelInfoList==null && other.getParcelInfoList()==null) || 
             (this.parcelInfoList!=null &&
              java.util.Arrays.equals(this.parcelInfoList, other.getParcelInfoList()))) &&
            ((this.prepareLabelsError==null && other.getPrepareLabelsError()==null) || 
             (this.prepareLabelsError!=null &&
              java.util.Arrays.equals(this.prepareLabelsError, other.getPrepareLabelsError())));
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
        if (getParcelInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcelInfoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getParcelInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrepareLabelsError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrepareLabelsError());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPrepareLabelsError(), i);
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
        new org.apache.axis.description.TypeDesc(PrepareLabelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrepareLabelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepareLabelsError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrepareLabelsError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
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
