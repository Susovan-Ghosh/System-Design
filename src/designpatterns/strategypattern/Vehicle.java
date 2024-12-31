package designpatterns.strategypattern;

public class Vehicle {

	DriveStrategy driveStrategy;
	String name;

	public Vehicle(DriveStrategy driveStrategy, String name) {
		this.driveStrategy = driveStrategy;
		this.name = name;
	}

	public DriveStrategy getDriveStrategy() {
		return driveStrategy;
	}

	public void setDriveStrategy(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void drive() {
		System.out.print("Vehicle Name: " + name + ", Drive Strategy: ");
		driveStrategy.drive();
	}
}
