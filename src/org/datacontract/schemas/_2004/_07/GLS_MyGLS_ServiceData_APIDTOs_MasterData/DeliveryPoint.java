/**
 * DeliveryPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData;

public class DeliveryPoint  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.Address address;

    private Boolean cardPaymentAllowed;

    private DeliveryPointOpening[] deliveryPointOpeningList;

    private String[] deliveryPointType;

    private Boolean dropoffpoint;

    private String id;

    private java.math.BigDecimal latitude;

    private java.math.BigDecimal longitude;

    private String matchcode;

    private String pickupTime;

    private String vendorURL;

    public DeliveryPoint() {
    }

    public DeliveryPoint(
           org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.Address address,
           Boolean cardPaymentAllowed,
           DeliveryPointOpening[] deliveryPointOpeningList,
           String[] deliveryPointType,
           Boolean dropoffpoint,
           String id,
           java.math.BigDecimal latitude,
           java.math.BigDecimal longitude,
           String matchcode,
           String pickupTime,
           String vendorURL) {
           this.address = address;
           this.cardPaymentAllowed = cardPaymentAllowed;
           this.deliveryPointOpeningList = deliveryPointOpeningList;
           this.deliveryPointType = deliveryPointType;
           this.dropoffpoint = dropoffpoint;
           this.id = id;
           this.latitude = latitude;
           this.longitude = longitude;
           this.matchcode = matchcode;
           this.pickupTime = pickupTime;
           this.vendorURL = vendorURL;
    }


    /**
     * Gets the address value for this DeliveryPoint.
     * 
     * @return address
     */
    public org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this DeliveryPoint.
     * 
     * @param address
     */
    public void setAddress(org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations.Address address) {
        this.address = address;
    }


    /**
     * Gets the cardPaymentAllowed value for this DeliveryPoint.
     * 
     * @return cardPaymentAllowed
     */
    public Boolean getCardPaymentAllowed() {
        return cardPaymentAllowed;
    }


    /**
     * Sets the cardPaymentAllowed value for this DeliveryPoint.
     * 
     * @param cardPaymentAllowed
     */
    public void setCardPaymentAllowed(Boolean cardPaymentAllowed) {
        this.cardPaymentAllowed = cardPaymentAllowed;
    }


    /**
     * Gets the deliveryPointOpeningList value for this DeliveryPoint.
     * 
     * @return deliveryPointOpeningList
     */
    public DeliveryPointOpening[] getDeliveryPointOpeningList() {
        return deliveryPointOpeningList;
    }


    /**
     * Sets the deliveryPointOpeningList value for this DeliveryPoint.
     * 
     * @param deliveryPointOpeningList
     */
    public void setDeliveryPointOpeningList(DeliveryPointOpening[] deliveryPointOpeningList) {
        this.deliveryPointOpeningList = deliveryPointOpeningList;
    }


    /**
     * Gets the deliveryPointType value for this DeliveryPoint.
     * 
     * @return deliveryPointType
     */
    public String[] getDeliveryPointType() {
        return deliveryPointType;
    }


    /**
     * Sets the deliveryPointType value for this DeliveryPoint.
     * 
     * @param deliveryPointType
     */
    public void setDeliveryPointType(String[] deliveryPointType) {
        this.deliveryPointType = deliveryPointType;
    }


    /**
     * Gets the dropoffpoint value for this DeliveryPoint.
     * 
     * @return dropoffpoint
     */
    public Boolean getDropoffpoint() {
        return dropoffpoint;
    }


    /**
     * Sets the dropoffpoint value for this DeliveryPoint.
     * 
     * @param dropoffpoint
     */
    public void setDropoffpoint(Boolean dropoffpoint) {
        this.dropoffpoint = dropoffpoint;
    }


    /**
     * Gets the id value for this DeliveryPoint.
     * 
     * @return id
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id value for this DeliveryPoint.
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets the latitude value for this DeliveryPoint.
     * 
     * @return latitude
     */
    public java.math.BigDecimal getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this DeliveryPoint.
     * 
     * @param latitude
     */
    public void setLatitude(java.math.BigDecimal latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this DeliveryPoint.
     * 
     * @return longitude
     */
    public java.math.BigDecimal getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this DeliveryPoint.
     * 
     * @param longitude
     */
    public void setLongitude(java.math.BigDecimal longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the matchcode value for this DeliveryPoint.
     * 
     * @return matchcode
     */
    public String getMatchcode() {
        return matchcode;
    }


    /**
     * Sets the matchcode value for this DeliveryPoint.
     * 
     * @param matchcode
     */
    public void setMatchcode(String matchcode) {
        this.matchcode = matchcode;
    }


    /**
     * Gets the pickupTime value for this DeliveryPoint.
     * 
     * @return pickupTime
     */
    public String getPickupTime() {
        return pickupTime;
    }


    /**
     * Sets the pickupTime value for this DeliveryPoint.
     * 
     * @param pickupTime
     */
    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }


    /**
     * Gets the vendorURL value for this DeliveryPoint.
     * 
     * @return vendorURL
     */
    public String getVendorURL() {
        return vendorURL;
    }


    /**
     * Sets the vendorURL value for this DeliveryPoint.
     * 
     * @param vendorURL
     */
    public void setVendorURL(String vendorURL) {
        this.vendorURL = vendorURL;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeliveryPoint)) return false;
        DeliveryPoint other = (DeliveryPoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.cardPaymentAllowed==null && other.getCardPaymentAllowed()==null) || 
             (this.cardPaymentAllowed!=null &&
              this.cardPaymentAllowed.equals(other.getCardPaymentAllowed()))) &&
            ((this.deliveryPointOpeningList==null && other.getDeliveryPointOpeningList()==null) || 
             (this.deliveryPointOpeningList!=null &&
              java.util.Arrays.equals(this.deliveryPointOpeningList, other.getDeliveryPointOpeningList()))) &&
            ((this.deliveryPointType==null && other.getDeliveryPointType()==null) || 
             (this.deliveryPointType!=null &&
              java.util.Arrays.equals(this.deliveryPointType, other.getDeliveryPointType()))) &&
            ((this.dropoffpoint==null && other.getDropoffpoint()==null) || 
             (this.dropoffpoint!=null &&
              this.dropoffpoint.equals(other.getDropoffpoint()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.matchcode==null && other.getMatchcode()==null) || 
             (this.matchcode!=null &&
              this.matchcode.equals(other.getMatchcode()))) &&
            ((this.pickupTime==null && other.getPickupTime()==null) || 
             (this.pickupTime!=null &&
              this.pickupTime.equals(other.getPickupTime()))) &&
            ((this.vendorURL==null && other.getVendorURL()==null) || 
             (this.vendorURL!=null &&
              this.vendorURL.equals(other.getVendorURL())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCardPaymentAllowed() != null) {
            _hashCode += getCardPaymentAllowed().hashCode();
        }
        if (getDeliveryPointOpeningList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryPointOpeningList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeliveryPointOpeningList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryPointType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryPointType());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeliveryPointType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDropoffpoint() != null) {
            _hashCode += getDropoffpoint().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getMatchcode() != null) {
            _hashCode += getMatchcode().hashCode();
        }
        if (getPickupTime() != null) {
            _hashCode += getPickupTime().hashCode();
        }
        if (getVendorURL() != null) {
            _hashCode += getVendorURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryPoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DeliveryPoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPaymentAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "CardPaymentAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPointOpeningList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DeliveryPointOpeningList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DeliveryPointOpening"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DeliveryPointOpening"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPointType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DeliveryPointType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DeliveryPointType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropoffpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Dropoffpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Matchcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "PickupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "VendorURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
