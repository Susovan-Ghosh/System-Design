package designpatterns.strategypattern;

public class OffRoadVehicle extends Vehicle {
	OffRoadVehicle(String name) {
		super(new SpecialDriveStrategy(), name);
	}
}
