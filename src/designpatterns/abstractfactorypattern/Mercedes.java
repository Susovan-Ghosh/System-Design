package designpatterns.abstractfactorypattern;

public class Mercedes implements LuxuryVehicle {

	@Override
	public void drive() {
		System.out.println("Luxury Vehicle (Mercedes) is driving");
	}

}
