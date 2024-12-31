package designprinciples.liskovsubstitution;

public class Bicycle implements Vehicle {

	@Override
	public void accelerate() {
		System.out.println("Bicycle has accelerated");
	}

}
