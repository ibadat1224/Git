package dunkins;

public class Orders {
	public static void main(String[] args) {

		OnlineOrder laptopOrder = new OnlineOrder();
		laptopOrder.setItemName("MacBOOk Pro");
		laptopOrder.setPrice(1299.99);
		laptopOrder.setQuantity(16);
		laptopOrder.setShippingRate(15.50);

		double totalPrice = laptopOrder.calculateTotalPrice();
		System.out.println("Total price is $" + totalPrice);

		double totalPriceWithFreeShipping = laptopOrder.calculateTotalPrice(true);
		System.out.println("Total price with free shipping is $" + totalPriceWithFreeShipping);

	}
}
