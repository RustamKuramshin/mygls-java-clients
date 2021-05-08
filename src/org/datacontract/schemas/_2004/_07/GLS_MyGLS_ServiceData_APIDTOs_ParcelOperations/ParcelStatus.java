/**
 * ParcelStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_ParcelOperations;

public class ParcelStatus  implements java.io.Serializable {
    private String depotCity;

    private String depotNumber;

    private String statusCode;

    private java.util.Calendar statusDate;

    private String statusDescription;

    private String statusInfo;

    public ParcelStatus() {
    }

    public ParcelStatus(
           String depotCity,
           String depotNumber,
           String statusCode,
           java.util.Calendar statusDate,
           String statusDescription,
           String statusInfo) {
           this.depotCity = depotCity;
           this.depotNumber = depotNumber;
           this.statusCode = statusCode;
           this.statusDate = statusDate;
           this.statusDescription = statusDescription;
           this.statusInfo = statusInfo;
    }


    /**
     * Gets the depotCity value for this ParcelStatus.
     * 
     * @return depotCity
     */
    public String getDepotCity() {
        return depotCity;
    }


    /**
     * Sets the depotCity value for this ParcelStatus.
     * 
     * @param depotCity
     */
    public void setDepotCity(String depotCity) {
        this.depotCity = depotCity;
    }


    /**
     * Gets the depotNumber value for this ParcelStatus.
     * 
     * @return depotNumber
     */
    public String getDepotNumber() {
        return depotNumber;
    }


    /**
     * Sets the depotNumber value for this ParcelStatus.
     * 
     * @param depotNumber
     */
    public void setDepotNumber(String depotNumber) {
        this.depotNumber = depotNumber;
    }


    /**
     * Gets the statusCode value for this ParcelStatus.
     * 
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ParcelStatus.
     * 
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusDate value for this ParcelStatus.
     * 
     * @return statusDate
     */
    public java.util.Calendar getStatusDate() {
        return statusDate;
    }


    /**
     * Sets the statusDate value for this ParcelStatus.
     * 
     * @param statusDate
     */
    public void setStatusDate(java.util.Calendar statusDate) {
        this.statusDate = statusDate;
    }


    /**
     * Gets the statusDescription value for this ParcelStatus.
     * 
     * @return statusDescription
     */
    public String getStatusDescription() {
        return statusDescription;
    }


    /**
     * Sets the statusDescription value for this ParcelStatus.
     * 
     * @param statusDescription
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }


    /**
     * Gets the statusInfo value for this ParcelStatus.
     * 
     * @return statusInfo
     */
    public String getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this ParcelStatus.
     * 
     * @param statusInfo
     */
    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ParcelStatus)) return false;
        ParcelStatus other = (ParcelStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depotCity==null && other.getDepotCity()==null) || 
             (this.depotCity!=null &&
              this.depotCity.equals(other.getDepotCity()))) &&
            ((this.depotNumber==null && other.getDepotNumber()==null) || 
             (this.depotNumber!=null &&
              this.depotNumber.equals(other.getDepotNumber()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.statusDate==null && other.getStatusDate()==null) || 
             (this.statusDate!=null &&
              this.statusDate.equals(other.getStatusDate()))) &&
            ((this.statusDescription==null && other.getStatusDescription()==null) || 
             (this.statusDescription!=null &&
              this.statusDescription.equals(other.getStatusDescription()))) &&
            ((this.statusInfo==null && other.getStatusInfo()==null) || 
             (this.statusInfo!=null &&
              this.statusInfo.equals(other.getStatusInfo())));
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
        if (getDepotCity() != null) {
            _hashCode += getDepotCity().hashCode();
        }
        if (getDepotNumber() != null) {
            _hashCode += getDepotNumber().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatusDate() != null) {
            _hashCode += getStatusDate().hashCode();
        }
        if (getStatusDescription() != null) {
            _hashCode += getStatusDescription().hashCode();
        }
        if (getStatusInfo() != null) {
            _hashCode += getStatusInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParcelStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "ParcelStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depotCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "DepotCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "DepotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "StatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "StatusDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.ParcelOperations", "StatusInfo"));
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
