/**
 * HouseNumberRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData;

public class HouseNumberRange  implements java.io.Serializable {
    private Integer from;

    private HouseNumberRangeType houseNumberRangeType;

    private Routing routing;

    private Integer to;

    public HouseNumberRange() {
    }

    public HouseNumberRange(
           Integer from,
           HouseNumberRangeType houseNumberRangeType,
           Routing routing,
           Integer to) {
           this.from = from;
           this.houseNumberRangeType = houseNumberRangeType;
           this.routing = routing;
           this.to = to;
    }


    /**
     * Gets the from value for this HouseNumberRange.
     * 
     * @return from
     */
    public Integer getFrom() {
        return from;
    }


    /**
     * Sets the from value for this HouseNumberRange.
     * 
     * @param from
     */
    public void setFrom(Integer from) {
        this.from = from;
    }


    /**
     * Gets the houseNumberRangeType value for this HouseNumberRange.
     * 
     * @return houseNumberRangeType
     */
    public HouseNumberRangeType getHouseNumberRangeType() {
        return houseNumberRangeType;
    }


    /**
     * Sets the houseNumberRangeType value for this HouseNumberRange.
     * 
     * @param houseNumberRangeType
     */
    public void setHouseNumberRangeType(HouseNumberRangeType houseNumberRangeType) {
        this.houseNumberRangeType = houseNumberRangeType;
    }


    /**
     * Gets the routing value for this HouseNumberRange.
     * 
     * @return routing
     */
    public Routing getRouting() {
        return routing;
    }


    /**
     * Sets the routing value for this HouseNumberRange.
     * 
     * @param routing
     */
    public void setRouting(Routing routing) {
        this.routing = routing;
    }


    /**
     * Gets the to value for this HouseNumberRange.
     * 
     * @return to
     */
    public Integer getTo() {
        return to;
    }


    /**
     * Sets the to value for this HouseNumberRange.
     * 
     * @param to
     */
    public void setTo(Integer to) {
        this.to = to;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HouseNumberRange)) return false;
        HouseNumberRange other = (HouseNumberRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.houseNumberRangeType==null && other.getHouseNumberRangeType()==null) || 
             (this.houseNumberRangeType!=null &&
              this.houseNumberRangeType.equals(other.getHouseNumberRangeType()))) &&
            ((this.routing==null && other.getRouting()==null) || 
             (this.routing!=null &&
              this.routing.equals(other.getRouting()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo())));
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getHouseNumberRangeType() != null) {
            _hashCode += getHouseNumberRangeType().hashCode();
        }
        if (getRouting() != null) {
            _hashCode += getRouting().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HouseNumberRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "HouseNumberRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "From"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseNumberRangeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "HouseNumberRangeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "HouseNumberRangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Routing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Routing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "To"));
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
