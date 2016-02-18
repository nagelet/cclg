
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
    "moa",
    "dtm"
})
@XmlRootElement(name = "SG5")
public class SG5 {

    @XmlElement(name = "MOA")
    protected MOA moa;
    @XmlElement(name = "DTM")
    protected DTM dtm;

    /**
     * Gets the value of the moa property.
     * 
     * @return
     *     possible object is
     *     {@link MOA }
     *     
     */
    public MOA getMOA() {
        return moa;
    }

    /**
     * Sets the value of the moa property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOA }
     *     
     */
    public void setMOA(MOA value) {
        this.moa = value;
    }

    /**
     * Gets the value of the dtm property.
     * 
     * @return
     *     possible object is
     *     {@link DTM }
     *     
     */
    public DTM getDTM() {
        return dtm;
    }

    /**
     * Sets the value of the dtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTM }
     *     
     */
    public void setDTM(DTM value) {
        this.dtm = value;
    }

}
