package com.charlieczh.cxfjms.wsdl2java.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2021-07-04T14:28:36.329+08:00
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://service.wsdl2java.cxfjms.charlieczh.com/", name = "OrderService")
@XmlSeeAlso({com.charlieczh.order.ObjectFactory.class, com.charlieczh.orderitem.ObjectFactory.class, com.charlieczh.perfume.ObjectFactory.class, ObjectFactory.class, com.charlieczh.orderservice.ObjectFactory.class})
public interface OrderService {

    @WebMethod(action = "postOrder")
    @RequestWrapper(localName = "postOrderRequest", targetNamespace = "http://service.wsdl2java.cxfjms.charlieczh.com/", className = "com.charlieczh.cxfjms.wsdl2java.service.PostOrderRequest")
    @ResponseWrapper(localName = "postOrderRequestResponse", targetNamespace = "http://service.wsdl2java.cxfjms.charlieczh.com/", className = "com.charlieczh.cxfjms.wsdl2java.service.PostOrderRequestResponse")
    @WebResult(name = "message", targetNamespace = "")
    public java.lang.String postOrderRequest(

        @WebParam(name = "arg0", targetNamespace = "")
        com.charlieczh.cxfjms.wsdl2java.service.PostOrderRequest.Arg0 arg0
    );
}
