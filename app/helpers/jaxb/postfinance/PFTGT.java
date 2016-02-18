
package helpers.jaxb.postfinance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pfd4752",
    "pfd4753",
    "pfd4754"
})
@XmlRootElement(name = "PF:TGT")
public class PFTGT {

    @XmlAttribute(name = "xmlns:PF")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsPF;
    @XmlElement(name = "PF:D_4752", required = true)
    protected PFD4752 pfd4752;
    @XmlElement(name = "PF:D_4753", required = true)
    protected PFD4753 pfd4753;
    @XmlElement(name = "PF:D_4754")
    protected PFD4754 pfd4754;

    /**
     * Gets the value of the xmlnsPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsPF() {
        if (xmlnsPF == null) {
            return "http://www.post.ch/xml";
        } else {
            return xmlnsPF;
        }
    }

    /**
     * Sets the value of the xmlnsPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsPF(String value) {
        this.xmlnsPF = value;
    }

    /**
     * Gets the value of the pfd4752 property.
     * 
     * @return
     *     possible object is
     *     {@link PFD4752 }
     *     
     */
    public PFD4752 getPFD4752() {
        return pfd4752;
    }

    /**
     * Sets the value of the pfd4752 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFD4752 }
     *     
     */
    public void setPFD4752(PFD4752 value) {
        this.pfd4752 = value;
    }

    /**
     * Gets the value of the pfd4753 property.
     * 
     * @return
     *     possible object is
     *     {@link PFD4753 }
     *     
     */
    public PFD4753 getPFD4753() {
        return pfd4753;
    }

    /**
     * Sets the value of the pfd4753 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFD4753 }
     *     
     */
    public void setPFD4753(PFD4753 value) {
        this.pfd4753 = value;
    }

    /**
     * Gets the value of the pfd4754 property.
     * 
     * @return
     *     possible object is
     *     {@link PFD4754 }
     *     
     */
    public PFD4754 getPFD4754() {
        return pfd4754;
    }

    /**
     * Sets the value of the pfd4754 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFD4754 }
     *     
     */
    public void setPFD4754(PFD4754 value) {
        this.pfd4754 = value;
    }

}
