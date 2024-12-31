package designquestions.parkinglot;

class TwoWheelerParkingSpot implements ParkingSpot {
	String id;
	boolean isEmpty;
	Vehicle vehicle;
	double price;
	VehicleType vehicleType;
	String parkingStrategy;

	TwoWheelerParkingSpot(String id, double price, String parkingStrategy) {
		this.id = id;
		this.price = price;
		this.parkingStrategy = parkingStrategy;
		isEmpty = true;
		vehicleType = VehicleType.TWO_WHEELER;
	}

	@Override
	public void parkVehicle(Vehicle vehicle) {
		isEmpty = false;
		this.vehicle = vehicle;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getParkingStrategy() {
		return parkingStrategy;
	}

	@Override
	public void setParkingStrategy(String parkingStrategy) {
		this.parkingStrategy = parkingStrategy;
	}

	@Override
	public boolean isEmpty() {
		return isEmpty;
	}

	@Override
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	@Override
	public Vehicle getVehicle() {
		return vehicle;
	}

	@Override
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}