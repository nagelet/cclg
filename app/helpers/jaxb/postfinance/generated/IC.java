
package helpers.jaxb.postfinance.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "icheader",
    "konaus",
    "ictrailer"
})
@XmlRootElement(name = "IC")
public class IC {

    @XmlAttribute(name = "xmlns:PF")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsPF;
    @XmlElement(name = "IC_HEADER")
    protected ICHEADER icheader;
    @XmlElement(name = "KONAUS", required = true)
    protected List<KONAUS> konaus;
    @XmlElement(name = "IC_TRAILER", required = true)
    protected ICTRAILER ictrailer;

    /**
     * Gets the value of the xmlnsPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsPF() {
        if (xmlnsPF == null) {
            return "http://www.post.ch/xml";
        } else {
            return xmlnsPF;
        }
    }

    /**
     * Sets the value of the xmlnsPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsPF(String value) {
        this.xmlnsPF = value;
    }

    /**
     * Gets the value of the icheader property.
     * 
     * @return
     *     possible object is
     *     {@link ICHEADER }
     *     
     */
    public ICHEADER getICHEADER() {
        return icheader;
    }

    /**
     * Sets the value of the icheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICHEADER }
     *     
     */
    public void setICHEADER(ICHEADER value) {
        this.icheader = value;
    }

    /**
     * Gets the value of the konaus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the konaus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKONAUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KONAUS }
     * 
     * 
     */
    public List<KONAUS> getKONAUS() {
        if (konaus == null) {
            konaus = new ArrayList<KONAUS>();
        }
        return this.konaus;
    }

    /**
     * Gets the value of the ictrailer property.
     * 
     * @return
     *     possible object is
     *     {@link ICTRAILER }
     *     
     */
    public ICTRAILER getICTRAILER() {
        return ictrailer;
    }

    /**
     * Sets the value of the ictrailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTRAILER }
     *     
     */
    public void setICTRAILER(ICTRAILER value) {
        this.ictrailer = value;
    }

}
