/**
 * Parcel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class Parcel  implements java.io.Serializable {
    private java.math.BigDecimal CODAmount;

    private String CODCurrency;

    private String CODReference;

    private Integer clientNumber;

    private String clientReference;

    private String content;

    private Integer count;

    private Address deliveryAddress;

    private Address pickupAddress;

    private java.util.Calendar pickupDate;

    private Service[] serviceList;

    public Parcel() {
    }

    public Parcel(
           java.math.BigDecimal CODAmount,
           String CODCurrency,
           String CODReference,
           Integer clientNumber,
           String clientReference,
           String content,
           Integer count,
           Address deliveryAddress,
           Address pickupAddress,
           java.util.Calendar pickupDate,
           Service[] serviceList) {
           this.CODAmount = CODAmount;
           this.CODCurrency = CODCurrency;
           this.CODReference = CODReference;
           this.clientNumber = clientNumber;
           this.clientReference = clientReference;
           this.content = content;
           this.count = count;
           this.deliveryAddress = deliveryAddress;
           this.pickupAddress = pickupAddress;
           this.pickupDate = pickupDate;
           this.serviceList = serviceList;
    }


    /**
     * Gets the CODAmount value for this Parcel.
     * 
     * @return CODAmount
     */
    public java.math.BigDecimal getCODAmount() {
        return CODAmount;
    }


    /**
     * Sets the CODAmount value for this Parcel.
     * 
     * @param CODAmount
     */
    public void setCODAmount(java.math.BigDecimal CODAmount) {
        this.CODAmount = CODAmount;
    }


    /**
     * Gets the CODCurrency value for this Parcel.
     * 
     * @return CODCurrency
     */
    public String getCODCurrency() {
        return CODCurrency;
    }


    /**
     * Sets the CODCurrency value for this Parcel.
     * 
     * @param CODCurrency
     */
    public void setCODCurrency(String CODCurrency) {
        this.CODCurrency = CODCurrency;
    }


    /**
     * Gets the CODReference value for this Parcel.
     * 
     * @return CODReference
     */
    public String getCODReference() {
        return CODReference;
    }


    /**
     * Sets the CODReference value for this Parcel.
     * 
     * @param CODReference
     */
    public void setCODReference(String CODReference) {
        this.CODReference = CODReference;
    }


    /**
     * Gets the clientNumber value for this Parcel.
     * 
     * @return clientNumber
     */
    public Integer getClientNumber() {
        return clientNumber;
    }


    /**
     * Sets the clientNumber value for this Parcel.
     * 
     * @param clientNumber
     */
    public void setClientNumber(Integer clientNumber) {
        this.clientNumber = clientNumber;
    }


    /**
     * Gets the clientReference value for this Parcel.
     * 
     * @return clientReference
     */
    public String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this Parcel.
     * 
     * @param clientReference
     */
    public void setClientReference(String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the content value for this Parcel.
     * 
     * @return content
     */
    public String getContent() {
        return content;
    }


    /**
     * Sets the content value for this Parcel.
     * 
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Gets the count value for this Parcel.
     * 
     * @return count
     */
    public Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this Parcel.
     * 
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }


    /**
     * Gets the deliveryAddress value for this Parcel.
     * 
     * @return deliveryAddress
     */
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }


    /**
     * Sets the deliveryAddress value for this Parcel.
     * 
     * @param deliveryAddress
     */
    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    /**
     * Gets the pickupAddress value for this Parcel.
     * 
     * @return pickupAddress
     */
    public Address getPickupAddress() {
        return pickupAddress;
    }


    /**
     * Sets the pickupAddress value for this Parcel.
     * 
     * @param pickupAddress
     */
    public void setPickupAddress(Address pickupAddress) {
        this.pickupAddress = pickupAddress;
    }


    /**
     * Gets the pickupDate value for this Parcel.
     * 
     * @return pickupDate
     */
    public java.util.Calendar getPickupDate() {
        return pickupDate;
    }


    /**
     * Sets the pickupDate value for this Parcel.
     * 
     * @param pickupDate
     */
    public void setPickupDate(java.util.Calendar pickupDate) {
        this.pickupDate = pickupDate;
    }


    /**
     * Gets the serviceList value for this Parcel.
     * 
     * @return serviceList
     */
    public Service[] getServiceList() {
        return serviceList;
    }


    /**
     * Sets the serviceList value for this Parcel.
     * 
     * @param serviceList
     */
    public void setServiceList(Service[] serviceList) {
        this.serviceList = serviceList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Parcel)) return false;
        Parcel other = (Parcel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CODAmount==null && other.getCODAmount()==null) || 
             (this.CODAmount!=null &&
              this.CODAmount.equals(other.getCODAmount()))) &&
            ((this.CODCurrency==null && other.getCODCurrency()==null) || 
             (this.CODCurrency!=null &&
              this.CODCurrency.equals(other.getCODCurrency()))) &&
            ((this.CODReference==null && other.getCODReference()==null) || 
             (this.CODReference!=null &&
              this.CODReference.equals(other.getCODReference()))) &&
            ((this.clientNumber==null && other.getClientNumber()==null) || 
             (this.clientNumber!=null &&
              this.clientNumber.equals(other.getClientNumber()))) &&
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.deliveryAddress==null && other.getDeliveryAddress()==null) || 
             (this.deliveryAddress!=null &&
              this.deliveryAddress.equals(other.getDeliveryAddress()))) &&
            ((this.pickupAddress==null && other.getPickupAddress()==null) || 
             (this.pickupAddress!=null &&
              this.pickupAddress.equals(other.getPickupAddress()))) &&
            ((this.pickupDate==null && other.getPickupDate()==null) || 
             (this.pickupDate!=null &&
              this.pickupDate.equals(other.getPickupDate()))) &&
            ((this.serviceList==null && other.getServiceList()==null) || 
             (this.serviceList!=null &&
              java.util.Arrays.equals(this.serviceList, other.getServiceList())));
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
        if (getCODAmount() != null) {
            _hashCode += getCODAmount().hashCode();
        }
        if (getCODCurrency() != null) {
            _hashCode += getCODCurrency().hashCode();
        }
        if (getCODReference() != null) {
            _hashCode += getCODReference().hashCode();
        }
        if (getClientNumber() != null) {
            _hashCode += getClientNumber().hashCode();
        }
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getDeliveryAddress() != null) {
            _hashCode += getDeliveryAddress().hashCode();
        }
        if (getPickupAddress() != null) {
            _hashCode += getPickupAddress().hashCode();
        }
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getServiceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getServiceList(), i);
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
        new org.apache.axis.description.TypeDesc(Parcel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Parcel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "CODAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "CODCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "CODReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ClientNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ClientReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "DeliveryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PickupAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ServiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Service"));
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
