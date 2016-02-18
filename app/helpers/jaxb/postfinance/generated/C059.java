
package helpers.jaxb.postfinance.generated;

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
    "d3042"
})
@XmlRootElement(name = "C059")
public class C059 {

    @XmlElement(name = "D_3042", required = true)
    protected List<D3042> d3042;

    /**
     * Gets the value of the d3042 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d3042 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD3042().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D3042 }
     * 
     * 
     */
    public List<D3042> getD3042() {
        if (d3042 == null) {
            d3042 = new ArrayList<D3042>();
        }
        return this.d3042;
    }

}
