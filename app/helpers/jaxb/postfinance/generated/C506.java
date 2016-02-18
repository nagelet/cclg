
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
    "d1153",
    "d1154"
})
@XmlRootElement(name = "C506")
public class C506 {

    @XmlElement(name = "D_1153", required = true)
    protected D1153 d1153;
    @XmlElement(name = "D_1154", required = true)
    protected String d1154;

    /**
     * Gets the value of the d1153 property.
     * 
     * @return
     *     possible object is
     *     {@link D1153 }
     *     
     */
    public D1153 getD1153() {
        return d1153;
    }

    /**
     * Sets the value of the d1153 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D1153 }
     *     
     */
    public void setD1153(D1153 value) {
        this.d1153 = value;
    }

    /**
     * Gets the value of the d1154 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD1154() {
        return d1154;
    }

    /**
     * Sets the value of the d1154 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD1154(String value) {
        this.d1154 = value;
    }

}
