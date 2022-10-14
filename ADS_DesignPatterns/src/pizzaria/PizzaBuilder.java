package pizzaria;

public class PizzaBuilder {
	private Pizza pizza;
	
	public PizzaBuilder() {
		
		this.pizza = new Pizza();
		
		
	}
	
	public PizzaBuilder setSize(Integer size) {
		pizza.setSize(size);
		return this;
		
	}
	
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
		
	}
	
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
		
	}
	
	public Pizza getPizza() {
		validarIngredientes();
		validarTamanho();
		return pizza;
		
	}
	
	public void validarIngredientes() {
		if(pizza.getFlagCheese() == false && pizza.getFlagPepperoni() == false) {
			throw new IllegalStateException("Deve ter pelo menos um ingrediente");
		}	
	}
	public void validarTamanho() {
		if (pizza.getSize() != 1 && pizza.getSize() != 2 && pizza.getSize() != 3) {
			throw new IllegalStateException("Tamanho inválido");
		}
	}
	
}
