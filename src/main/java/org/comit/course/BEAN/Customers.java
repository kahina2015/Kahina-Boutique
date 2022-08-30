package org.comit.course.BEAN;

public class Customers {

	String CostumerName;
	String adress;
	int PhoneNumber;
	String Email;
	String CreditcardInfo;
	String ShippingInfo;
		
	public Customers() {
		CostumerName="";
		adress="";
		PhoneNumber=0;
		Email="";
		CreditcardInfo="";
		ShippingInfo="";
		
	System.out.println(CostumerName);
	System.out.println(adress);
	System.out.println(Email);
	System.out.println(PhoneNumber);
	System.out.println(CreditcardInfo);
	System.out.println(ShippingInfo);
	}

	public Customers(String costumerName, String adress, int phoneNumber, String email, String creditcardInfo,
			String shippingInfo) {
		super();
		CostumerName = costumerName;
		this.adress = adress;
		PhoneNumber = phoneNumber;
		Email = email;
		CreditcardInfo = creditcardInfo;
		ShippingInfo = shippingInfo;
	}

	public String getCostumerName() {
		return CostumerName;
	}

	public void setCostumerName(String costumerName) {
		CostumerName = costumerName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCreditcardInfo() {
		return CreditcardInfo;
	}

	public void setCreditcardInfo(String creditcardInfo) {
		CreditcardInfo = creditcardInfo;
	}

	public String getShippingInfo() {
		return ShippingInfo;
	}

	public void setShippingInfo(String shippingInfo) {
		ShippingInfo = shippingInfo;
	}
}
	