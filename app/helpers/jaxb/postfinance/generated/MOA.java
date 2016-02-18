
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
    "c516",
    "pfd5003"
})
@XmlRootElement(name = "MOA")
public class MOA {

    @XmlElement(name = "C516", required = true)
    protected C516 c516;
    @XmlElement(name = "PF:D_5003")
    protected PFD5003 pfd5003;

    /**
     * Gets the value of the c516 property.
     * 
     * @return
     *     possible object is
     *     {@link C516 }
     *     
     */
    public C516 getC516() {
        return c516;
    }

    /**
     * Sets the value of the c516 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C516 }
     *     
     */
    public void setC516(C516 value) {
        this.c516 = value;
    }

    /**
     * Gets the value of the pfd5003 property.
     * 
     * @return
     *     possible object is
     *     {@link PFD5003 }
     *     
     */
    public PFD5003 getPFD5003() {
        return pfd5003;
    }

    /**
     * Sets the value of the pfd5003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFD5003 }
     *     
     */
    public void setPFD5003(PFD5003 value) {
        this.pfd5003 = value;
    }

}
