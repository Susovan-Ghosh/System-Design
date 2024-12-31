package designquestions.parkinglot;

class PaymentStrategyFactory {
	PaymentStrategy getPaymentStrategy(String paymentStrategy) {
		if (paymentStrategy.equals("CashPayment")) {
			return CashPaymentStrategy.getPaymentStrategy();
		} else if (paymentStrategy.equals("CardPayment")) {
			return CardPaymentStrategy.getPaymentStrategy();
		} else {
			return CashPaymentStrategy.getPaymentStrategy();
		}
	}
}
