/**
 * GetParcelListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations;

public class GetParcelListResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getParcelListErrors;

    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintDataInfo[] printDataInfoList;

    public GetParcelListResponse() {
    }

    public GetParcelListResponse(
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getParcelListErrors,
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintDataInfo[] printDataInfoList) {
           this.getParcelListErrors = getParcelListErrors;
           this.printDataInfoList = printDataInfoList;
    }


    /**
     * Gets the getParcelListErrors value for this GetParcelListResponse.
     * 
     * @return getParcelListErrors
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getGetParcelListErrors() {
        return getParcelListErrors;
    }


    /**
     * Sets the getParcelListErrors value for this GetParcelListResponse.
     * 
     * @param getParcelListErrors
     */
    public void setGetParcelListErrors(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getParcelListErrors) {
        this.getParcelListErrors = getParcelListErrors;
    }


    /**
     * Gets the printDataInfoList value for this GetParcelListResponse.
     * 
     * @return printDataInfoList
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintDataInfo[] getPrintDataInfoList() {
        return printDataInfoList;
    }


    /**
     * Sets the printDataInfoList value for this GetParcelListResponse.
     * 
     * @param printDataInfoList
     */
    public void setPrintDataInfoList(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.PrintDataInfo[] printDataInfoList) {
        this.printDataInfoList = printDataInfoList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetParcelListResponse)) return false;
        GetParcelListResponse other = (GetParcelListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getParcelListErrors==null && other.getGetParcelListErrors()==null) || 
             (this.getParcelListErrors!=null &&
              java.util.Arrays.equals(this.getParcelListErrors, other.getGetParcelListErrors()))) &&
            ((this.printDataInfoList==null && other.getPrintDataInfoList()==null) || 
             (this.printDataInfoList!=null &&
              java.util.Arrays.equals(this.printDataInfoList, other.getPrintDataInfoList())));
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
        if (getGetParcelListErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetParcelListErrors());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetParcelListErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrintDataInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintDataInfoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPrintDataInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(GetParcelListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "GetParcelListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getParcelListErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "GetParcelListErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printDataInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "PrintDataInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintDataInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintDataInfo"));
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
