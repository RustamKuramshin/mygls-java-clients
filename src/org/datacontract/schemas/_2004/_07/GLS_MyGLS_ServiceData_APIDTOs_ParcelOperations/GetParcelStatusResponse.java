/**
 * GetParcelStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations;

public class GetParcelStatusResponse  implements java.io.Serializable {
    private String clientReference;

    private String deliveryCountryCode;

    private String deliveryZipCode;

    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getParcelStatusErrors;

    private byte[] POD;

    private Long parcelNumber;

    private ParcelStatus[] parcelStatusList;

    private Double weight;

    public GetParcelStatusResponse() {
    }

    public GetParcelStatusResponse(
           String clientReference,
           String deliveryCountryCode,
           String deliveryZipCode,
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getParcelStatusErrors,
           byte[] POD,
           Long parcelNumber,
           ParcelStatus[] parcelStatusList,
           Double weight) {
           this.clientReference = clientReference;
           this.deliveryCountryCode = deliveryCountryCode;
           this.deliveryZipCode = deliveryZipCode;
           this.getParcelStatusErrors = getParcelStatusErrors;
           this.POD = POD;
           this.parcelNumber = parcelNumber;
           this.parcelStatusList = parcelStatusList;
           this.weight = weight;
    }


    /**
     * Gets the clientReference value for this GetParcelStatusResponse.
     * 
     * @return clientReference
     */
    public String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this GetParcelStatusResponse.
     * 
     * @param clientReference
     */
    public void setClientReference(String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the deliveryCountryCode value for this GetParcelStatusResponse.
     * 
     * @return deliveryCountryCode
     */
    public String getDeliveryCountryCode() {
        return deliveryCountryCode;
    }


    /**
     * Sets the deliveryCountryCode value for this GetParcelStatusResponse.
     * 
     * @param deliveryCountryCode
     */
    public void setDeliveryCountryCode(String deliveryCountryCode) {
        this.deliveryCountryCode = deliveryCountryCode;
    }


    /**
     * Gets the deliveryZipCode value for this GetParcelStatusResponse.
     * 
     * @return deliveryZipCode
     */
    public String getDeliveryZipCode() {
        return deliveryZipCode;
    }


    /**
     * Sets the deliveryZipCode value for this GetParcelStatusResponse.
     * 
     * @param deliveryZipCode
     */
    public void setDeliveryZipCode(String deliveryZipCode) {
        this.deliveryZipCode = deliveryZipCode;
    }


    /**
     * Gets the getParcelStatusErrors value for this GetParcelStatusResponse.
     * 
     * @return getParcelStatusErrors
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getGetParcelStatusErrors() {
        return getParcelStatusErrors;
    }


    /**
     * Sets the getParcelStatusErrors value for this GetParcelStatusResponse.
     * 
     * @param getParcelStatusErrors
     */
    public void setGetParcelStatusErrors(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.ErrorInfo[] getParcelStatusErrors) {
        this.getParcelStatusErrors = getParcelStatusErrors;
    }


    /**
     * Gets the POD value for this GetParcelStatusResponse.
     * 
     * @return POD
     */
    public byte[] getPOD() {
        return POD;
    }


    /**
     * Sets the POD value for this GetParcelStatusResponse.
     * 
     * @param POD
     */
    public void setPOD(byte[] POD) {
        this.POD = POD;
    }


    /**
     * Gets the parcelNumber value for this GetParcelStatusResponse.
     * 
     * @return parcelNumber
     */
    public Long getParcelNumber() {
        return parcelNumber;
    }


    /**
     * Sets the parcelNumber value for this GetParcelStatusResponse.
     * 
     * @param parcelNumber
     */
    public void setParcelNumber(Long parcelNumber) {
        this.parcelNumber = parcelNumber;
    }


    /**
     * Gets the parcelStatusList value for this GetParcelStatusResponse.
     * 
     * @return parcelStatusList
     */
    public ParcelStatus[] getParcelStatusList() {
        return parcelStatusList;
    }


    /**
     * Sets the parcelStatusList value for this GetParcelStatusResponse.
     * 
     * @param parcelStatusList
     */
    public void setParcelStatusList(ParcelStatus[] parcelStatusList) {
        this.parcelStatusList = parcelStatusList;
    }


    /**
     * Gets the weight value for this GetParcelStatusResponse.
     * 
     * @return weight
     */
    public Double getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this GetParcelStatusResponse.
     * 
     * @param weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetParcelStatusResponse)) return false;
        GetParcelStatusResponse other = (GetParcelStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            ((this.deliveryCountryCode==null && other.getDeliveryCountryCode()==null) || 
             (this.deliveryCountryCode!=null &&
              this.deliveryCountryCode.equals(other.getDeliveryCountryCode()))) &&
            ((this.deliveryZipCode==null && other.getDeliveryZipCode()==null) || 
             (this.deliveryZipCode!=null &&
              this.deliveryZipCode.equals(other.getDeliveryZipCode()))) &&
            ((this.getParcelStatusErrors==null && other.getGetParcelStatusErrors()==null) || 
             (this.getParcelStatusErrors!=null &&
              java.util.Arrays.equals(this.getParcelStatusErrors, other.getGetParcelStatusErrors()))) &&
            ((this.POD==null && other.getPOD()==null) || 
             (this.POD!=null &&
              java.util.Arrays.equals(this.POD, other.getPOD()))) &&
            ((this.parcelNumber==null && other.getParcelNumber()==null) || 
             (this.parcelNumber!=null &&
              this.parcelNumber.equals(other.getParcelNumber()))) &&
            ((this.parcelStatusList==null && other.getParcelStatusList()==null) || 
             (this.parcelStatusList!=null &&
              java.util.Arrays.equals(this.parcelStatusList, other.getParcelStatusList()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight())));
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
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        if (getDeliveryCountryCode() != null) {
            _hashCode += getDeliveryCountryCode().hashCode();
        }
        if (getDeliveryZipCode() != null) {
            _hashCode += getDeliveryZipCode().hashCode();
        }
        if (getGetParcelStatusErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetParcelStatusErrors());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetParcelStatusErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPOD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPOD());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPOD(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParcelNumber() != null) {
            _hashCode += getParcelNumber().hashCode();
        }
        if (getParcelStatusList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcelStatusList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getParcelStatusList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetParcelStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "GetParcelStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ClientReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "DeliveryCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "DeliveryZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getParcelStatusErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "GetParcelStatusErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.Common", "ErrorInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "POD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
        elemField.setFieldName("parcelStatusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ParcelStatusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ParcelStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ParcelStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
