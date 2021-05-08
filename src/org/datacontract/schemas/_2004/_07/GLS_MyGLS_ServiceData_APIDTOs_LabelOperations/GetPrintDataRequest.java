/**
 * GetPrintDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class GetPrintDataRequest  extends org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.APIRequestBase  implements java.io.Serializable {
    private int[] parcelIdList;

    private Parcel[] parcelList;

    public GetPrintDataRequest() {
    }

    public GetPrintDataRequest(
           int[] clientNumberList,
           byte[] password,
           String username,
           int[] parcelIdList,
           Parcel[] parcelList) {
        super(
            clientNumberList,
            password,
            username);
        this.parcelIdList = parcelIdList;
        this.parcelList = parcelList;
    }


    /**
     * Gets the parcelIdList value for this GetPrintDataRequest.
     * 
     * @return parcelIdList
     */
    public int[] getParcelIdList() {
        return parcelIdList;
    }


    /**
     * Sets the parcelIdList value for this GetPrintDataRequest.
     * 
     * @param parcelIdList
     */
    public void setParcelIdList(int[] parcelIdList) {
        this.parcelIdList = parcelIdList;
    }


    /**
     * Gets the parcelList value for this GetPrintDataRequest.
     * 
     * @return parcelList
     */
    public Parcel[] getParcelList() {
        return parcelList;
    }


    /**
     * Sets the parcelList value for this GetPrintDataRequest.
     * 
     * @param parcelList
     */
    public void setParcelList(Parcel[] parcelList) {
        this.parcelList = parcelList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetPrintDataRequest)) return false;
        GetPrintDataRequest other = (GetPrintDataRequest) obj;
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
            ((this.parcelList==null && other.getParcelList()==null) || 
             (this.parcelList!=null &&
              java.util.Arrays.equals(this.parcelList, other.getParcelList())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPrintDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "GetPrintDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Parcel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Parcel"));
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
