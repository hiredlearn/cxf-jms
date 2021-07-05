package com.charlieczh.cxfjms.wsdl2java.service.impl;

import com.charlieczh.cxfjms.wsdl2java.service.OrderService;
import com.charlieczh.cxfjms.wsdl2java.service.PostOrderRequest.Arg0;
import com.charlieczh.order.Order;

public class OrderServiceImpl implements OrderService {
	public String postOrderRequest(Arg0 arg0) {
		Order o = arg0.getOrder();
		System.out.println("------------- SOAP Process Order Details -----------");
		System.out.println("Total Price:		" + o.getTotalPrice());
		System.out.println("Name:			" + o.getFirstName());
		System.out.println("Surname:		" + o.getLastName());
		System.out.println("City:			" + o.getCity());
		System.out.println("Address:		" + o.getAddress());
		System.out.println("Index:			" + o.getPostIndex());
		System.out.println("Mobile:			" + o.getPhoneNumber());
		System.out.println("Email Address:		" + o.getEmail());
		System.out.println("------------- SOAP Process Order Details -------------");
		System.out.println();
		System.out.println();
		return "Post Order Success";
	}
}
