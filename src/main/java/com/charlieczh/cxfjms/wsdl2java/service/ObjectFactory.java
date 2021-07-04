
package com.charlieczh.cxfjms.wsdl2java.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.charlieczh.cxfjms.wsdl2java.service package. 
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

    private final static QName _PostOrderRequest_QNAME = new QName("http://service.wsdl2java.cxfjms.charlieczh.com/", "postOrderRequest");
    private final static QName _PostOrderRequestResponse_QNAME = new QName("http://service.wsdl2java.cxfjms.charlieczh.com/", "postOrderRequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.charlieczh.cxfjms.wsdl2java.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostOrderRequest }
     * 
     */
    public PostOrderRequest createPostOrderRequest() {
        return new PostOrderRequest();
    }

    /**
     * Create an instance of {@link PostOrderRequestResponse }
     * 
     */
    public PostOrderRequestResponse createPostOrderRequestResponse() {
        return new PostOrderRequestResponse();
    }

    /**
     * Create an instance of {@link PostOrderRequest.Arg0 }
     * 
     */
    public PostOrderRequest.Arg0 createPostOrderRequestArg0() {
        return new PostOrderRequest.Arg0();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostOrderRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PostOrderRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.wsdl2java.cxfjms.charlieczh.com/", name = "postOrderRequest")
    public JAXBElement<PostOrderRequest> createPostOrderRequest(PostOrderRequest value) {
        return new JAXBElement<PostOrderRequest>(_PostOrderRequest_QNAME, PostOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostOrderRequestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PostOrderRequestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.wsdl2java.cxfjms.charlieczh.com/", name = "postOrderRequestResponse")
    public JAXBElement<PostOrderRequestResponse> createPostOrderRequestResponse(PostOrderRequestResponse value) {
        return new JAXBElement<PostOrderRequestResponse>(_PostOrderRequestResponse_QNAME, PostOrderRequestResponse.class, null, value);
    }

}
