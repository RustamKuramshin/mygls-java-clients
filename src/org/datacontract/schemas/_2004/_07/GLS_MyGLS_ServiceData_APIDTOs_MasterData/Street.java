/**
 * Street.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData;

public class Street  implements java.io.Serializable {
    private HouseNumberRange[] houseNumberRangeList;

    private Routing routing;

    private String streetName;

    public Street() {
    }

    public Street(
           HouseNumberRange[] houseNumberRangeList,
           Routing routing,
           String streetName) {
           this.houseNumberRangeList = houseNumberRangeList;
           this.routing = routing;
           this.streetName = streetName;
    }


    /**
     * Gets the houseNumberRangeList value for this Street.
     * 
     * @return houseNumberRangeList
     */
    public HouseNumberRange[] getHouseNumberRangeList() {
        return houseNumberRangeList;
    }


    /**
     * Sets the houseNumberRangeList value for this Street.
     * 
     * @param houseNumberRangeList
     */
    public void setHouseNumberRangeList(HouseNumberRange[] houseNumberRangeList) {
        this.houseNumberRangeList = houseNumberRangeList;
    }


    /**
     * Gets the routing value for this Street.
     * 
     * @return routing
     */
    public Routing getRouting() {
        return routing;
    }


    /**
     * Sets the routing value for this Street.
     * 
     * @param routing
     */
    public void setRouting(Routing routing) {
        this.routing = routing;
    }


    /**
     * Gets the streetName value for this Street.
     * 
     * @return streetName
     */
    public String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this Street.
     * 
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Street)) return false;
        Street other = (Street) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.houseNumberRangeList==null && other.getHouseNumberRangeList()==null) || 
             (this.houseNumberRangeList!=null &&
              java.util.Arrays.equals(this.houseNumberRangeList, other.getHouseNumberRangeList()))) &&
            ((this.routing==null && other.getRouting()==null) || 
             (this.routing!=null &&
              this.routing.equals(other.getRouting()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName())));
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
        if (getHouseNumberRangeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHouseNumberRangeList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getHouseNumberRangeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRouting() != null) {
            _hashCode += getRouting().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Street.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Street"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseNumberRangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "HouseNumberRangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "HouseNumberRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "HouseNumberRange"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Routing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Routing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "StreetName"));
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
