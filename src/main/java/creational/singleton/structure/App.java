package creational.singleton.structure;

public class App {

	public static void main(String[] args) {
		String value = "Hello world!";

		Singleton singleton = Singleton.getInstance(value);
		System.out.println(singleton.getValue().equals(value));

		singleton = Singleton.getInstance("Another value. ");
		System.out.println(singleton.getValue().equals(value));
	}
}
