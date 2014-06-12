//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.12 at 12:19:07 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The header for a message exchange that is either requesting or responding to an action.  The resource(s) that are the subject of the action as well as other Information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 * 
 * <p>Java class for MessageHeader.Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader.Response">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}id"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}ResponseType"/>
 *         &lt;element name="details" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader.Response", propOrder = {
    "identifier",
    "code",
    "details"
})
public class MessageHeaderResponse
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Id identifier;
    @XmlElement(required = true)
    protected ResponseType code;
    protected ResourceReference details;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setIdentifier(Id value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setCode(ResponseType value) {
        this.code = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDetails(ResourceReference value) {
        this.details = value;
    }

}
