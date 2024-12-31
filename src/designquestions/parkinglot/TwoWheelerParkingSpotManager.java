package designquestions.parkinglot;

import java.util.PriorityQueue;

class TwoWheelerParkingSpotManager implements ParkingSpotManager {
	private static ParkingSpotManager parkingSpotManager;
	PriorityQueue<ParkingSpot> parkingSpotQueue;

	private TwoWheelerParkingSpotManager(PriorityQueue<ParkingSpot> parkingSpotQueue) {
		this.parkingSpotQueue = parkingSpotQueue;
	}

	static ParkingSpotManager getParkingSpotManager(PriorityQueue<ParkingSpot> parkingSpotQueue) {
		if (parkingSpotManager == null) {
			parkingSpotManager = new TwoWheelerParkingSpotManager(parkingSpotQueue);
		}
		return parkingSpotManager;
	}

	@Override
	public ParkingSpot findParkingSpot() {
		return parkingSpotQueue.poll();
	}

	@Override
	public void addParkingSpot(ParkingSpot parkingSpot) {
		parkingSpotQueue.add(parkingSpot);
	}

	@Override
	public void parkVehicle(Vehicle vehicle) {
	}

	@Override
	public void removeVehicle(Vehicle vehicle) {
	}
}