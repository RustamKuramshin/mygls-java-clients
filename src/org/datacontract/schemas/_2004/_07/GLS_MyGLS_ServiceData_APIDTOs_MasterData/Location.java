/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData;

public class Location  implements java.io.Serializable {
    private String[] allowedServiceList;

    private String countryIsoCode;

    private Boolean hasRestrictedServices;

    private String[] mandatoryServiceList;

    private String name;

    private Routing routing;

    private Street[] streetList;

    private String zipCode;

    public Location() {
    }

    public Location(
           String[] allowedServiceList,
           String countryIsoCode,
           Boolean hasRestrictedServices,
           String[] mandatoryServiceList,
           String name,
           Routing routing,
           Street[] streetList,
           String zipCode) {
           this.allowedServiceList = allowedServiceList;
           this.countryIsoCode = countryIsoCode;
           this.hasRestrictedServices = hasRestrictedServices;
           this.mandatoryServiceList = mandatoryServiceList;
           this.name = name;
           this.routing = routing;
           this.streetList = streetList;
           this.zipCode = zipCode;
    }


    /**
     * Gets the allowedServiceList value for this Location.
     * 
     * @return allowedServiceList
     */
    public String[] getAllowedServiceList() {
        return allowedServiceList;
    }


    /**
     * Sets the allowedServiceList value for this Location.
     * 
     * @param allowedServiceList
     */
    public void setAllowedServiceList(String[] allowedServiceList) {
        this.allowedServiceList = allowedServiceList;
    }


    /**
     * Gets the countryIsoCode value for this Location.
     * 
     * @return countryIsoCode
     */
    public String getCountryIsoCode() {
        return countryIsoCode;
    }


    /**
     * Sets the countryIsoCode value for this Location.
     * 
     * @param countryIsoCode
     */
    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }


    /**
     * Gets the hasRestrictedServices value for this Location.
     * 
     * @return hasRestrictedServices
     */
    public Boolean getHasRestrictedServices() {
        return hasRestrictedServices;
    }


    /**
     * Sets the hasRestrictedServices value for this Location.
     * 
     * @param hasRestrictedServices
     */
    public void setHasRestrictedServices(Boolean hasRestrictedServices) {
        this.hasRestrictedServices = hasRestrictedServices;
    }


    /**
     * Gets the mandatoryServiceList value for this Location.
     * 
     * @return mandatoryServiceList
     */
    public String[] getMandatoryServiceList() {
        return mandatoryServiceList;
    }


    /**
     * Sets the mandatoryServiceList value for this Location.
     * 
     * @param mandatoryServiceList
     */
    public void setMandatoryServiceList(String[] mandatoryServiceList) {
        this.mandatoryServiceList = mandatoryServiceList;
    }


    /**
     * Gets the name value for this Location.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this Location.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the routing value for this Location.
     * 
     * @return routing
     */
    public Routing getRouting() {
        return routing;
    }


    /**
     * Sets the routing value for this Location.
     * 
     * @param routing
     */
    public void setRouting(Routing routing) {
        this.routing = routing;
    }


    /**
     * Gets the streetList value for this Location.
     * 
     * @return streetList
     */
    public Street[] getStreetList() {
        return streetList;
    }


    /**
     * Sets the streetList value for this Location.
     * 
     * @param streetList
     */
    public void setStreetList(Street[] streetList) {
        this.streetList = streetList;
    }


    /**
     * Gets the zipCode value for this Location.
     * 
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this Location.
     * 
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowedServiceList==null && other.getAllowedServiceList()==null) || 
             (this.allowedServiceList!=null &&
              java.util.Arrays.equals(this.allowedServiceList, other.getAllowedServiceList()))) &&
            ((this.countryIsoCode==null && other.getCountryIsoCode()==null) || 
             (this.countryIsoCode!=null &&
              this.countryIsoCode.equals(other.getCountryIsoCode()))) &&
            ((this.hasRestrictedServices==null && other.getHasRestrictedServices()==null) || 
             (this.hasRestrictedServices!=null &&
              this.hasRestrictedServices.equals(other.getHasRestrictedServices()))) &&
            ((this.mandatoryServiceList==null && other.getMandatoryServiceList()==null) || 
             (this.mandatoryServiceList!=null &&
              java.util.Arrays.equals(this.mandatoryServiceList, other.getMandatoryServiceList()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.routing==null && other.getRouting()==null) || 
             (this.routing!=null &&
              this.routing.equals(other.getRouting()))) &&
            ((this.streetList==null && other.getStreetList()==null) || 
             (this.streetList!=null &&
              java.util.Arrays.equals(this.streetList, other.getStreetList()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode())));
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
        if (getAllowedServiceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedServiceList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAllowedServiceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryIsoCode() != null) {
            _hashCode += getCountryIsoCode().hashCode();
        }
        if (getHasRestrictedServices() != null) {
            _hashCode += getHasRestrictedServices().hashCode();
        }
        if (getMandatoryServiceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMandatoryServiceList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMandatoryServiceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRouting() != null) {
            _hashCode += getRouting().hashCode();
        }
        if (getStreetList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStreetList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStreetList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Location"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedServiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "AllowedServiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryIsoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "CountryIsoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasRestrictedServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "HasRestrictedServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatoryServiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "MandatoryServiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Routing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Routing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "StreetList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Street"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "Street"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "ZipCode"));
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
