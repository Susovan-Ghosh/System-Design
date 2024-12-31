package designprinciples.interfacesegregation;

public interface IWaiter extends Employee {
	void serve();

	void takesOrder();
}
