package pizzaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaBuilderTest {

	@Test
	public void deveConstruirPizzaValida() {
		
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();
		
		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
		
	}

}
