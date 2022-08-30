package org.comit.course.BEAN;

public class ShippingInfo {

	int ShippingId;
	String ShippingType;
	double ShippingCost;
	int ShippingRegionId;
		
	public ShippingInfo() {
		ShippingId= 0;
		ShippingType= "";
		ShippingCost= 0;
		ShippingRegionId= 0;
				
		System.out.println(ShippingId);
		System.out.println(ShippingType);
		System.out.println(ShippingCost);
		System.out.println(ShippingRegionId);
		
}

	public ShippingInfo(int shippingId, String shippingType, double shippingCost, int shippingRegionId) {
		super();
		ShippingId = shippingId;
		ShippingType = shippingType;
		ShippingCost = shippingCost;
		ShippingRegionId = shippingRegionId;
	}

	public int getShippingId() {
		return ShippingId;
	}

	public void setShippingId(int shippingId) {
		ShippingId = shippingId;
	}

	public String getShippingType() {
		return ShippingType;
	}

	public void setShippingType(String shippingType) {
		ShippingType = shippingType;
	}

	public double getShippingCost() {
		return ShippingCost;
	}

	public void setShippingCost(double shippingCost) {
		ShippingCost = shippingCost;
	}

	public int getShippingRegionId() {
		return ShippingRegionId;
	}

	public void setShippingRegionId(int shippingRegionId) {
		ShippingRegionId = shippingRegionId;
	}
}
	
