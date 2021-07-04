package com.charlieczh.cxfjms.xsd2java.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.charlieczh.cxfjms.xsd2java.PostOrderRequest;
import com.charlieczh.cxfjms.xsd2java.service.OrderService;

@WebService(serviceName = "OrderService")
public class OrderService {
	@WebMethod(action="postOrder", operationName = "postOrderRequest")
	@WebResult(name = "message")
	public String postOrder(PostOrderRequest request) {
		return "Post Order Success";
	}
}
