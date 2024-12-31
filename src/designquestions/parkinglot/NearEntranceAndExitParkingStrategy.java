package designquestions.parkinglot;

import java.util.PriorityQueue;

class NearEntranceAndExitParkingStrategy implements ParkingStrategy {
	private static ParkingStrategy parkingStrategy;
	PriorityQueue<ParkingSpot> parkingSpotQueue;

	private NearEntranceAndExitParkingStrategy(PriorityQueue<ParkingSpot> parkingSpotQueue) {
		this.parkingSpotQueue = parkingSpotQueue;
	}

	static ParkingStrategy getParkingStrategy(PriorityQueue<ParkingSpot> parkingSpotQueue) {
		if (parkingStrategy == null) {
			parkingStrategy = new NearEntranceAndExitParkingStrategy(parkingSpotQueue);
		}
		return parkingStrategy;
	}

	@Override
	public ParkingSpot findParkingSpot() {
		return parkingSpotQueue.poll();
	}
}