package designpatterns.observerpattern;

import designpatterns.observerpattern.observable.ObservableInterface;
import designpatterns.observerpattern.observable.Stock;
import designpatterns.observerpattern.observable.Weather;
import designpatterns.observerpattern.observer.ObserverInterface;
import designpatterns.observerpattern.observer.Person;
import designpatterns.observerpattern.observer.Retailer;

public class TestObserver {

	public static void main(String[] args) {
		ObservableInterface iPhoneStock = new Stock("IPhone"); // Observable 1
		ObservableInterface fridayWeather = new Weather("Friday"); // Observable 2
		ObserverInterface ram = new Person("Ram"); // Observer 1
		ObserverInterface shop = new Retailer("NewShop"); // Observer 2
		iPhoneStock.addObserver(ram);
		iPhoneStock.addObserver(shop);
		fridayWeather.addObserver(ram);
		iPhoneStock.setData(10);
		iPhoneStock.setData(0);
		iPhoneStock.setData(100);
		fridayWeather.setData(39);
	}

}
