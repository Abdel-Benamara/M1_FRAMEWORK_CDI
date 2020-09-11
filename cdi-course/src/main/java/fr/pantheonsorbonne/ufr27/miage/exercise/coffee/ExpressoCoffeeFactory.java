package fr.pantheonsorbonne.ufr27.miage.exercise.coffee;

public class ExpressoCoffeeFactory {

	private static ExpressoCoffee instance;
	
	public static void setInstance(ExpressoCoffee coffee) {
		instance = coffee;
	}
	
	public static ExpressoCoffee getInstance() {
		if (instance == null)
			return new ExpressoCoffee();
		return instance;
	}
}
