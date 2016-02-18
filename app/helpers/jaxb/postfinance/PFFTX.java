
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
    "d4451",
    "d4453",
    "c108"
})
@XmlRootElement(name = "PF:FTX")
public class PFFTX {

    @XmlAttribute(name = "xmlns:PF")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsPF;
    @XmlElement(name = "D_4451", required = true)
    protected D4451 d4451;
    @XmlElement(name = "D_4453")
    protected D4453 d4453;
    @XmlElement(name = "C108", required = true)
    protected C108 c108;

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
     * Gets the value of the d4451 property.
     * 
     * @return
     *     possible object is
     *     {@link D4451 }
     *     
     */
    public D4451 getD4451() {
        return d4451;
    }

    /**
     * Sets the value of the d4451 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D4451 }
     *     
     */
    public void setD4451(D4451 value) {
        this.d4451 = value;
    }

    /**
     * Gets the value of the d4453 property.
     * 
     * @return
     *     possible object is
     *     {@link D4453 }
     *     
     */
    public D4453 getD4453() {
        return d4453;
    }

    /**
     * Sets the value of the d4453 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D4453 }
     *     
     */
    public void setD4453(D4453 value) {
        this.d4453 = value;
    }

    /**
     * Gets the value of the c108 property.
     * 
     * @return
     *     possible object is
     *     {@link C108 }
     *     
     */
    public C108 getC108() {
        return c108;
    }

    /**
     * Sets the value of the c108 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C108 }
     *     
     */
    public void setC108(C108 value) {
        this.c108 = value;
    }

}
