
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
    "fii"
})
@XmlRootElement(name = "SG2")
public class SG2 {

    @XmlElement(name = "FII", required = true)
    protected FII fii;

    /**
     * Gets the value of the fii property.
     * 
     * @return
     *     possible object is
     *     {@link FII }
     *     
     */
    public FII getFII() {
        return fii;
    }

    /**
     * Sets the value of the fii property.
     * 
     * @param value
     *     allowed object is
     *     {@link FII }
     *     
     */
    public void setFII(FII value) {
        this.fii = value;
    }

}
