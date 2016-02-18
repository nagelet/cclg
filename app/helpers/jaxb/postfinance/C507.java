
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
    "d2005",
    "d2380"
})
@XmlRootElement(name = "C507")
public class C507 {

    @XmlElement(name = "D_2005", required = true)
    protected D2005 d2005;
    @XmlElement(name = "D_2380", required = true)
    protected D2380 d2380;

    /**
     * Gets the value of the d2005 property.
     * 
     * @return
     *     possible object is
     *     {@link D2005 }
     *     
     */
    public D2005 getD2005() {
        return d2005;
    }

    /**
     * Sets the value of the d2005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D2005 }
     *     
     */
    public void setD2005(D2005 value) {
        this.d2005 = value;
    }

    /**
     * Gets the value of the d2380 property.
     * 
     * @return
     *     possible object is
     *     {@link D2380 }
     *     
     */
    public D2380 getD2380() {
        return d2380;
    }

    /**
     * Sets the value of the d2380 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D2380 }
     *     
     */
    public void setD2380(D2380 value) {
        this.d2380 = value;
    }

}
