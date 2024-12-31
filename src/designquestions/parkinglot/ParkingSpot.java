package designquestions.parkinglot;

interface ParkingSpot {
	void parkVehicle(Vehicle vehicle);

	double getPrice();

	String getParkingStrategy();

	void setParkingStrategy(String parkingStrategy);

	boolean isEmpty();

	void setEmpty(boolean isEmpty);

	Vehicle getVehicle();

	void setVehicle(Vehicle vehicle);
}
