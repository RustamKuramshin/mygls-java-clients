/**
 * ModifyCODRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations;

public class ModifyCODRequest  extends org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.APIRequestBase  implements java.io.Serializable {
    private java.math.BigDecimal CODAmount;

    private Integer parcelId;

    private Long parcelNumber;

    public ModifyCODRequest() {
    }

    public ModifyCODRequest(
           int[] clientNumberList,
           byte[] password,
           String username,
           java.math.BigDecimal CODAmount,
           Integer parcelId,
           Long parcelNumber) {
        super(
            clientNumberList,
            password,
            username);
        this.CODAmount = CODAmount;
        this.parcelId = parcelId;
        this.parcelNumber = parcelNumber;
    }


    /**
     * Gets the CODAmount value for this ModifyCODRequest.
     * 
     * @return CODAmount
     */
    public java.math.BigDecimal getCODAmount() {
        return CODAmount;
    }


    /**
     * Sets the CODAmount value for this ModifyCODRequest.
     * 
     * @param CODAmount
     */
    public void setCODAmount(java.math.BigDecimal CODAmount) {
        this.CODAmount = CODAmount;
    }


    /**
     * Gets the parcelId value for this ModifyCODRequest.
     * 
     * @return parcelId
     */
    public Integer getParcelId() {
        return parcelId;
    }


    /**
     * Sets the parcelId value for this ModifyCODRequest.
     * 
     * @param parcelId
     */
    public void setParcelId(Integer parcelId) {
        this.parcelId = parcelId;
    }


    /**
     * Gets the parcelNumber value for this ModifyCODRequest.
     * 
     * @return parcelNumber
     */
    public Long getParcelNumber() {
        return parcelNumber;
    }


    /**
     * Sets the parcelNumber value for this ModifyCODRequest.
     * 
     * @param parcelNumber
     */
    public void setParcelNumber(Long parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ModifyCODRequest)) return false;
        ModifyCODRequest other = (ModifyCODRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.CODAmount==null && other.getCODAmount()==null) || 
             (this.CODAmount!=null &&
              this.CODAmount.equals(other.getCODAmount()))) &&
            ((this.parcelId==null && other.getParcelId()==null) || 
             (this.parcelId!=null &&
              this.parcelId.equals(other.getParcelId()))) &&
            ((this.parcelNumber==null && other.getParcelNumber()==null) || 
             (this.parcelNumber!=null &&
              this.parcelNumber.equals(other.getParcelNumber())));
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
        if (getCODAmount() != null) {
            _hashCode += getCODAmount().hashCode();
        }
        if (getParcelId() != null) {
            _hashCode += getParcelId().hashCode();
        }
        if (getParcelNumber() != null) {
            _hashCode += getParcelNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyCODRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ModifyCODRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "CODAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ParcelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ParcelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
