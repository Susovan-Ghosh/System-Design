package designprinciples.liskovsubstitution;

public class Car implements MotorVehicle {

	@Override
	public void accelerate() {
		System.out.println("Car has accelerated");
	}

	@Override
	public void turnOnEngine() {
		System.out.println("Car has been turned on");
	}

}
