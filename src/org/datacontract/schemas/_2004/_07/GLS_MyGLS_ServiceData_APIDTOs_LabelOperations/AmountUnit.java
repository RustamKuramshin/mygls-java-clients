/**
 * AmountUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.GLS_MyGLS_ServiceData_APIDTOs_LabelOperations;

public class AmountUnit implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AmountUnit(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _block = "block";
    public static final String _g = "g";
    public static final String _kg = "kg";
    public static final String _l = "l";
    public static final String _mg = "mg";
    public static final String _ml = "ml";
    public static final String _pcs = "pcs";
    public static final String _roll = "roll";
    public static final String _sheet = "sheet";
    public static final AmountUnit block = new AmountUnit(_block);
    public static final AmountUnit g = new AmountUnit(_g);
    public static final AmountUnit kg = new AmountUnit(_kg);
    public static final AmountUnit l = new AmountUnit(_l);
    public static final AmountUnit mg = new AmountUnit(_mg);
    public static final AmountUnit ml = new AmountUnit(_ml);
    public static final AmountUnit pcs = new AmountUnit(_pcs);
    public static final AmountUnit roll = new AmountUnit(_roll);
    public static final AmountUnit sheet = new AmountUnit(_sheet);
    public String getValue() { return _value_;}
    public static AmountUnit fromValue(String value)
          throws IllegalArgumentException {
        AmountUnit enumeration = (AmountUnit)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static AmountUnit fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmountUnit.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GLS.MyGLS.ServiceData.APIDTOs.LabelOperations", "AmountUnit"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
