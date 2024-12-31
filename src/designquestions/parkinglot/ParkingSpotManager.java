package designquestions.parkinglot;

interface ParkingSpotManager {
	ParkingSpot findParkingSpot();

	void parkVehicle(Vehicle vehicle);

	void removeVehicle(Vehicle vehicle);

	void addParkingSpot(ParkingSpot parkingSpot);
}
