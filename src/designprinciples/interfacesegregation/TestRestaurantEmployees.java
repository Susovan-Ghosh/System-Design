package designprinciples.interfacesegregation;

public class TestRestaurantEmployees {

	public static void main(String[] args) {
		IWaiter ram = new Waiter("Ram");
		ram.followRules();
		ram.takesOrder();
		ram.serve();
	}

}
