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
 * <p>Java class for NarrativeStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NarrativeStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="generated"/>
 *     &lt;enumeration value="extensions"/>
 *     &lt;enumeration value="additional"/>
 *     &lt;enumeration value="empty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NarrativeStatus-list")
@XmlEnum
public enum NarrativeStatusList {


    /**
     * The contents of the narrative are entirely generated from the structured data in the resource.
     * 
     */
    @XmlEnumValue("generated")
    GENERATED("generated"),

    /**
     * The contents of the narrative are entirely generated from the structured data in the resource and some of the content is generated from extensions.
     * 
     */
    @XmlEnumValue("extensions")
    EXTENSIONS("extensions"),

    /**
     * The contents of the narrative contain additional information not found in the structured data.
     * 
     */
    @XmlEnumValue("additional")
    ADDITIONAL("additional"),

    /**
     * the contents of the narrative are some equivalent of "No human-readable text provided for this resource".
     * 
     */
    @XmlEnumValue("empty")
    EMPTY("empty");
    private final java.lang.String value;

    NarrativeStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NarrativeStatusList fromValue(java.lang.String v) {
        for (NarrativeStatusList c: NarrativeStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
