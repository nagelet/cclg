
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
    "pfd0037"
})
@XmlRootElement(name = "BGM")
public class BGM {

    @XmlElement(name = "PF:D_0037", required = true)
    protected PFD0037 pfd0037;

    /**
     * Gets the value of the pfd0037 property.
     * 
     * @return
     *     possible object is
     *     {@link PFD0037 }
     *     
     */
    public PFD0037 getPFD0037() {
        return pfd0037;
    }

    /**
     * Sets the value of the pfd0037 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFD0037 }
     *     
     */
    public void setPFD0037(PFD0037 value) {
        this.pfd0037 = value;
    }

}
