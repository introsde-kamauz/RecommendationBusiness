
package introsde.experienceadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per experience complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="experience">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="max_temperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="min_temperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="precipitations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experience", propOrder = {
    "distance",
    "duration",
    "maxTemperature",
    "minTemperature",
    "precipitations"
})
public class Experience {

    protected String distance;
    protected String duration;
    @XmlElement(name = "max_temperature")
    protected Double maxTemperature;
    @XmlElement(name = "min_temperature")
    protected Double minTemperature;
    protected String precipitations;

    /**
     * Recupera il valore della proprietà distance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Imposta il valore della proprietà distance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Recupera il valore della proprietà duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Recupera il valore della proprietà maxTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * Imposta il valore della proprietà maxTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTemperature(Double value) {
        this.maxTemperature = value;
    }

    /**
     * Recupera il valore della proprietà minTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinTemperature() {
        return minTemperature;
    }

    /**
     * Imposta il valore della proprietà minTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinTemperature(Double value) {
        this.minTemperature = value;
    }

    /**
     * Recupera il valore della proprietà precipitations.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecipitations() {
        return precipitations;
    }

    /**
     * Imposta il valore della proprietà precipitations.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecipitations(String value) {
        this.precipitations = value;
    }

}
