package designpatterns.abstractfactorypattern;

public class AbstractVehicleFactory {
	VehicleFactory vehicleFactory;

	VehicleFactory getVehicleType(String vehicleType) {
		if (vehicleType.equals("Normal")) {
			return vehicleFactory = new NormalVehicleFactory();
		} else if (vehicleType.equals("Luxury")) {
			return vehicleFactory = new LuxuryVehicleFactory();
		} else {
			// default case
			return vehicleFactory = new NormalVehicleFactory();
		}
	}
}
