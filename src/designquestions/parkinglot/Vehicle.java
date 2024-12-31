package designquestions.parkinglot;

class Vehicle {
	String id;
	VehicleType vehicleType;
	String pricingStrategy;
	String paymentStrategy;
	String parkingStrategy;

	Vehicle(String id, VehicleType vehicleType, String parkingStrategy, String pricingStrategy,
			String paymentStrategy) {
		this.id = id;
		this.vehicleType = vehicleType;
		this.parkingStrategy = parkingStrategy;
		this.pricingStrategy = pricingStrategy;
		this.paymentStrategy = paymentStrategy;
	}
}
