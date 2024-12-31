package designpatterns.abstractfactorypattern;

public class Swift implements NormalVehicle {

	@Override
	public void drive() {
		System.out.println("Normal Vehicle (Swift) is driving");
	}

}
