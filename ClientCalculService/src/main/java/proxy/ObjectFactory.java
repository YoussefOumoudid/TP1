
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _Somme_QNAME = new QName("http://ws.example.org/", "somme");
    private final static QName _SoustractionResponse_QNAME = new QName("http://ws.example.org/", "soustractionResponse");
    private final static QName _SommeResponse_QNAME = new QName("http://ws.example.org/", "sommeResponse");
    private final static QName _InverserResponse_QNAME = new QName("http://ws.example.org/", "inverserResponse");
    private final static QName _Inverser_QNAME = new QName("http://ws.example.org/", "inverser");
    private final static QName _Multiplication_QNAME = new QName("http://ws.example.org/", "multiplication");
    private final static QName _MultiplicationResponse_QNAME = new QName("http://ws.example.org/", "multiplicationResponse");
    private final static QName _Soustraction_QNAME = new QName("http://ws.example.org/", "soustraction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Somme }
     * 
     */
    public Somme createSomme() {
        return new Somme();
    }

    /**
     * Create an instance of {@link SoustractionResponse }
     * 
     */
    public SoustractionResponse createSoustractionResponse() {
        return new SoustractionResponse();
    }

    /**
     * Create an instance of {@link SommeResponse }
     * 
     */
    public SommeResponse createSommeResponse() {
        return new SommeResponse();
    }

    /**
     * Create an instance of {@link InverserResponse }
     * 
     */
    public InverserResponse createInverserResponse() {
        return new InverserResponse();
    }

    /**
     * Create an instance of {@link Inverser }
     * 
     */
    public Inverser createInverser() {
        return new Inverser();
    }

    /**
     * Create an instance of {@link Multiplication }
     * 
     */
    public Multiplication createMultiplication() {
        return new Multiplication();
    }

    /**
     * Create an instance of {@link MultiplicationResponse }
     * 
     */
    public MultiplicationResponse createMultiplicationResponse() {
        return new MultiplicationResponse();
    }

    /**
     * Create an instance of {@link Soustraction }
     * 
     */
    public Soustraction createSoustraction() {
        return new Soustraction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "somme")
    public JAXBElement<Somme> createSomme(Somme value) {
        return new JAXBElement<Somme>(_Somme_QNAME, Somme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "soustractionResponse")
    public JAXBElement<SoustractionResponse> createSoustractionResponse(SoustractionResponse value) {
        return new JAXBElement<SoustractionResponse>(_SoustractionResponse_QNAME, SoustractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "sommeResponse")
    public JAXBElement<SommeResponse> createSommeResponse(SommeResponse value) {
        return new JAXBElement<SommeResponse>(_SommeResponse_QNAME, SommeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InverserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "inverserResponse")
    public JAXBElement<InverserResponse> createInverserResponse(InverserResponse value) {
        return new JAXBElement<InverserResponse>(_InverserResponse_QNAME, InverserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inverser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "inverser")
    public JAXBElement<Inverser> createInverser(Inverser value) {
        return new JAXBElement<Inverser>(_Inverser_QNAME, Inverser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "multiplication")
    public JAXBElement<Multiplication> createMultiplication(Multiplication value) {
        return new JAXBElement<Multiplication>(_Multiplication_QNAME, Multiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "multiplicationResponse")
    public JAXBElement<MultiplicationResponse> createMultiplicationResponse(MultiplicationResponse value) {
        return new JAXBElement<MultiplicationResponse>(_MultiplicationResponse_QNAME, MultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "soustraction")
    public JAXBElement<Soustraction> createSoustraction(Soustraction value) {
        return new JAXBElement<Soustraction>(_Soustraction_QNAME, Soustraction.class, null, value);
    }

}
