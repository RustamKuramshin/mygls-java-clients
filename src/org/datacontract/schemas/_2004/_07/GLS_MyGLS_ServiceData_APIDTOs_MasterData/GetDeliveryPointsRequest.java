/**
 * GetDeliveryPointsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData;

public class GetDeliveryPointsRequest  extends org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.CachedRequestBase  implements java.io.Serializable {
    private String[] countryIsoCodes;

    public GetDeliveryPointsRequest() {
    }

    public GetDeliveryPointsRequest(
           int[] clientNumberList,
           byte[] password,
           String username,
           java.util.Calendar lastUpdateTime,
           String[] countryIsoCodes) {
        super(
            clientNumberList,
            password,
            username,
            lastUpdateTime);
        this.countryIsoCodes = countryIsoCodes;
    }


    /**
     * Gets the countryIsoCodes value for this GetDeliveryPointsRequest.
     * 
     * @return countryIsoCodes
     */
    public String[] getCountryIsoCodes() {
        return countryIsoCodes;
    }


    /**
     * Sets the countryIsoCodes value for this GetDeliveryPointsRequest.
     * 
     * @param countryIsoCodes
     */
    public void setCountryIsoCodes(String[] countryIsoCodes) {
        this.countryIsoCodes = countryIsoCodes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDeliveryPointsRequest)) return false;
        GetDeliveryPointsRequest other = (GetDeliveryPointsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countryIsoCodes==null && other.getCountryIsoCodes()==null) || 
             (this.countryIsoCodes!=null &&
              java.util.Arrays.equals(this.countryIsoCodes, other.getCountryIsoCodes())));
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
        if (getCountryIsoCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryIsoCodes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCountryIsoCodes(), i);
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
        new org.apache.axis.description.TypeDesc(GetDeliveryPointsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "GetDeliveryPointsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryIsoCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "CountryIsoCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
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
