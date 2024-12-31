package designpatterns.abstractfactorypattern;

public class NormalVehicleFactory implements VehicleFactory {
	Vehicle vehicle;
	
	@Override
	public Vehicle getVehicle(String vehicleName) {
		if (vehicleName.equals("Creta")) {
			return vehicle = new Creta();
		} else if (vehicleName.equals("Swift")) {
			return vehicle = new Swift();
		} else {
			// default case
			return vehicle = new Swift();
		}
	}

}
