package fr.pantheonsorbonne.ufr27.miage.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffee;

public class AppTest {
	
	private final BlackCoffee blackCoffee = new BlackCoffee();
	private final ExpressoCoffee expressoCoffee = new ExpressoCoffee();

	@Test
	public void testCase1() {

		try {
			Waiter waiter = new Waiter();
			
			Client client = new Client(-3);
			
			int profit = 3;

			while (!client.isAwake()) {
				Coffee coffee = waiter.serveCoffee(client);
				client.drink(coffee);
				profit -= 1;
			}

			assertTrue("we are loosing money", profit > 0);

		} catch (CoffeeOverLoadException e) {
			fail("Customer had too much coffee, went on a rampage in his first morning meeting");
		}

	}

	@Test
	public void testCase2() {

		try {
			Waiter waiter = new Waiter();

			Client client = new Client(-20);
			int profit = 3;

			while (!client.isAwake()) {
				Coffee coffee = waiter.serveCoffee(client);
				client.drink(coffee);
				profit -= 1;
			}

			assertTrue("we are loosing money", profit > 0);

		} catch (CoffeeOverLoadException e) {
			fail("Customer had too much coffee, went on a rampage in his first morning meeting");
		}

	}
	
	@Test
	public void testCase3() {

		try {
			Waiter waiter = new Waiter(blackCoffee, expressoCoffee);
			
			Client client = new Client(-3);
			
			int profit = 3;

			while (!client.isAwake()) {
				Coffee coffee = waiter.serveCoffee(client);
				client.drink(coffee);
				profit -= 1;
			}

			assertTrue("we are loosing money", profit > 0);

		} catch (CoffeeOverLoadException e) {
			fail("Customer had too much coffee, went on a rampage in his first morning meeting");
		}

	}

	@Test
	public void testCase4() {

		try {
			Waiter waiter = new Waiter(blackCoffee, expressoCoffee);

			Client client = new Client(-20);
			int profit = 3;

			while (!client.isAwake()) {
				Coffee coffee = waiter.serveCoffee(client);
				client.drink(coffee);
				profit -= 1;
			}

			assertTrue("we are loosing money", profit > 0);

		} catch (CoffeeOverLoadException e) {
			fail("Customer had too much coffee, went on a rampage in his first morning meeting");
		}

	}

}
