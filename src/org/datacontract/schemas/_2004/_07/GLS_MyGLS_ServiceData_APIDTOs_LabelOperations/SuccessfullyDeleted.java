/**
 * SuccessfullyDeleted.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class SuccessfullyDeleted  implements java.io.Serializable {
    private Integer parcelId;

    private int[] subParcelIdList;

    public SuccessfullyDeleted() {
    }

    public SuccessfullyDeleted(
           Integer parcelId,
           int[] subParcelIdList) {
           this.parcelId = parcelId;
           this.subParcelIdList = subParcelIdList;
    }


    /**
     * Gets the parcelId value for this SuccessfullyDeleted.
     * 
     * @return parcelId
     */
    public Integer getParcelId() {
        return parcelId;
    }


    /**
     * Sets the parcelId value for this SuccessfullyDeleted.
     * 
     * @param parcelId
     */
    public void setParcelId(Integer parcelId) {
        this.parcelId = parcelId;
    }


    /**
     * Gets the subParcelIdList value for this SuccessfullyDeleted.
     * 
     * @return subParcelIdList
     */
    public int[] getSubParcelIdList() {
        return subParcelIdList;
    }


    /**
     * Sets the subParcelIdList value for this SuccessfullyDeleted.
     * 
     * @param subParcelIdList
     */
    public void setSubParcelIdList(int[] subParcelIdList) {
        this.subParcelIdList = subParcelIdList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SuccessfullyDeleted)) return false;
        SuccessfullyDeleted other = (SuccessfullyDeleted) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parcelId==null && other.getParcelId()==null) || 
             (this.parcelId!=null &&
              this.parcelId.equals(other.getParcelId()))) &&
            ((this.subParcelIdList==null && other.getSubParcelIdList()==null) || 
             (this.subParcelIdList!=null &&
              java.util.Arrays.equals(this.subParcelIdList, other.getSubParcelIdList())));
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
        if (getParcelId() != null) {
            _hashCode += getParcelId().hashCode();
        }
        if (getSubParcelIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubParcelIdList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSubParcelIdList(), i);
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
        new org.apache.axis.description.TypeDesc(SuccessfullyDeleted.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "SuccessfullyDeleted"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subParcelIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "SubParcelIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
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
