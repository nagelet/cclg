
package helpers.jaxb.postfinance.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "d5025",
    "d5004",
    "d6345"
})
@XmlRootElement(name = "C516")
public class C516 {

    @XmlElement(name = "D_5025", required = true)
    protected D5025 d5025;
    @XmlElement(name = "D_5004", required = true)
    protected String d5004;
    @XmlElement(name = "D_6345")
    protected D6345 d6345;

    /**
     * Gets the value of the d5025 property.
     * 
     * @return
     *     possible object is
     *     {@link D5025 }
     *     
     */
    public D5025 getD5025() {
        return d5025;
    }

    /**
     * Sets the value of the d5025 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D5025 }
     *     
     */
    public void setD5025(D5025 value) {
        this.d5025 = value;
    }

    /**
     * Gets the value of the d5004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD5004() {
        return d5004;
    }

    /**
     * Sets the value of the d5004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD5004(String value) {
        this.d5004 = value;
    }

    /**
     * Gets the value of the d6345 property.
     * 
     * @return
     *     possible object is
     *     {@link D6345 }
     *     
     */
    public D6345 getD6345() {
        return d6345;
    }

    /**
     * Sets the value of the d6345 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D6345 }
     *     
     */
    public void setD6345(D6345 value) {
        this.d6345 = value;
    }

}
