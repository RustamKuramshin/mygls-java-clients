/**
 * GetPrintedLabelsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class GetPrintedLabelsResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getPrintedLabelsErrorList;

    private byte[] labels;

    private PrintDataInfo[] printDataInfoList;

    public GetPrintedLabelsResponse() {
    }

    public GetPrintedLabelsResponse(
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getPrintedLabelsErrorList,
           byte[] labels,
           PrintDataInfo[] printDataInfoList) {
           this.getPrintedLabelsErrorList = getPrintedLabelsErrorList;
           this.labels = labels;
           this.printDataInfoList = printDataInfoList;
    }


    /**
     * Gets the getPrintedLabelsErrorList value for this GetPrintedLabelsResponse.
     * 
     * @return getPrintedLabelsErrorList
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getGetPrintedLabelsErrorList() {
        return getPrintedLabelsErrorList;
    }


    /**
     * Sets the getPrintedLabelsErrorList value for this GetPrintedLabelsResponse.
     * 
     * @param getPrintedLabelsErrorList
     */
    public void setGetPrintedLabelsErrorList(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getPrintedLabelsErrorList) {
        this.getPrintedLabelsErrorList = getPrintedLabelsErrorList;
    }


    /**
     * Gets the labels value for this GetPrintedLabelsResponse.
     * 
     * @return labels
     */
    public byte[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this GetPrintedLabelsResponse.
     * 
     * @param labels
     */
    public void setLabels(byte[] labels) {
        this.labels = labels;
    }


    /**
     * Gets the printDataInfoList value for this GetPrintedLabelsResponse.
     * 
     * @return printDataInfoList
     */
    public PrintDataInfo[] getPrintDataInfoList() {
        return printDataInfoList;
    }


    /**
     * Sets the printDataInfoList value for this GetPrintedLabelsResponse.
     * 
     * @param printDataInfoList
     */
    public void setPrintDataInfoList(PrintDataInfo[] printDataInfoList) {
        this.printDataInfoList = printDataInfoList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetPrintedLabelsResponse)) return false;
        GetPrintedLabelsResponse other = (GetPrintedLabelsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPrintedLabelsErrorList==null && other.getGetPrintedLabelsErrorList()==null) || 
             (this.getPrintedLabelsErrorList!=null &&
              java.util.Arrays.equals(this.getPrintedLabelsErrorList, other.getGetPrintedLabelsErrorList()))) &&
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
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
        if (getGetPrintedLabelsErrorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetPrintedLabelsErrorList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetPrintedLabelsErrorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLabels(), i);
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
        new org.apache.axis.description.TypeDesc(GetPrintedLabelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "GetPrintedLabelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPrintedLabelsErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "GetPrintedLabelsErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
