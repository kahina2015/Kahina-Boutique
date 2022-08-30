package org.comit.course.BEAN;

public class ShoppingCart {

	int CardId;
	int ProductId;
	int Quantity;
	int DateAdded;
		
	public ShoppingCart() {
		CardId=0;
		ProductId=0;
		Quantity=0;
		DateAdded=0;
				
	}

	public ShoppingCart(int cardId, int productId, int quantity, int dateAdded) {
		super();
		CardId = cardId;
		ProductId = productId;
		Quantity = quantity;
		DateAdded = dateAdded;
	}

	public int getCardId() {
		return CardId;
	}

	public void setCardId(int cardId) {
		CardId = cardId;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getDateAdded() {
		return DateAdded;
	}

	public void setDateAdded(int dateAdded) {
		DateAdded = dateAdded;
	}
}
