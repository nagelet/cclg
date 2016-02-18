
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
    "d3035",
    "c058",
    "c080",
    "c059",
    "d3164",
    "d3251"
})
@XmlRootElement(name = "NAD")
public class NAD {

    @XmlElement(name = "D_3035", required = true)
    protected D3035 d3035;
    @XmlElement(name = "C058")
    protected C058 c058;
    @XmlElement(name = "C080")
    protected C080 c080;
    @XmlElement(name = "C059")
    protected C059 c059;
    @XmlElement(name = "D_3164")
    protected String d3164;
    @XmlElement(name = "D_3251")
    protected String d3251;

    /**
     * Gets the value of the d3035 property.
     * 
     * @return
     *     possible object is
     *     {@link D3035 }
     *     
     */
    public D3035 getD3035() {
        return d3035;
    }

    /**
     * Sets the value of the d3035 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D3035 }
     *     
     */
    public void setD3035(D3035 value) {
        this.d3035 = value;
    }

    /**
     * Gets the value of the c058 property.
     * 
     * @return
     *     possible object is
     *     {@link C058 }
     *     
     */
    public C058 getC058() {
        return c058;
    }

    /**
     * Sets the value of the c058 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C058 }
     *     
     */
    public void setC058(C058 value) {
        this.c058 = value;
    }

    /**
     * Gets the value of the c080 property.
     * 
     * @return
     *     possible object is
     *     {@link C080 }
     *     
     */
    public C080 getC080() {
        return c080;
    }

    /**
     * Sets the value of the c080 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C080 }
     *     
     */
    public void setC080(C080 value) {
        this.c080 = value;
    }

    /**
     * Gets the value of the c059 property.
     * 
     * @return
     *     possible object is
     *     {@link C059 }
     *     
     */
    public C059 getC059() {
        return c059;
    }

    /**
     * Sets the value of the c059 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C059 }
     *     
     */
    public void setC059(C059 value) {
        this.c059 = value;
    }

    /**
     * Gets the value of the d3164 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD3164() {
        return d3164;
    }

    /**
     * Sets the value of the d3164 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD3164(String value) {
        this.d3164 = value;
    }

    /**
     * Gets the value of the d3251 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD3251() {
        return d3251;
    }

    /**
     * Sets the value of the d3251 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD3251(String value) {
        this.d3251 = value;
    }

}
