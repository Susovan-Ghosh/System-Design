package designprinciples.liskovsubstitution;

public class Bike implements MotorVehicle {

	@Override
	public void accelerate() {
		System.out.println("Bike has accelerated");
	}

	@Override
	public void turnOnEngine() {
		System.out.println("Bike has been turned on");
	}

}
