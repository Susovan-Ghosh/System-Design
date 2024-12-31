package designquestions.parkinglot;

import java.util.Map;
import java.util.PriorityQueue;

public class ParkingStrategyFactory {
	ParkingStrategy getParkingStrategy(String parkingStrategy) {
		PriorityQueue<ParkingSpot> selectedParkingSpotQueue = twoWheelerParkingSpotMap.get(parkingStrategy);
		if (parkingStrategy.equals("NearEntrance")) {
			return new NearEntranceParkingStrategy(selectedParkingSpotQueue);
		} else if (parkingStrategy.equals("NearEntranceAndExit")) {
			return new NearEntranceAndExitParkingStrategy(selectedParkingSpotQueue);
		} else {
			return new DefaultParkingStrategy(selectedParkingSpotQueue);
		}
	}
}
