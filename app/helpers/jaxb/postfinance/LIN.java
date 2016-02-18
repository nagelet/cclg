
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
    "pfd0805"
})
@XmlRootElement(name = "LIN")
public class LIN {

    @XmlElement(name = "PF:D_0805", required = true)
    protected PFD0805 pfd0805;

    /**
     * Gets the value of the pfd0805 property.
     * 
     * @return
     *     possible object is
     *     {@link PFD0805 }
     *     
     */
    public PFD0805 getPFD0805() {
        return pfd0805;
    }

    /**
     * Sets the value of the pfd0805 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFD0805 }
     *     
     */
    public void setPFD0805(PFD0805 value) {
        this.pfd0805 = value;
    }

}
