
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
    "c506"
})
@XmlRootElement(name = "RFF")
public class RFF {

    @XmlElement(name = "C506", required = true)
    protected C506 c506;

    /**
     * Gets the value of the c506 property.
     * 
     * @return
     *     possible object is
     *     {@link C506 }
     *     
     */
    public C506 getC506() {
        return c506;
    }

    /**
     * Sets the value of the c506 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C506 }
     *     
     */
    public void setC506(C506 value) {
        this.c506 = value;
    }

}
