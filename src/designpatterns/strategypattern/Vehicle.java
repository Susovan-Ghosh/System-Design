package designpatterns.strategypattern;

public class Vehicle {
	DriveStrategy driveStrategy; // Composition (has - relation)
	String name;

	Vehicle(DriveStrategy driveStrategy, String name) {
		this.driveStrategy = driveStrategy;
		this.name = name;
	}

	void drive() {
		System.out.println("Vehicle (" + name + ") is having " + driveStrategy.getDriveStrategy());
	}
}
