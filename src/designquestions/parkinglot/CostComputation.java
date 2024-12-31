package designquestions.parkinglot;

class CostComputation {
	PricingStrategyFactory pricingStrategyFactory;

	CostComputation() {
		pricingStrategyFactory = new PricingStrategyFactory();
	}

	double getPrice(Ticket ticket) {
		PricingStrategy pricingStrategy = pricingStrategyFactory.getPricingStrategy(ticket.vehicle.pricingStrategy);
		return pricingStrategy.getPrice(ticket);
	}
}
