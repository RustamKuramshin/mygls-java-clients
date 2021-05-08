/**
 * GetParcelStatusesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations;

public class GetParcelStatusesRequest  extends org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.APIRequestBase  implements java.io.Serializable {
    private String languageIsoCode;

    private Long parcelNumber;

    private Boolean returnPOD;

    public GetParcelStatusesRequest() {
    }

    public GetParcelStatusesRequest(
           int[] clientNumberList,
           byte[] password,
           String username,
           String languageIsoCode,
           Long parcelNumber,
           Boolean returnPOD) {
        super(
            clientNumberList,
            password,
            username);
        this.languageIsoCode = languageIsoCode;
        this.parcelNumber = parcelNumber;
        this.returnPOD = returnPOD;
    }


    /**
     * Gets the languageIsoCode value for this GetParcelStatusesRequest.
     * 
     * @return languageIsoCode
     */
    public String getLanguageIsoCode() {
        return languageIsoCode;
    }


    /**
     * Sets the languageIsoCode value for this GetParcelStatusesRequest.
     * 
     * @param languageIsoCode
     */
    public void setLanguageIsoCode(String languageIsoCode) {
        this.languageIsoCode = languageIsoCode;
    }


    /**
     * Gets the parcelNumber value for this GetParcelStatusesRequest.
     * 
     * @return parcelNumber
     */
    public Long getParcelNumber() {
        return parcelNumber;
    }


    /**
     * Sets the parcelNumber value for this GetParcelStatusesRequest.
     * 
     * @param parcelNumber
     */
    public void setParcelNumber(Long parcelNumber) {
        this.parcelNumber = parcelNumber;
    }


    /**
     * Gets the returnPOD value for this GetParcelStatusesRequest.
     * 
     * @return returnPOD
     */
    public Boolean getReturnPOD() {
        return returnPOD;
    }


    /**
     * Sets the returnPOD value for this GetParcelStatusesRequest.
     * 
     * @param returnPOD
     */
    public void setReturnPOD(Boolean returnPOD) {
        this.returnPOD = returnPOD;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetParcelStatusesRequest)) return false;
        GetParcelStatusesRequest other = (GetParcelStatusesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.languageIsoCode==null && other.getLanguageIsoCode()==null) || 
             (this.languageIsoCode!=null &&
              this.languageIsoCode.equals(other.getLanguageIsoCode()))) &&
            ((this.parcelNumber==null && other.getParcelNumber()==null) || 
             (this.parcelNumber!=null &&
              this.parcelNumber.equals(other.getParcelNumber()))) &&
            ((this.returnPOD==null && other.getReturnPOD()==null) || 
             (this.returnPOD!=null &&
              this.returnPOD.equals(other.getReturnPOD())));
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
        if (getLanguageIsoCode() != null) {
            _hashCode += getLanguageIsoCode().hashCode();
        }
        if (getParcelNumber() != null) {
            _hashCode += getParcelNumber().hashCode();
        }
        if (getReturnPOD() != null) {
            _hashCode += getReturnPOD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetParcelStatusesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "GetParcelStatusesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageIsoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "LanguageIsoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ParcelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnPOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ReturnPOD"));
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
