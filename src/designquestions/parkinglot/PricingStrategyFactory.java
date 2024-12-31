package designquestions.parkinglot;

class PricingStrategyFactory {
	PricingStrategy getPricingStrategy(String strategyType) {
		if (strategyType.equals("HourlyPricing")) {
			return HourlyPricingStrategy.getPricingStrategy();
		} else if (strategyType.equals("DailyPricing")) {
			return DailyPricingStrategy.getPricingStrategy();
		} else {
			return HourlyPricingStrategy.getPricingStrategy();
		}
	}
}
