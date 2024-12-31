package designquestions.parkinglot;

class ExitGate {
	CostComputation costComputation;
	PaymentStrategyFactory paymentStrategyFactory;
	ParkingSpotManagerFactory parkingSpotManagerFactory;

	ExitGate() {
		costComputation = new CostComputation();
		paymentStrategyFactory = new PaymentStrategyFactory();
		parkingSpotManagerFactory = new ParkingSpotManagerFactory();
	}

	double getPrice(Ticket ticket) {
		ticket.price = costComputation.getPrice(ticket);
		return ticket.price;
	}

	void makePayment(Ticket ticket) {
		paymentStrategyFactory.getPaymentStrategy(ticket.vehicle.paymentStrategy).makePayment(ticket.price);
	}

	void removeVehicle(Ticket ticket) {
		ParkingSpot parkingSpot = ticket.parkingSpot;
		Vehicle vehicle = ticket.vehicle;
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.vehicleType,
				parkingSpot.getParkingStrategy());
		parkingSpot.setEmpty(true);
		parkingSpotManager.addParkingSpot(parkingSpot);
	}
}
