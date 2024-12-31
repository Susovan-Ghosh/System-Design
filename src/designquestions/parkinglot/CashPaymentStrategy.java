package designquestions.parkinglot;

class CashPaymentStrategy implements PaymentStrategy {
	private static PaymentStrategy paymentStrategy;

	private CashPaymentStrategy() {
	}

	static PaymentStrategy getPaymentStrategy() {
		if (paymentStrategy == null) {
			paymentStrategy = new CashPaymentStrategy();
		}
		return paymentStrategy;
	}

	@Override
	public void makePayment(double price) {
		System.out.println("Cash payment done for Rs. " + price);
	}

}
