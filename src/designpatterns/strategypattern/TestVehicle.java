package designpatterns.strategypattern;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle tempo = new Vehicle(new NormalDriveStrategy(), "Tempo");
		Vehicle racingBike = new Vehicle(new SpecialDriveStrategy(), "Racing Bike");

		tempo.drive();
		racingBike.drive();

		racingBike.setDriveStrategy(new NormalDriveStrategy());
		racingBike.drive();
	}

}
