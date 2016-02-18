
package helpers.jaxb.postfinance;

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
    "c078",
    "pfd5388"
})
@XmlRootElement(name = "FII")
public class FII {

    @XmlElement(name = "C078", required = true)
    protected C078 c078;
    @XmlElement(name = "PF:D_5388")
    protected PFD5388 pfd5388;

    /**
     * Gets the value of the c078 property.
     * 
     * @return
     *     possible object is
     *     {@link C078 }
     *     
     */
    public C078 getC078() {
        return c078;
    }

    /**
     * Sets the value of the c078 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C078 }
     *     
     */
    public void setC078(C078 value) {
        this.c078 = value;
    }

    /**
     * Gets the value of the pfd5388 property.
     * 
     * @return
     *     possible object is
     *     {@link PFD5388 }
     *     
     */
    public PFD5388 getPFD5388() {
        return pfd5388;
    }

    /**
     * Sets the value of the pfd5388 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFD5388 }
     *     
     */
    public void setPFD5388(PFD5388 value) {
        this.pfd5388 = value;
    }

}
