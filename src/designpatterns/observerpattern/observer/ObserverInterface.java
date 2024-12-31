package designpatterns.observerpattern.observer;

import designpatterns.observerpattern.observable.ObservableInterface;

public interface ObserverInterface {
	void update(ObservableInterface observable);
}
