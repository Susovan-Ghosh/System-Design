package designpatterns.observerpattern.observable;

import java.util.ArrayList;
import java.util.List;

import designpatterns.observerpattern.observer.ObserverInterface;

public class Stock implements ObservableInterface {
	List<ObserverInterface> observerList;
	int stockCount;
	String productName;

	public Stock(String productName) {
		observerList = new ArrayList<>();
		stockCount = 0;
		this.productName = productName;
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
	public void setData(int stockCount) {
		if (this.stockCount == 0) {
			this.stockCount = stockCount;
			notifyObservers();
			return;
		}
		this.stockCount = stockCount;
	}

	@Override
	public int getData() {
		return stockCount;
	}
	
	@Override
	public String getName() {
		return productName;
	}

}
