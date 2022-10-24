package behavioral.observer.structure;

import behavioral.observer.structure.observable.Subject;
import behavioral.observer.structure.observer.ConcreteObserverA;
import behavioral.observer.structure.observer.ConcreteObserverB;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		subject.registerObserver(new ConcreteObserverA());

		ConcreteObserverB concreteObserverB = new ConcreteObserverB();
		subject.registerObserver(concreteObserverB);
		System.out.println("Before notifyObservers : concreteObserverB.getState() -> " + concreteObserverB.getState() + "\n");

		subject.notifyObservers("Hello world!");

		System.out.println("After notifyObservers : concreteObserverB.getState() -> " + concreteObserverB.getState());
	}
}
