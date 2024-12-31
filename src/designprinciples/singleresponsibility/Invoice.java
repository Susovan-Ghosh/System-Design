package designprinciples.singleresponsibility;

public class Invoice {
	int quantity;
	int price;
	private int total;

	public Invoice(int quantity, int price) {
		this.quantity = quantity;
		this.price = price;
		calculateTotal();
	}

	private void calculateTotal() {
		total = quantity * price;
	}

	int getTotal() {
		return total;
	}
}
