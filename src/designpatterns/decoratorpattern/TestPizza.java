package designpatterns.decoratorpattern;

public class TestPizza {

	public static void main(String[] args) {
		// Pizza: Farm House + Extra Cheese
		// In normal Scenario: ExtraCheese extends FarmHouse
		// ExtraCheese got tightly coupled with FarmHouse. Now if someone wants
		// ExtraCheese on VegDelight, one needs to create more than one version of
		// ExtraCheese classes to suffice both types of needs.
		// ExtraCheese1 extends FarmHouse, ExtraCheese2 extends VegDelight
		// Later on we might never use ExtraCheese1 class and will lead to excessive
		// permanent memory usage.
		// Below eg. creates a Pizza as Farm House + Extra Cheese + Mushroom and yet we
		// we need not create permanent classes for this combo.
		Pizza pizza = new Mushroom(new ExtraCheese(new FarmHouse()));
		System.out.println(pizza.cost());
	}

}
