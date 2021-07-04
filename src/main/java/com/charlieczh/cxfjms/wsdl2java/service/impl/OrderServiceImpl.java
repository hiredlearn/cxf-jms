package com.charlieczh.cxfjms.wsdl2java.service.impl;

import com.charlieczh.cxfjms.wsdl2java.service.OrderService;
import com.charlieczh.cxfjms.wsdl2java.service.PostOrderRequest.Arg0;

public class OrderServiceImpl implements OrderService {
	public String postOrderRequest(Arg0 arg0) {
		System.out.println(arg0.getOrder().getEmail());
		return "Post Order Success";
	}
}
