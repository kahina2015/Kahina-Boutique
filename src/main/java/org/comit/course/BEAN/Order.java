package org.comit.course.BEAN;

public class Order {
	int orderId;
	String DateCreated;
	String DateShipped;
	String CustomerName;
	String CustomerId;
	String ShippingId;
	

	public Order() {
		orderId=0;
		DateCreated="";
		DateShipped="";
		CustomerName="";
		CustomerId="";
		ShippingId="";
		
		System.out.println(orderId);
		System.out.println(DateCreated);
		System.out.println(DateShipped);
		System.out.println(CustomerId);
		System.out.println(ShippingId);
		System.out.println(DateShipped);
}


	public Order(int orderId, String dateCreated, String dateShipped, String customerName, String customerId,
			String shippingId) {
		super();
		this.orderId = orderId;
		DateCreated = dateCreated;
		DateShipped = dateShipped;
		CustomerName = customerName;
		CustomerId = customerId;
		ShippingId = shippingId;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getDateCreated() {
		return DateCreated;
	}


	public void setDateCreated(String dateCreated) {
		DateCreated = dateCreated;
	}


	public String getDateShipped() {
		return DateShipped;
	}


	public void setDateShipped(String dateShipped) {
		DateShipped = dateShipped;
	}


	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}


	public String getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}


	public String getShippingId() {
		return ShippingId;
	}


	public void setShippingId(String shippingId) {
		ShippingId = shippingId;
	}
}
