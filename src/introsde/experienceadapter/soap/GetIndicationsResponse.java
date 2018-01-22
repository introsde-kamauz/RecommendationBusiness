
package introsde.experienceadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getIndicationsResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getIndicationsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getIndications" type="{http://soap.experienceadapter.introsde/}experience" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIndicationsResponse", propOrder = {
    "getIndications"
})
public class GetIndicationsResponse {

    protected Experience getIndications;

    /**
     * Recupera il valore della proprietà getIndications.
     * 
     * @return
     *     possible object is
     *     {@link Experience }
     *     
     */
    public Experience getGetIndications() {
        return getIndications;
    }

    /**
     * Imposta il valore della proprietà getIndications.
     * 
     * @param value
     *     allowed object is
     *     {@link Experience }
     *     
     */
    public void setGetIndications(Experience value) {
        this.getIndications = value;
    }

}
