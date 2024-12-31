package designpatterns.abstractfactorypattern;

public class BMW implements LuxuryVehicle {

	@Override
	public void drive() {
		System.out.println("Luxury Vehicle (BMW) is driving");
	}

}
