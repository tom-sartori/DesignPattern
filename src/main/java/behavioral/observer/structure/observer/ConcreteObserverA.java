package behavioral.observer.structure.observer;

public class ConcreteObserverA implements Observer {

	@Override
	public void update(String event) {
		// Do something with the event.
		System.out.println("Hi! I'm ConcreteObserverA and I've received an update: " + event);
	}
}
