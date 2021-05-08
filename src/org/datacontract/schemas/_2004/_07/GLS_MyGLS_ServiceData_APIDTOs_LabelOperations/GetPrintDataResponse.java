/**
 * GetPrintDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class GetPrintDataResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getPrintDataErrorList;

    private PrintDataInfo[] printDataInfoList;

    public GetPrintDataResponse() {
    }

    public GetPrintDataResponse(
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getPrintDataErrorList,
           PrintDataInfo[] printDataInfoList) {
           this.getPrintDataErrorList = getPrintDataErrorList;
           this.printDataInfoList = printDataInfoList;
    }


    /**
     * Gets the getPrintDataErrorList value for this GetPrintDataResponse.
     * 
     * @return getPrintDataErrorList
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getGetPrintDataErrorList() {
        return getPrintDataErrorList;
    }


    /**
     * Sets the getPrintDataErrorList value for this GetPrintDataResponse.
     * 
     * @param getPrintDataErrorList
     */
    public void setGetPrintDataErrorList(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getPrintDataErrorList) {
        this.getPrintDataErrorList = getPrintDataErrorList;
    }


    /**
     * Gets the printDataInfoList value for this GetPrintDataResponse.
     * 
     * @return printDataInfoList
     */
    public PrintDataInfo[] getPrintDataInfoList() {
        return printDataInfoList;
    }


    /**
     * Sets the printDataInfoList value for this GetPrintDataResponse.
     * 
     * @param printDataInfoList
     */
    public void setPrintDataInfoList(PrintDataInfo[] printDataInfoList) {
        this.printDataInfoList = printDataInfoList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetPrintDataResponse)) return false;
        GetPrintDataResponse other = (GetPrintDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPrintDataErrorList==null && other.getGetPrintDataErrorList()==null) || 
             (this.getPrintDataErrorList!=null &&
              java.util.Arrays.equals(this.getPrintDataErrorList, other.getGetPrintDataErrorList()))) &&
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
        if (getGetPrintDataErrorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetPrintDataErrorList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetPrintDataErrorList(), i);
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
        new org.apache.axis.description.TypeDesc(GetPrintDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "GetPrintDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPrintDataErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "GetPrintDataErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printDataInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintDataInfoList"));
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
