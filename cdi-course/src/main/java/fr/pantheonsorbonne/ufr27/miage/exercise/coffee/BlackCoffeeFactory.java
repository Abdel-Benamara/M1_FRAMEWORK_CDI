package fr.pantheonsorbonne.ufr27.miage.exercise.coffee;

public class BlackCoffeeFactory {
	
	private static BlackCoffee instance;
	
	public static void setInstance(BlackCoffee coffee) {
		instance = coffee;
	}
	
	public static BlackCoffee getInstance() {
		if (instance == null)
			return new BlackCoffee();
		return instance;
	}
}
