
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
    "ichdr",
    "icpform",
    "icvvnr",
    "icvvtxt"
})
@XmlRootElement(name = "IC_HEADER")
public class ICHEADER {

    @XmlElement(name = "ICHDR")
    protected String ichdr;
    @XmlElement(name = "ICPFORM")
    protected String icpform;
    @XmlElement(name = "ICVVNR")
    protected String icvvnr;
    @XmlElement(name = "ICVVTXT")
    protected String icvvtxt;

    /**
     * Gets the value of the ichdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICHDR() {
        return ichdr;
    }

    /**
     * Sets the value of the ichdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICHDR(String value) {
        this.ichdr = value;
    }

    /**
     * Gets the value of the icpform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICPFORM() {
        return icpform;
    }

    /**
     * Sets the value of the icpform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICPFORM(String value) {
        this.icpform = value;
    }

    /**
     * Gets the value of the icvvnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICVVNR() {
        return icvvnr;
    }

    /**
     * Sets the value of the icvvnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICVVNR(String value) {
        this.icvvnr = value;
    }

    /**
     * Gets the value of the icvvtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICVVTXT() {
        return icvvtxt;
    }

    /**
     * Sets the value of the icvvtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICVVTXT(String value) {
        this.icvvtxt = value;
    }

}
