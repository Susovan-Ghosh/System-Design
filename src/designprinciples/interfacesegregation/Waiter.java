package designprinciples.interfacesegregation;

public class Waiter implements IWaiter {
	String name;

	public Waiter(String name) {
		this.name = name;
	}

	@Override
	public void followRules() {
		System.out.println("Waiter (" + name + ") is following the rules");
	}

	@Override
	public void serve() {
		System.out.println("Waiter (" + name + ") served the food");
	}

	@Override
	public void takesOrder() {
		System.out.println("Waiter (" + name + ") is taking the orders");
	}

}
