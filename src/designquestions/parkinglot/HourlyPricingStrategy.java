package designquestions.parkinglot;

public class HourlyPricingStrategy implements PricingStrategy {
	private static PricingStrategy pricingStrategy;

	private HourlyPricingStrategy() {
	}

	static PricingStrategy getPricingStrategy() {
		if (pricingStrategy == null) {
			pricingStrategy = new HourlyPricingStrategy();
		}
		return pricingStrategy;
	}

	@Override
	public double getPrice(Ticket ticket) {
		return (((System.currentTimeMillis() - ticket.entryTime) / ((1000.0 * 60 * 60)))
				* ticket.parkingSpot.getPrice());
	}

}
