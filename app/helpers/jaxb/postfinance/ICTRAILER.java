
package helpers.jaxb.postfinance;

import java.util.ArrayList;
import java.util.List;
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
    "icinfo",
    "icgruss"
})
@XmlRootElement(name = "IC_TRAILER")
public class ICTRAILER {

    @XmlElement(name = "ICINFO")
    protected String icinfo;
    @XmlElement(name = "ICGRUSS", required = true)
    protected List<ICGRUSS> icgruss;

    /**
     * Gets the value of the icinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICINFO() {
        return icinfo;
    }

    /**
     * Sets the value of the icinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICINFO(String value) {
        this.icinfo = value;
    }

    /**
     * Gets the value of the icgruss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icgruss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getICGRUSS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ICGRUSS }
     * 
     * 
     */
    public List<ICGRUSS> getICGRUSS() {
        if (icgruss == null) {
            icgruss = new ArrayList<ICGRUSS>();
        }
        return this.icgruss;
    }

}
