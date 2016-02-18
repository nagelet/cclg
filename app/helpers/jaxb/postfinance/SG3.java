
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
    "nad",
    "com"
})
@XmlRootElement(name = "SG3")
public class SG3 {

    @XmlElement(name = "NAD", required = true)
    protected NAD nad;
    @XmlElement(name = "COM")
    protected List<COM> com;

    /**
     * Gets the value of the nad property.
     * 
     * @return
     *     possible object is
     *     {@link NAD }
     *     
     */
    public NAD getNAD() {
        return nad;
    }

    /**
     * Sets the value of the nad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAD }
     *     
     */
    public void setNAD(NAD value) {
        this.nad = value;
    }

    /**
     * Gets the value of the com property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the com property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COM }
     * 
     * 
     */
    public List<COM> getCOM() {
        if (com == null) {
            com = new ArrayList<COM>();
        }
        return this.com;
    }

}
