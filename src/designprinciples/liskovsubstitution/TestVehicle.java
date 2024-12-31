package designprinciples.liskovsubstitution;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle bicycle = new Bicycle();
		Vehicle bike = new Bike();
		Vehicle car = new Car();

		bicycle.accelerate();
		bike.accelerate();
		car.accelerate();
		((MotorVehicle) car).turnOnEngine();
		((MotorVehicle) bike).turnOnEngine();
	}

}
