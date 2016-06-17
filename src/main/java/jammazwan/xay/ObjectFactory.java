
package jammazwan.xay;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import jammazwan.entity.Company;
import jammazwan.entity.CorporateEventPass;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jammazwan.xay package. 
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

    private final static QName _GetPass_QNAME = new QName("http://xay.jammazwan/", "getPass");
    private final static QName _GetPassResponse_QNAME = new QName("http://xay.jammazwan/", "getPassResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jammazwan.xay
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPass }
     * 
     */
    public GetPass createGetPass() {
        return new GetPass();
    }

    /**
     * Create an instance of {@link GetPassResponse }
     * 
     */
    public GetPassResponse createGetPassResponse() {
        return new GetPassResponse();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link CorporateEventPass }
     * 
     */
    public CorporateEventPass createCorporateEventPass() {
        return new CorporateEventPass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xay.jammazwan/", name = "getPass")
    public JAXBElement<GetPass> createGetPass(GetPass value) {
        return new JAXBElement<GetPass>(_GetPass_QNAME, GetPass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xay.jammazwan/", name = "getPassResponse")
    public JAXBElement<GetPassResponse> createGetPassResponse(GetPassResponse value) {
        return new JAXBElement<GetPassResponse>(_GetPassResponse_QNAME, GetPassResponse.class, null, value);
    }

}
