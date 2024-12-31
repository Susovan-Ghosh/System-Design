package designpatterns.abstractfactorypattern;

public class LuxuryVehicleFactory implements VehicleFactory {
	Vehicle vehicle;

	@Override
	public Vehicle getVehicle(String vehicleName) {
		if (vehicleName.equals("BMW")) {
			return vehicle = new BMW();
		} else if (vehicleName.equals("Mercedes")) {
			return vehicle = new Mercedes();
		} else {
			// default case
			return vehicle = new Mercedes();
		}
	}

}
