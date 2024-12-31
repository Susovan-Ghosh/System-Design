package designpatterns.abstractfactorypattern;

public class TestAbstractVehicleFactory {

	public static void main(String[] args) {
		AbstractVehicleFactory abstractVehicleFactory = new AbstractVehicleFactory();
		Vehicle vehicle = abstractVehicleFactory.getVehicleType("Luxury").getVehicle("Mercedes");
		vehicle.drive();
	}

}
