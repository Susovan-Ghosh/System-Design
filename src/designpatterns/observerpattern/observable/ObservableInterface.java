package designpatterns.observerpattern.observable;

import designpatterns.observerpattern.observer.ObserverInterface;

public interface ObservableInterface {
	void addObserver(ObserverInterface observer);

	void removeObserver(ObserverInterface observer);

	void notifyObservers();

	void setData(int data);

	int getData();
	
	String getName();
}
