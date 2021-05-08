/**
 * PrintLabelsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class PrintLabelsResponse  implements java.io.Serializable {
    private byte[] labels;

    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] printLabelsErrorList;

    private PrintLabelsInfo[] printLabelsInfoList;

    private Integer testIdList;

    public PrintLabelsResponse() {
    }

    public PrintLabelsResponse(
           byte[] labels,
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] printLabelsErrorList,
           PrintLabelsInfo[] printLabelsInfoList,
           Integer testIdList) {
           this.labels = labels;
           this.printLabelsErrorList = printLabelsErrorList;
           this.printLabelsInfoList = printLabelsInfoList;
           this.testIdList = testIdList;
    }


    /**
     * Gets the labels value for this PrintLabelsResponse.
     * 
     * @return labels
     */
    public byte[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this PrintLabelsResponse.
     * 
     * @param labels
     */
    public void setLabels(byte[] labels) {
        this.labels = labels;
    }


    /**
     * Gets the printLabelsErrorList value for this PrintLabelsResponse.
     * 
     * @return printLabelsErrorList
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getPrintLabelsErrorList() {
        return printLabelsErrorList;
    }


    /**
     * Sets the printLabelsErrorList value for this PrintLabelsResponse.
     * 
     * @param printLabelsErrorList
     */
    public void setPrintLabelsErrorList(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] printLabelsErrorList) {
        this.printLabelsErrorList = printLabelsErrorList;
    }


    /**
     * Gets the printLabelsInfoList value for this PrintLabelsResponse.
     * 
     * @return printLabelsInfoList
     */
    public PrintLabelsInfo[] getPrintLabelsInfoList() {
        return printLabelsInfoList;
    }


    /**
     * Sets the printLabelsInfoList value for this PrintLabelsResponse.
     * 
     * @param printLabelsInfoList
     */
    public void setPrintLabelsInfoList(PrintLabelsInfo[] printLabelsInfoList) {
        this.printLabelsInfoList = printLabelsInfoList;
    }


    /**
     * Gets the testIdList value for this PrintLabelsResponse.
     * 
     * @return testIdList
     */
    public Integer getTestIdList() {
        return testIdList;
    }


    /**
     * Sets the testIdList value for this PrintLabelsResponse.
     * 
     * @param testIdList
     */
    public void setTestIdList(Integer testIdList) {
        this.testIdList = testIdList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PrintLabelsResponse)) return false;
        PrintLabelsResponse other = (PrintLabelsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            ((this.printLabelsErrorList==null && other.getPrintLabelsErrorList()==null) || 
             (this.printLabelsErrorList!=null &&
              java.util.Arrays.equals(this.printLabelsErrorList, other.getPrintLabelsErrorList()))) &&
            ((this.printLabelsInfoList==null && other.getPrintLabelsInfoList()==null) || 
             (this.printLabelsInfoList!=null &&
              java.util.Arrays.equals(this.printLabelsInfoList, other.getPrintLabelsInfoList()))) &&
            ((this.testIdList==null && other.getTestIdList()==null) || 
             (this.testIdList!=null &&
              this.testIdList.equals(other.getTestIdList())));
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
        if (getPrintLabelsErrorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintLabelsErrorList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPrintLabelsErrorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrintLabelsInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintLabelsInfoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPrintLabelsInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTestIdList() != null) {
            _hashCode += getTestIdList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintLabelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintLabelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printLabelsErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintLabelsErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printLabelsInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintLabelsInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintLabelsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintLabelsInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "TestIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
