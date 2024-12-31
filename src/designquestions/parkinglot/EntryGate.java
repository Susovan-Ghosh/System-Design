package designquestions.parkinglot;

public class EntryGate {
	ParkingSpotManagerFactory parkingSpotManagerFactory;
	ParkingSpotManager twoWheelerParkingSpotManagerNearEntrance;
	ParkingSpotManager twoWheelerParkingSpotManagerNearEntranceAndExit;
	ParkingSpotManager fourWheelerParkingSpotManagerNearEntrance;
	ParkingSpotManager fourWheelerParkingSpotManagerNearEntranceAndExit;

	EntryGate() {
		parkingSpotManagerFactory = new ParkingSpotManagerFactory();
		twoWheelerParkingSpotManagerNearEntrance = parkingSpotManagerFactory
				.getParkingSpotManager(VehicleType.TWO_WHEELER, "NearEntrance");
		twoWheelerParkingSpotManagerNearEntranceAndExit = parkingSpotManagerFactory
				.getParkingSpotManager(VehicleType.TWO_WHEELER, "NearEntranceAndExit");
		fourWheelerParkingSpotManagerNearEntrance = parkingSpotManagerFactory
				.getParkingSpotManager(VehicleType.FOUR_WHEELER, "NearEntrance");
		fourWheelerParkingSpotManagerNearEntranceAndExit = parkingSpotManagerFactory
				.getParkingSpotManager(VehicleType.FOUR_WHEELER, "NearEntranceAndExit");
	}

	ParkingSpot findParkingSpot(Vehicle vehicle) {
		ParkingSpotManager parkingSpotManager;
		if (vehicle.vehicleType == VehicleType.TWO_WHEELER && vehicle.parkingStrategy.equals("NearEntrance")) {
			parkingSpotManager = twoWheelerParkingSpotManagerNearEntrance;
		} else if (vehicle.vehicleType == VehicleType.TWO_WHEELER
				&& vehicle.parkingStrategy.equals("NearEntranceAndExit")) {
			parkingSpotManager = twoWheelerParkingSpotManagerNearEntranceAndExit;
		} else if (vehicle.vehicleType == VehicleType.FOUR_WHEELER && vehicle.parkingStrategy.equals("NearEntrance")) {
			parkingSpotManager = fourWheelerParkingSpotManagerNearEntrance;
		} else {
			parkingSpotManager = fourWheelerParkingSpotManagerNearEntranceAndExit;
		}
		return parkingSpotManager.findParkingSpot();
	}

	void parkVehicle(Vehicle vehicle, String parkingStrategy) {
		ParkingSpot parkingSpot = findParkingSpot(vehicle);
		if (parkingSpot != null) {
			parkingSpot.parkVehicle(vehicle);
			generateTicket(System.currentTimeMillis(), vehicle, parkingSpot);
		}
	}

	Ticket generateTicket(long entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
		return new Ticket(entryTime, vehicle, parkingSpot);
	}
}
