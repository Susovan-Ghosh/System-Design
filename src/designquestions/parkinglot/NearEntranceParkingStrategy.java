package designquestions.parkinglot;

import java.util.PriorityQueue;

class NearEntranceParkingStrategy implements ParkingStrategy {
	private static ParkingStrategy parkingStrategy;
	PriorityQueue<ParkingSpot> parkingSpotQueue;

	private NearEntranceParkingStrategy(PriorityQueue<ParkingSpot> parkingSpotQueue) {
		this.parkingSpotQueue = parkingSpotQueue;
	}

	static ParkingStrategy getParkingStrategy(PriorityQueue<ParkingSpot> parkingSpotQueue) {
		if (parkingStrategy == null) {
			parkingStrategy = new NearEntranceParkingStrategy(parkingSpotQueue);
		}
		return parkingStrategy;
	}

	@Override
	public ParkingSpot findParkingSpot() {
		return parkingSpotQueue.poll();
	}
}