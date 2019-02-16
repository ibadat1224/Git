package dunkins;

public final class OnlineOrder extends Order {
	private double shippingRate;

	public double getShippingRate() {
		return shippingRate;
	}

	public void setShippingRate(double shippingRate) {
		this.shippingRate = shippingRate;
	}

	@Override

	public double calculateTotalPrice() {
		return getQuantity() * getPrice() + (shippingRate * getQuantity());
	}

	public double calculateTotalPrice(boolean freeShipping) {
		if (freeShipping) {
			return getQuantity() * getPrice();
		} else {
			return getQuantity() * getPrice() + (shippingRate * getQuantity());
		}

	}
}
