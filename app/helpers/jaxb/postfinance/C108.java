
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
    "d4440"
})
@XmlRootElement(name = "C108")
public class C108 {

    @XmlElement(name = "D_4440", required = true)
    protected List<D4440> d4440;

    /**
     * Gets the value of the d4440 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d4440 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD4440().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D4440 }
     * 
     * 
     */
    public List<D4440> getD4440() {
        if (d4440 == null) {
            d4440 = new ArrayList<D4440>();
        }
        return this.d4440;
    }

}
