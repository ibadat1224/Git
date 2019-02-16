package dunkins;

public class Order {
	private int quantity;
	private double price;
	private double totalPrice;
	private String itemName;
	// protected final double TAX_RATE=0.03;

	public Order() {
		this.quantity = 0;
		this.price = 0.0;
		itemName = "N/A";

		// }
		// public double calculateTax(){
		// return (quantity*price*TAX_RATE);
	}

	public double calculateTotalPrice() {
		totalPrice = quantity * price;
		return totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getTotalPrice() {
		return totalPrice;

	}

}
