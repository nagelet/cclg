
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
    "d3036"
})
@XmlRootElement(name = "C080")
public class C080 {

    @XmlElement(name = "D_3036", required = true)
    protected D3036 d3036;

    /**
     * Gets the value of the d3036 property.
     * 
     * @return
     *     possible object is
     *     {@link D3036 }
     *     
     */
    public D3036 getD3036() {
        return d3036;
    }

    /**
     * Sets the value of the d3036 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D3036 }
     *     
     */
    public void setD3036(D3036 value) {
        this.d3036 = value;
    }

}
