package designpatterns.strategypattern;

public class GoodsVehicle extends Vehicle {
	GoodsVehicle(String name) {
		super(new NormalDriveStrategy(), name);
	}
}
