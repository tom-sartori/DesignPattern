package behavioral.observer.structure.observer;

public class ConcreteObserverB implements Observer {

	private String state;

	public ConcreteObserverB() {
		this.state = "Initial state";
	}

	@Override
	public void update(String event) {
		// Do something with the event.
		System.out.println("Hi! I'm ConcreteObserverB and I've received an update. You can see my state with my method getState(). ");
		state = event;
	}

	public String getState() {
		return state;
	}
}
