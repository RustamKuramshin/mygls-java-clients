/**
 * GetDeliveryPointsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_MasterData;

public class GetDeliveryPointsResponse  extends org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_Common.CachedResponseBase  implements java.io.Serializable {
    private DeliveryPoint[] deliveryPointList;

    public GetDeliveryPointsResponse() {
    }

    public GetDeliveryPointsResponse(
           Integer errorCode,
           String errorDescription,
           Boolean isChanged,
           java.util.Calendar lastUpdateTime,
           DeliveryPoint[] deliveryPointList) {
        super(
            errorCode,
            errorDescription,
            isChanged,
            lastUpdateTime);
        this.deliveryPointList = deliveryPointList;
    }


    /**
     * Gets the deliveryPointList value for this GetDeliveryPointsResponse.
     * 
     * @return deliveryPointList
     */
    public DeliveryPoint[] getDeliveryPointList() {
        return deliveryPointList;
    }


    /**
     * Sets the deliveryPointList value for this GetDeliveryPointsResponse.
     * 
     * @param deliveryPointList
     */
    public void setDeliveryPointList(DeliveryPoint[] deliveryPointList) {
        this.deliveryPointList = deliveryPointList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDeliveryPointsResponse)) return false;
        GetDeliveryPointsResponse other = (GetDeliveryPointsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deliveryPointList==null && other.getDeliveryPointList()==null) || 
             (this.deliveryPointList!=null &&
              java.util.Arrays.equals(this.deliveryPointList, other.getDeliveryPointList())));
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
        if (getDeliveryPointList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryPointList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeliveryPointList(), i);
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
        new org.apache.axis.description.TypeDesc(GetDeliveryPointsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "GetDeliveryPointsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPointList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DeliveryPointList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DeliveryPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.MasterData", "DeliveryPoint"));
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
