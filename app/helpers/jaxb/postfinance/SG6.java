
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
    "pftgt",
    "rff",
    "dtm",
    "moa",
    "pfepc",
    "ftx"
})
@XmlRootElement(name = "SG6")
public class SG6 {

    @XmlElement(name = "PF:TGT")
    protected List<PFTGT> pftgt;
    @XmlElement(name = "RFF")
    protected List<RFF> rff;
    @XmlElement(name = "DTM")
    protected List<DTM> dtm;
    @XmlElement(name = "MOA", required = true)
    protected MOA moa;
    @XmlElement(name = "PF:EPC")
    protected List<PFEPC> pfepc;
    @XmlElement(name = "FTX")
    protected List<FTX> ftx;

    /**
     * Gets the value of the pftgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pftgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFTGT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFTGT }
     * 
     * 
     */
    public List<PFTGT> getPFTGT() {
        if (pftgt == null) {
            pftgt = new ArrayList<PFTGT>();
        }
        return this.pftgt;
    }

    /**
     * Gets the value of the rff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRFF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RFF }
     * 
     * 
     */
    public List<RFF> getRFF() {
        if (rff == null) {
            rff = new ArrayList<RFF>();
        }
        return this.rff;
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
     * Gets the value of the pfepc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfepc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFEPC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFEPC }
     * 
     * 
     */
    public List<PFEPC> getPFEPC() {
        if (pfepc == null) {
            pfepc = new ArrayList<PFEPC>();
        }
        return this.pfepc;
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

}
