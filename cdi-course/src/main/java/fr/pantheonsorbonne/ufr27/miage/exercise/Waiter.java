package fr.pantheonsorbonne.ufr27.miage.exercise;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffeeFactory;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffeeFactory;

class Waiter {
	
	private final BlackCoffee coffee1;
	private final ExpressoCoffee coffee2;
	
	public Waiter() {
		coffee1 = BlackCoffeeFactory.getInstance();
		coffee2 = ExpressoCoffeeFactory.getInstance();
	}
	
	public Waiter(BlackCoffee coffee1, ExpressoCoffee coffee2) {
		this.coffee1 = coffee1;
		this.coffee2 = coffee2;
	}


	public Coffee serveCoffee(Client client) {
		
		if (client.getAwakenessLevel() + Math.max(coffee1.caffeineLevel(), coffee2.caffeineLevel()) <= 6)
			return coffee1.caffeineLevel() > coffee2.caffeineLevel() ? coffee1 : coffee2;
		else
			return coffee1.caffeineLevel() < coffee2.caffeineLevel() ? coffee1 : coffee2;
	}

}