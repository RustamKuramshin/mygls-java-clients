/**
 * PrintDataInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class PrintDataInfo  implements java.io.Serializable {
    private String b2CChar;

    private String clientReference;

    private String depot;

    private String depotNumber;

    private String driver;

    private Parcel parcel;

    private Integer parcelId;

    private Long parcelNumber;

    private Long parcelNumberWithCheckdigit;

    private String sort;

    public PrintDataInfo() {
    }

    public PrintDataInfo(
           String b2CChar,
           String clientReference,
           String depot,
           String depotNumber,
           String driver,
           Parcel parcel,
           Integer parcelId,
           Long parcelNumber,
           Long parcelNumberWithCheckdigit,
           String sort) {
           this.b2CChar = b2CChar;
           this.clientReference = clientReference;
           this.depot = depot;
           this.depotNumber = depotNumber;
           this.driver = driver;
           this.parcel = parcel;
           this.parcelId = parcelId;
           this.parcelNumber = parcelNumber;
           this.parcelNumberWithCheckdigit = parcelNumberWithCheckdigit;
           this.sort = sort;
    }


    /**
     * Gets the b2CChar value for this PrintDataInfo.
     * 
     * @return b2CChar
     */
    public String getB2CChar() {
        return b2CChar;
    }


    /**
     * Sets the b2CChar value for this PrintDataInfo.
     * 
     * @param b2CChar
     */
    public void setB2CChar(String b2CChar) {
        this.b2CChar = b2CChar;
    }


    /**
     * Gets the clientReference value for this PrintDataInfo.
     * 
     * @return clientReference
     */
    public String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this PrintDataInfo.
     * 
     * @param clientReference
     */
    public void setClientReference(String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the depot value for this PrintDataInfo.
     * 
     * @return depot
     */
    public String getDepot() {
        return depot;
    }


    /**
     * Sets the depot value for this PrintDataInfo.
     * 
     * @param depot
     */
    public void setDepot(String depot) {
        this.depot = depot;
    }


    /**
     * Gets the depotNumber value for this PrintDataInfo.
     * 
     * @return depotNumber
     */
    public String getDepotNumber() {
        return depotNumber;
    }


    /**
     * Sets the depotNumber value for this PrintDataInfo.
     * 
     * @param depotNumber
     */
    public void setDepotNumber(String depotNumber) {
        this.depotNumber = depotNumber;
    }


    /**
     * Gets the driver value for this PrintDataInfo.
     * 
     * @return driver
     */
    public String getDriver() {
        return driver;
    }


    /**
     * Sets the driver value for this PrintDataInfo.
     * 
     * @param driver
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }


    /**
     * Gets the parcel value for this PrintDataInfo.
     * 
     * @return parcel
     */
    public Parcel getParcel() {
        return parcel;
    }


    /**
     * Sets the parcel value for this PrintDataInfo.
     * 
     * @param parcel
     */
    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }


    /**
     * Gets the parcelId value for this PrintDataInfo.
     * 
     * @return parcelId
     */
    public Integer getParcelId() {
        return parcelId;
    }


    /**
     * Sets the parcelId value for this PrintDataInfo.
     * 
     * @param parcelId
     */
    public void setParcelId(Integer parcelId) {
        this.parcelId = parcelId;
    }


    /**
     * Gets the parcelNumber value for this PrintDataInfo.
     * 
     * @return parcelNumber
     */
    public Long getParcelNumber() {
        return parcelNumber;
    }


    /**
     * Sets the parcelNumber value for this PrintDataInfo.
     * 
     * @param parcelNumber
     */
    public void setParcelNumber(Long parcelNumber) {
        this.parcelNumber = parcelNumber;
    }


    /**
     * Gets the parcelNumberWithCheckdigit value for this PrintDataInfo.
     * 
     * @return parcelNumberWithCheckdigit
     */
    public Long getParcelNumberWithCheckdigit() {
        return parcelNumberWithCheckdigit;
    }


    /**
     * Sets the parcelNumberWithCheckdigit value for this PrintDataInfo.
     * 
     * @param parcelNumberWithCheckdigit
     */
    public void setParcelNumberWithCheckdigit(Long parcelNumberWithCheckdigit) {
        this.parcelNumberWithCheckdigit = parcelNumberWithCheckdigit;
    }


    /**
     * Gets the sort value for this PrintDataInfo.
     * 
     * @return sort
     */
    public String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this PrintDataInfo.
     * 
     * @param sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PrintDataInfo)) return false;
        PrintDataInfo other = (PrintDataInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.b2CChar==null && other.getB2CChar()==null) || 
             (this.b2CChar!=null &&
              this.b2CChar.equals(other.getB2CChar()))) &&
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            ((this.depot==null && other.getDepot()==null) || 
             (this.depot!=null &&
              this.depot.equals(other.getDepot()))) &&
            ((this.depotNumber==null && other.getDepotNumber()==null) || 
             (this.depotNumber!=null &&
              this.depotNumber.equals(other.getDepotNumber()))) &&
            ((this.driver==null && other.getDriver()==null) || 
             (this.driver!=null &&
              this.driver.equals(other.getDriver()))) &&
            ((this.parcel==null && other.getParcel()==null) || 
             (this.parcel!=null &&
              this.parcel.equals(other.getParcel()))) &&
            ((this.parcelId==null && other.getParcelId()==null) || 
             (this.parcelId!=null &&
              this.parcelId.equals(other.getParcelId()))) &&
            ((this.parcelNumber==null && other.getParcelNumber()==null) || 
             (this.parcelNumber!=null &&
              this.parcelNumber.equals(other.getParcelNumber()))) &&
            ((this.parcelNumberWithCheckdigit==null && other.getParcelNumberWithCheckdigit()==null) || 
             (this.parcelNumberWithCheckdigit!=null &&
              this.parcelNumberWithCheckdigit.equals(other.getParcelNumberWithCheckdigit()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort())));
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
        if (getB2CChar() != null) {
            _hashCode += getB2CChar().hashCode();
        }
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        if (getDepot() != null) {
            _hashCode += getDepot().hashCode();
        }
        if (getDepotNumber() != null) {
            _hashCode += getDepotNumber().hashCode();
        }
        if (getDriver() != null) {
            _hashCode += getDriver().hashCode();
        }
        if (getParcel() != null) {
            _hashCode += getParcel().hashCode();
        }
        if (getParcelId() != null) {
            _hashCode += getParcelId().hashCode();
        }
        if (getParcelNumber() != null) {
            _hashCode += getParcelNumber().hashCode();
        }
        if (getParcelNumberWithCheckdigit() != null) {
            _hashCode += getParcelNumberWithCheckdigit().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintDataInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "PrintDataInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b2CChar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "B2CChar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ClientReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Depot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "DepotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Driver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Parcel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Parcel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelNumberWithCheckdigit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "ParcelNumberWithCheckdigit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "Sort"));
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
