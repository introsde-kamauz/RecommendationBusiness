
package introsde.resourceadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getMotivationResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getMotivationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getMotivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMotivationResponse", propOrder = {
    "getMotivation"
})
public class GetMotivationResponse {

    protected String getMotivation;

    /**
     * Recupera il valore della propriet� getMotivation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetMotivation() {
        return getMotivation;
    }

    /**
     * Imposta il valore della propriet� getMotivation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetMotivation(String value) {
        this.getMotivation = value;
    }

}
