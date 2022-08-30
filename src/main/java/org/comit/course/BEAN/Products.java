package org.comit.course.BEAN;

public class Products {
	int ProductId;
	String ProductName;
	double Price;
	String size;
	String Color;
	
	public Products() {
		ProductId=0;
		ProductName="";
		Price=0;
		size="";
		Color="";
		
		System.out.println(ProductId);
		System.out.println(ProductName);
		System.out.println(Price);
		System.out.println(size);
		System.out.println(Color);
		
}

	public Products(int productId, String productName, double price, String size, String color) {
		super();
		ProductId = productId;
		ProductName = productName;
		Price = price;
		this.size = size;
		Color = color;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

}
