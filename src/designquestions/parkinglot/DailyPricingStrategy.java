package designquestions.parkinglot;

public class DailyPricingStrategy implements PricingStrategy {
	private static PricingStrategy pricingStrategy;

	private DailyPricingStrategy() {
	}

	static PricingStrategy getPricingStrategy() {
		if (pricingStrategy == null) {
			pricingStrategy = new DailyPricingStrategy();
		}
		return pricingStrategy;
	}

	@Override
	public double getPrice(Ticket ticket) {
		return (((System.currentTimeMillis() - ticket.entryTime) / ((1000.0 * 60 * 60 * 24)))
				* ticket.parkingSpot.getPrice());
	}

}
