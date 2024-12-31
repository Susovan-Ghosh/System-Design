package designquestions.parkinglot;

import java.util.PriorityQueue;

class ParkingSpotManagerFactory {
	ParkingSpotManager getParkingSpotManager(VehicleType parkingSpotType, String parkingStrategy, PriorityQueue<ParkingSpot> parkingSpotQueue) {
		if (parkingSpotType == VehicleType.TWO_WHEELER && parkingStrategy.equals("NearEntrance")) {
			return TwoWheelerParkingSpotManager.getParkingSpotManager(parkingStrategy, parkingSpotQueue);
		} else {
			return FourWheelerParkingSpotManager.getParkingSpotManager(parkingStrategy, parkingSpotQueue);
		}
	}
}
