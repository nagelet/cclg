
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
    "d3124"
})
@XmlRootElement(name = "C058")
public class C058 {

    @XmlElement(name = "D_3124", required = true)
    protected List<D3124> d3124;

    /**
     * Gets the value of the d3124 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d3124 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD3124().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D3124 }
     * 
     * 
     */
    public List<D3124> getD3124() {
        if (d3124 == null) {
            d3124 = new ArrayList<D3124>();
        }
        return this.d3124;
    }

}
