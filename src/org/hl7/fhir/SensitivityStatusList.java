//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.12 at 12:19:07 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SensitivityStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SensitivityStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="suspected"/>
 *     &lt;enumeration value="confirmed"/>
 *     &lt;enumeration value="refuted"/>
 *     &lt;enumeration value="resolved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SensitivityStatus-list")
@XmlEnum
public enum SensitivityStatusList {


    /**
     * A suspected sensitivity to a substance.
     * 
     */
    @XmlEnumValue("suspected")
    SUSPECTED("suspected"),

    /**
     * The sensitivity has been confirmed and is active.
     * 
     */
    @XmlEnumValue("confirmed")
    CONFIRMED("confirmed"),

    /**
     * The sensitivity has been shown to never have existed.
     * 
     */
    @XmlEnumValue("refuted")
    REFUTED("refuted"),

    /**
     * The sensitivity used to exist but no longer does.
     * 
     */
    @XmlEnumValue("resolved")
    RESOLVED("resolved");
    private final java.lang.String value;

    SensitivityStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SensitivityStatusList fromValue(java.lang.String v) {
        for (SensitivityStatusList c: SensitivityStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
