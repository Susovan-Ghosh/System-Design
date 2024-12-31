package designpatterns.observerpattern.observer;

import designpatterns.observerpattern.observable.ObservableInterface;
import designpatterns.observerpattern.observable.Stock;

public class Person implements ObserverInterface {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void update(ObservableInterface observable) {
		System.out.println("Hi person (" + name + "), " + observable.getName()
				+ ((observable instanceof Stock) ? " stock " : " temperature ") + "has been updated to "
				+ observable.getData());
	}

}
