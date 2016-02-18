
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
    "c076"
})
@XmlRootElement(name = "COM")
public class COM {

    @XmlElement(name = "C076", required = true)
    protected C076 c076;

    /**
     * Gets the value of the c076 property.
     * 
     * @return
     *     possible object is
     *     {@link C076 }
     *     
     */
    public C076 getC076() {
        return c076;
    }

    /**
     * Sets the value of the c076 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C076 }
     *     
     */
    public void setC076(C076 value) {
        this.c076 = value;
    }

}
