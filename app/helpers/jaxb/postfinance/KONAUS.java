
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
    "bgm",
    "dtm",
    "sg2",
    "sg3",
    "pfftx",
    "sg4"
})
@XmlRootElement(name = "KONAUS")
public class KONAUS {

    @XmlElement(name = "BGM", required = true)
    protected BGM bgm;
    @XmlElement(name = "DTM", required = true)
    protected List<DTM> dtm;
    @XmlElement(name = "SG2", required = true)
    protected SG2 sg2;
    @XmlElement(name = "SG3", required = true)
    protected List<SG3> sg3;
    @XmlElement(name = "PF:FTX")
    protected List<PFFTX> pfftx;
    @XmlElement(name = "SG4", required = true)
    protected List<SG4> sg4;

    /**
     * Gets the value of the bgm property.
     * 
     * @return
     *     possible object is
     *     {@link BGM }
     *     
     */
    public BGM getBGM() {
        return bgm;
    }

    /**
     * Sets the value of the bgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BGM }
     *     
     */
    public void setBGM(BGM value) {
        this.bgm = value;
    }

    /**
     * Gets the value of the dtm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTM }
     * 
     * 
     */
    public List<DTM> getDTM() {
        if (dtm == null) {
            dtm = new ArrayList<DTM>();
        }
        return this.dtm;
    }

    /**
     * Gets the value of the sg2 property.
     * 
     * @return
     *     possible object is
     *     {@link SG2 }
     *     
     */
    public SG2 getSG2() {
        return sg2;
    }

    /**
     * Sets the value of the sg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SG2 }
     *     
     */
    public void setSG2(SG2 value) {
        this.sg2 = value;
    }

    /**
     * Gets the value of the sg3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sg3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSG3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SG3 }
     * 
     * 
     */
    public List<SG3> getSG3() {
        if (sg3 == null) {
            sg3 = new ArrayList<SG3>();
        }
        return this.sg3;
    }

    /**
     * Gets the value of the pfftx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfftx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFFTX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFFTX }
     * 
     * 
     */
    public List<PFFTX> getPFFTX() {
        if (pfftx == null) {
            pfftx = new ArrayList<PFFTX>();
        }
        return this.pfftx;
    }

    /**
     * Gets the value of the sg4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sg4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSG4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SG4 }
     * 
     * 
     */
    public List<SG4> getSG4() {
        if (sg4 == null) {
            sg4 = new ArrayList<SG4>();
        }
        return this.sg4;
    }

}
