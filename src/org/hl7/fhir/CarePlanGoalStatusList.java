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
 * <p>Java class for CarePlanGoalStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarePlanGoalStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in progress"/>
 *     &lt;enumeration value="achieved"/>
 *     &lt;enumeration value="sustaining"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarePlanGoalStatus-list")
@XmlEnum
public enum CarePlanGoalStatusList {


    /**
     * The goal is being sought but has not yet been reached.  (Also applies if goal was reached in the past but there has been regression and goal is being sought again).
     * 
     */
    @XmlEnumValue("in progress")
    IN_PROGRESS("in progress"),

    /**
     * The goal has been met and no further action is needed.
     * 
     */
    @XmlEnumValue("achieved")
    ACHIEVED("achieved"),

    /**
     * The goal has been met, but ongoing activity is needed to sustain the goal objective.
     * 
     */
    @XmlEnumValue("sustaining")
    SUSTAINING("sustaining"),

    /**
     * The goal is no longer being sought.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final java.lang.String value;

    CarePlanGoalStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CarePlanGoalStatusList fromValue(java.lang.String v) {
        for (CarePlanGoalStatusList c: CarePlanGoalStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
