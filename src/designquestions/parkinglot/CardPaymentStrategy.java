package designquestions.parkinglot;

class CardPaymentStrategy implements PaymentStrategy {
	private static PaymentStrategy paymentStrategy;

	private CardPaymentStrategy() {
	}

	static PaymentStrategy getPaymentStrategy() {
		if (paymentStrategy == null) {
			paymentStrategy = new CardPaymentStrategy();
		}
		return paymentStrategy;
	}

	@Override
	public void makePayment(double price) {
		System.out.println("Card payment done for Rs. " + price);
	}

}
