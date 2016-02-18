
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
    "c507"
})
@XmlRootElement(name = "DTM")
public class DTM {

    @XmlElement(name = "C507", required = true)
    protected C507 c507;

    /**
     * Gets the value of the c507 property.
     * 
     * @return
     *     possible object is
     *     {@link C507 }
     *     
     */
    public C507 getC507() {
        return c507;
    }

    /**
     * Sets the value of the c507 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C507 }
     *     
     */
    public void setC507(C507 value) {
        this.c507 = value;
    }

}
