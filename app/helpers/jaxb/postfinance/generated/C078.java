
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
    "d3194",
    "d3192",
    "d3193",
    "d6345"
})
@XmlRootElement(name = "C078")
public class C078 {

    @XmlElement(name = "D_3194")
    protected D3194 d3194;
    @XmlElement(name = "D_3192")
    protected D3192 d3192;
    @XmlElement(name = "D_3193")
    protected D3193 d3193;
    @XmlElement(name = "D_6345", required = true)
    protected D6345 d6345;

    /**
     * Gets the value of the d3194 property.
     * 
     * @return
     *     possible object is
     *     {@link D3194 }
     *     
     */
    public D3194 getD3194() {
        return d3194;
    }

    /**
     * Sets the value of the d3194 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D3194 }
     *     
     */
    public void setD3194(D3194 value) {
        this.d3194 = value;
    }

    /**
     * Gets the value of the d3192 property.
     * 
     * @return
     *     possible object is
     *     {@link D3192 }
     *     
     */
    public D3192 getD3192() {
        return d3192;
    }

    /**
     * Sets the value of the d3192 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D3192 }
     *     
     */
    public void setD3192(D3192 value) {
        this.d3192 = value;
    }

    /**
     * Gets the value of the d3193 property.
     * 
     * @return
     *     possible object is
     *     {@link D3193 }
     *     
     */
    public D3193 getD3193() {
        return d3193;
    }

    /**
     * Sets the value of the d3193 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D3193 }
     *     
     */
    public void setD3193(D3193 value) {
        this.d3193 = value;
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
