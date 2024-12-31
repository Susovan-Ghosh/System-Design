package designquestions.parkinglot;

public class Ticket {
	long entryTime;
	Vehicle vehicle;
	ParkingSpot parkingSpot;
	double price;

	Ticket(long entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
		this.entryTime = entryTime;
		this.vehicle = vehicle;
		this.parkingSpot = parkingSpot;
	}
}
