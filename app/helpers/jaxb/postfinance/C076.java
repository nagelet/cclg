
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
    "d3148",
    "d3155"
})
@XmlRootElement(name = "C076")
public class C076 {

    @XmlElement(name = "D_3148", required = true)
    protected D3148 d3148;
    @XmlElement(name = "D_3155", required = true)
    protected D3155 d3155;

    /**
     * Gets the value of the d3148 property.
     * 
     * @return
     *     possible object is
     *     {@link D3148 }
     *     
     */
    public D3148 getD3148() {
        return d3148;
    }

    /**
     * Sets the value of the d3148 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D3148 }
     *     
     */
    public void setD3148(D3148 value) {
        this.d3148 = value;
    }

    /**
     * Gets the value of the d3155 property.
     * 
     * @return
     *     possible object is
     *     {@link D3155 }
     *     
     */
    public D3155 getD3155() {
        return d3155;
    }

    /**
     * Sets the value of the d3155 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D3155 }
     *     
     */
    public void setD3155(D3155 value) {
        this.d3155 = value;
    }

}
