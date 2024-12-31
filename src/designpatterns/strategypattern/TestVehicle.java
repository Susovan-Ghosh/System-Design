package designpatterns.strategypattern;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle tempo = new GoodsVehicle("Tempo");
		Vehicle racingBike = new SportsVehicle("Racing Bike");
		Vehicle truck = new OffRoadVehicle("Truck");

		tempo.drive();
		racingBike.drive();
		truck.drive();
	}

}
