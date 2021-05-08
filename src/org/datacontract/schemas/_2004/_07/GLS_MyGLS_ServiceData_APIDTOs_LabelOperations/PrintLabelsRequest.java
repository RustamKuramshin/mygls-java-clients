/**
 * PrintLabelsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class PrintLabelsRequest  extends org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.APIRequestBase  implements java.io.Serializable {
    private Parcel[] parcelList;

    private Integer printPosition;

    private Boolean showPrintDialog;

    private Integer testId;

    public PrintLabelsRequest() {
    }

    public PrintLabelsRequest(
           int[] clientNumberList,
           byte[] password,
           String username,
           Parcel[] parcelList,
           Integer printPosition,
           Boolean showPrintDialog,
           Integer testId) {
        super(
            clientNumberList,
            password,
            username);
        this.parcelList = parcelList;
        this.printPosition = printPosition;
        this.showPrintDialog = showPrintDialog;
        this.testId = testId;
    }


    /**
     * Gets the parcelList value for this PrintLabelsRequest.
     * 
     * @return parcelList
     */
    public Parcel[] getParcelList() {
        return parcelList;
    }


    /**
     * Sets the parcelList value for this PrintLabelsRequest.
     * 
     * @param parcelList
     */
    public void setParcelList(Parcel[] parcelList) {
        this.parcelList = parcelList;
    }


    /**
     * Gets the printPosition value for this PrintLabelsRequest.
     * 
     * @return printPosition
     */
    public Integer getPrintPosition() {
        return printPosition;
    }


    /**
     * Sets the printPosition value for this PrintLabelsRequest.
     * 
     * @param printPosition
     */
    public void setPrintPosition(Integer printPosition) {
        this.printPosition = printPosition;
    }


    /**
     * Gets the showPrintDialog value for this PrintLabelsRequest.
     * 
     * @return showPrintDialog
     */
    public Boolean getShowPrintDialog() {
        return showPrintDialog;
    }


    /**
     * Sets the showPrintDialog value for this PrintLabelsRequest.
     * 
     * @param showPrintDialog
     */
    public void setShowPrintDialog(Boolean showPrintDialog) {
        this.showPrintDialog = showPrintDialog;
    }


    /**
     * Gets the testId value for this PrintLabelsRequest.
     * 
     * @return testId
     */
    public Integer getTestId() {
        return testId;
    }


    /**
     * Sets the testId value for this PrintLabelsRequest.
     * 
     * @param testId
     */
    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PrintLabelsRequest)) return false;
        PrintLabelsRequest other = (PrintLabelsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parcelList==null && other.getParcelList()==null) || 
             (this.parcelList!=null &&
              java.util.Arrays.equals(this.parcelList, other.getParcelList()))) &&
            ((this.printPosition==null && other.getPrintPosition()==null) || 
             (this.printPosition!=null &&
              this.printPosition.equals(other.getPrintPosition()))) &&
            ((this.showPrintDialog==null && other.getShowPrintDialog()==null) || 
             (this.showPrintDialog!=null &&
              this.showPrintDialog.equals(other.getShowPrintDialog()))) &&
            ((this.testId==null && other.getTestId()==null) || 
             (this.testId!=null &&
              this.testId.equals(other.getTestId())));
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
        if (getParcelList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcelList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getParcelList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrintPosition() != null) {
            _hashCode += getPrintPosition().hashCode();
        }
        if (getShowPrintDialog() != null) {
            _hashCode += getShowPrintDialog().hashCode();
        }
        if (getTestId() != null) {
            _hashCode += getTestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintLabelsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintLabelsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Parcel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Parcel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showPrintDialog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ShowPrintDialog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "TestId"));
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
