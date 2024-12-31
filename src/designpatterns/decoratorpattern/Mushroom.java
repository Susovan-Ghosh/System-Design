package designpatterns.decoratorpattern;

public class Mushroom implements ToppingDecorator {
	Pizza pizza; // Composition (has - a relation)

	public Mushroom(Pizza pizza) {
		// Constructor Injection
		this.pizza = pizza;
	}

	@Override
	public int cost() {
		return pizza.cost() + 80;
	}

}
