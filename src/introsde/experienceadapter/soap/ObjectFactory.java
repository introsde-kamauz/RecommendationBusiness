
package introsde.experienceadapter.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.experienceadapter.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetIndications_QNAME = new QName("http://soap.experienceadapter.introsde/", "getIndications");
    private final static QName _GetIndicationsResponse_QNAME = new QName("http://soap.experienceadapter.introsde/", "getIndicationsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.experienceadapter.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIndicationsResponse }
     * 
     */
    public GetIndicationsResponse createGetIndicationsResponse() {
        return new GetIndicationsResponse();
    }

    /**
     * Create an instance of {@link GetIndications }
     * 
     */
    public GetIndications createGetIndications() {
        return new GetIndications();
    }

    /**
     * Create an instance of {@link Experience }
     * 
     */
    public Experience createExperience() {
        return new Experience();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIndications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.experienceadapter.introsde/", name = "getIndications")
    public JAXBElement<GetIndications> createGetIndications(GetIndications value) {
        return new JAXBElement<GetIndications>(_GetIndications_QNAME, GetIndications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIndicationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.experienceadapter.introsde/", name = "getIndicationsResponse")
    public JAXBElement<GetIndicationsResponse> createGetIndicationsResponse(GetIndicationsResponse value) {
        return new JAXBElement<GetIndicationsResponse>(_GetIndicationsResponse_QNAME, GetIndicationsResponse.class, null, value);
    }

}
