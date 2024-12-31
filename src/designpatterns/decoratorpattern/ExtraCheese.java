package designpatterns.decoratorpattern;

public class ExtraCheese implements ToppingDecorator {
	Pizza pizza; // Composition (has - a relation)

	public ExtraCheese(Pizza pizza) {
		// Constructor Injection
		this.pizza = pizza;
	}

	@Override
	public int cost() {
		return pizza.cost() + 50;
	}

}
