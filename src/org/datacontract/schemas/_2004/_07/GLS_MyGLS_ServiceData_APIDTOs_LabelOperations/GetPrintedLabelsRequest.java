/**
 * GetPrintedLabelsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class GetPrintedLabelsRequest  extends org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.APIRequestBase  implements java.io.Serializable {
    private int[] parcelIdList;

    private Integer printPosition;

    private Boolean showPrintDialog;

    public GetPrintedLabelsRequest() {
    }

    public GetPrintedLabelsRequest(
           int[] clientNumberList,
           byte[] password,
           String username,
           int[] parcelIdList,
           Integer printPosition,
           Boolean showPrintDialog) {
        super(
            clientNumberList,
            password,
            username);
        this.parcelIdList = parcelIdList;
        this.printPosition = printPosition;
        this.showPrintDialog = showPrintDialog;
    }


    /**
     * Gets the parcelIdList value for this GetPrintedLabelsRequest.
     * 
     * @return parcelIdList
     */
    public int[] getParcelIdList() {
        return parcelIdList;
    }


    /**
     * Sets the parcelIdList value for this GetPrintedLabelsRequest.
     * 
     * @param parcelIdList
     */
    public void setParcelIdList(int[] parcelIdList) {
        this.parcelIdList = parcelIdList;
    }


    /**
     * Gets the printPosition value for this GetPrintedLabelsRequest.
     * 
     * @return printPosition
     */
    public Integer getPrintPosition() {
        return printPosition;
    }


    /**
     * Sets the printPosition value for this GetPrintedLabelsRequest.
     * 
     * @param printPosition
     */
    public void setPrintPosition(Integer printPosition) {
        this.printPosition = printPosition;
    }


    /**
     * Gets the showPrintDialog value for this GetPrintedLabelsRequest.
     * 
     * @return showPrintDialog
     */
    public Boolean getShowPrintDialog() {
        return showPrintDialog;
    }


    /**
     * Sets the showPrintDialog value for this GetPrintedLabelsRequest.
     * 
     * @param showPrintDialog
     */
    public void setShowPrintDialog(Boolean showPrintDialog) {
        this.showPrintDialog = showPrintDialog;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetPrintedLabelsRequest)) return false;
        GetPrintedLabelsRequest other = (GetPrintedLabelsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parcelIdList==null && other.getParcelIdList()==null) || 
             (this.parcelIdList!=null &&
              java.util.Arrays.equals(this.parcelIdList, other.getParcelIdList()))) &&
            ((this.printPosition==null && other.getPrintPosition()==null) || 
             (this.printPosition!=null &&
              this.printPosition.equals(other.getPrintPosition()))) &&
            ((this.showPrintDialog==null && other.getShowPrintDialog()==null) || 
             (this.showPrintDialog!=null &&
              this.showPrintDialog.equals(other.getShowPrintDialog())));
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
        if (getParcelIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcelIdList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getParcelIdList(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPrintedLabelsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "GetPrintedLabelsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
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
