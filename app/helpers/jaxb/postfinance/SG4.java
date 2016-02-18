
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
    "lin",
    "ftx",
    "sg5",
    "sg6"
})
@XmlRootElement(name = "SG4")
public class SG4 {

    @XmlElement(name = "LIN", required = true)
    protected LIN lin;
    @XmlElement(name = "FTX")
    protected List<FTX> ftx;
    @XmlElement(name = "SG5")
    protected SG5 sg5;
    @XmlElement(name = "SG6")
    protected List<SG6> sg6;

    /**
     * Gets the value of the lin property.
     * 
     * @return
     *     possible object is
     *     {@link LIN }
     *     
     */
    public LIN getLIN() {
        return lin;
    }

    /**
     * Sets the value of the lin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LIN }
     *     
     */
    public void setLIN(LIN value) {
        this.lin = value;
    }

    /**
     * Gets the value of the ftx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ftx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFTX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTX }
     * 
     * 
     */
    public List<FTX> getFTX() {
        if (ftx == null) {
            ftx = new ArrayList<FTX>();
        }
        return this.ftx;
    }

    /**
     * Gets the value of the sg5 property.
     * 
     * @return
     *     possible object is
     *     {@link SG5 }
     *     
     */
    public SG5 getSG5() {
        return sg5;
    }

    /**
     * Sets the value of the sg5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SG5 }
     *     
     */
    public void setSG5(SG5 value) {
        this.sg5 = value;
    }

    /**
     * Gets the value of the sg6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sg6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSG6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SG6 }
     * 
     * 
     */
    public List<SG6> getSG6() {
        if (sg6 == null) {
            sg6 = new ArrayList<SG6>();
        }
        return this.sg6;
    }

}
