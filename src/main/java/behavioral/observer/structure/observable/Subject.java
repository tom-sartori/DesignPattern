package behavioral.observer.structure.observable;

import behavioral.observer.structure.observer.Observer;

import java.util.ArrayList;
import java.util.Collection;

public class Subject {

	private Collection<Observer> observerCollection;

	public Subject() {
		this.observerCollection = new ArrayList<>();
	}

	public void registerObserver(Observer observer) {
		observerCollection.add(observer);
	}

	public void unregisterObserver(Observer observer) {
		observerCollection.remove(observer);
	}

	public void notifyObservers(String event) {
		observerCollection.forEach(observer -> observer.update(event));
	}
}
