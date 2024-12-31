package designpatterns.observerpattern.observable;

import java.util.ArrayList;
import java.util.List;

import designpatterns.observerpattern.observer.ObserverInterface;

public class Weather implements ObservableInterface {
	List<ObserverInterface> observerList;
	int temperatureInCelcius;
	String dayName;

	public Weather(String dayName) {
		observerList = new ArrayList<>();
		temperatureInCelcius = 0;
		this.dayName = dayName;
	}

	@Override
	public void addObserver(ObserverInterface observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(ObserverInterface observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (ObserverInterface observer : observerList) {
			observer.update(this);
		}
	}

	@Override
	public void setData(int temperatureInCelcius) {
		if (this.temperatureInCelcius != temperatureInCelcius) {
			this.temperatureInCelcius = temperatureInCelcius;
			notifyObservers();
			return;
		}
		this.temperatureInCelcius = temperatureInCelcius;
	}

	@Override
	public int getData() {
		return temperatureInCelcius;
	}

	@Override
	public String getName() {
		return dayName;
	}

}
