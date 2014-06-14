//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.12 at 12:19:07 PM EDT 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Conformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ConformanceStatementStatus" minOccurs="0"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="software" type="{http://hl7.org/fhir}Conformance.Software" minOccurs="0"/>
 *         &lt;element name="implementation" type="{http://hl7.org/fhir}Conformance.Implementation" minOccurs="0"/>
 *         &lt;element name="fhirVersion" type="{http://hl7.org/fhir}id"/>
 *         &lt;element name="acceptUnknown" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="format" type="{http://hl7.org/fhir}code" maxOccurs="unbounded"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rest" type="{http://hl7.org/fhir}Conformance.Rest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messaging" type="{http://hl7.org/fhir}Conformance.Messaging" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="document" type="{http://hl7.org/fhir}Conformance.Document" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecom",
    "description",
    "status",
    "experimental",
    "date",
    "software",
    "implementation",
    "fhirVersion",
    "acceptUnknown",
    "format",
    "profile",
    "rest",
    "messaging",
    "document"
})
public class Conformance
    extends Resource
{

    protected String identifier;
    protected String version;
    protected String name;
    @XmlElement(required = true)
    protected String publisher;
    protected List<Contact> telecom;
    protected String description;
    protected ConformanceStatementStatus status;
    protected Boolean experimental;
    @XmlElement(required = true)
    protected DateTime date;
    protected ConformanceSoftware software;
    protected ConformanceImplementation implementation;
    @XmlElement(required = true)
    protected Id fhirVersion;
    @XmlElement(required = true)
    protected Boolean acceptUnknown;
    @XmlElement(required = true)
    protected List<Code> format;
    protected List<ResourceReference> profile;
    protected List<ConformanceRest> rest;
    protected List<ConformanceMessaging> messaging;
    protected List<ConformanceDocument> document;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<Contact>();
        }
        return this.telecom;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceStatementStatus }
     *     
     */
    public ConformanceStatementStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceStatementStatus }
     *     
     */
    public void setStatus(ConformanceStatementStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the experimental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * Sets the value of the experimental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperimental(Boolean value) {
        this.experimental = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the software property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceSoftware }
     *     
     */
    public ConformanceSoftware getSoftware() {
        return software;
    }

    /**
     * Sets the value of the software property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceSoftware }
     *     
     */
    public void setSoftware(ConformanceSoftware value) {
        this.software = value;
    }

    /**
     * Gets the value of the implementation property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceImplementation }
     *     
     */
    public ConformanceImplementation getImplementation() {
        return implementation;
    }

    /**
     * Sets the value of the implementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceImplementation }
     *     
     */
    public void setImplementation(ConformanceImplementation value) {
        this.implementation = value;
    }

    /**
     * Gets the value of the fhirVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getFhirVersion() {
        return fhirVersion;
    }

    /**
     * Sets the value of the fhirVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setFhirVersion(Id value) {
        this.fhirVersion = value;
    }

    /**
     * Gets the value of the acceptUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAcceptUnknown() {
        return acceptUnknown;
    }

    /**
     * Sets the value of the acceptUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptUnknown(Boolean value) {
        this.acceptUnknown = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getFormat() {
        if (format == null) {
            format = new ArrayList<Code>();
        }
        return this.format;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getProfile() {
        if (profile == null) {
            profile = new ArrayList<ResourceReference>();
        }
        return this.profile;
    }

    /**
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceRest }
     * 
     * 
     */
    public List<ConformanceRest> getRest() {
        if (rest == null) {
            rest = new ArrayList<ConformanceRest>();
        }
        return this.rest;
    }

    /**
     * Gets the value of the messaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceMessaging }
     * 
     * 
     */
    public List<ConformanceMessaging> getMessaging() {
        if (messaging == null) {
            messaging = new ArrayList<ConformanceMessaging>();
        }
        return this.messaging;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceDocument }
     * 
     * 
     */
    public List<ConformanceDocument> getDocument() {
        if (document == null) {
            document = new ArrayList<ConformanceDocument>();
        }
        return this.document;
    }

}