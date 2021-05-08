/**
 * ServiceParameterADR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class ServiceParameterADR  implements java.io.Serializable {
    private AdrItemType adrItemType;

    private AmountUnit amountUnit;

    private Integer innerCount;

    private Integer packSize;

    private Integer unNumber;

    public ServiceParameterADR() {
    }

    public ServiceParameterADR(
           AdrItemType adrItemType,
           AmountUnit amountUnit,
           Integer innerCount,
           Integer packSize,
           Integer unNumber) {
           this.adrItemType = adrItemType;
           this.amountUnit = amountUnit;
           this.innerCount = innerCount;
           this.packSize = packSize;
           this.unNumber = unNumber;
    }


    /**
     * Gets the adrItemType value for this ServiceParameterADR.
     * 
     * @return adrItemType
     */
    public AdrItemType getAdrItemType() {
        return adrItemType;
    }


    /**
     * Sets the adrItemType value for this ServiceParameterADR.
     * 
     * @param adrItemType
     */
    public void setAdrItemType(AdrItemType adrItemType) {
        this.adrItemType = adrItemType;
    }


    /**
     * Gets the amountUnit value for this ServiceParameterADR.
     * 
     * @return amountUnit
     */
    public AmountUnit getAmountUnit() {
        return amountUnit;
    }


    /**
     * Sets the amountUnit value for this ServiceParameterADR.
     * 
     * @param amountUnit
     */
    public void setAmountUnit(AmountUnit amountUnit) {
        this.amountUnit = amountUnit;
    }


    /**
     * Gets the innerCount value for this ServiceParameterADR.
     * 
     * @return innerCount
     */
    public Integer getInnerCount() {
        return innerCount;
    }


    /**
     * Sets the innerCount value for this ServiceParameterADR.
     * 
     * @param innerCount
     */
    public void setInnerCount(Integer innerCount) {
        this.innerCount = innerCount;
    }


    /**
     * Gets the packSize value for this ServiceParameterADR.
     * 
     * @return packSize
     */
    public Integer getPackSize() {
        return packSize;
    }


    /**
     * Sets the packSize value for this ServiceParameterADR.
     * 
     * @param packSize
     */
    public void setPackSize(Integer packSize) {
        this.packSize = packSize;
    }


    /**
     * Gets the unNumber value for this ServiceParameterADR.
     * 
     * @return unNumber
     */
    public Integer getUnNumber() {
        return unNumber;
    }


    /**
     * Sets the unNumber value for this ServiceParameterADR.
     * 
     * @param unNumber
     */
    public void setUnNumber(Integer unNumber) {
        this.unNumber = unNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServiceParameterADR)) return false;
        ServiceParameterADR other = (ServiceParameterADR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adrItemType==null && other.getAdrItemType()==null) || 
             (this.adrItemType!=null &&
              this.adrItemType.equals(other.getAdrItemType()))) &&
            ((this.amountUnit==null && other.getAmountUnit()==null) || 
             (this.amountUnit!=null &&
              this.amountUnit.equals(other.getAmountUnit()))) &&
            ((this.innerCount==null && other.getInnerCount()==null) || 
             (this.innerCount!=null &&
              this.innerCount.equals(other.getInnerCount()))) &&
            ((this.packSize==null && other.getPackSize()==null) || 
             (this.packSize!=null &&
              this.packSize.equals(other.getPackSize()))) &&
            ((this.unNumber==null && other.getUnNumber()==null) || 
             (this.unNumber!=null &&
              this.unNumber.equals(other.getUnNumber())));
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
        if (getAdrItemType() != null) {
            _hashCode += getAdrItemType().hashCode();
        }
        if (getAmountUnit() != null) {
            _hashCode += getAmountUnit().hashCode();
        }
        if (getInnerCount() != null) {
            _hashCode += getInnerCount().hashCode();
        }
        if (getPackSize() != null) {
            _hashCode += getPackSize().hashCode();
        }
        if (getUnNumber() != null) {
            _hashCode += getUnNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceParameterADR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ServiceParameterADR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adrItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "AdrItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "AdrItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "AmountUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "AmountUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("innerCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "InnerCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PackSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "UnNumber"));
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
