package designpatterns.strategypattern;

public class SportsVehicle extends Vehicle {
	SportsVehicle(String name) {
		super(new SpecialDriveStrategy(), name);
	}
}
