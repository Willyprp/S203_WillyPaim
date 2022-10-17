package strategy.comparator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void deveOrdenarListaDeAnimaisPeloNome() {
		
		List<Animal> listaDeAnimais = new ArrayList<>();
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		
		System.out.println("Lista original:");
		listaDeAnimais.forEach(System.out::println);
		
		listaDeAnimais.sort(new ComparadorPorNome());
		System.out.println("Lista ordenada pelo nome:");
		listaDeAnimais.forEach(a -> System.out.println(a));
		
	}
	
	@Test
	public void deveOrdenarListaDeAnimaisPeloId() {
		List<Animal> listaDeAnimais = new ArrayList<>();
		listaDeAnimais.add(new Animal(3L, "Tartaruga"));
		listaDeAnimais.add(new Animal(9L, "Coelho"));
		listaDeAnimais.add(new Animal(4L, "Cachorro"));
		listaDeAnimais.add(new Animal(8L, "Gato"));
		listaDeAnimais.add(new Animal(7L, "Girafa"));
		listaDeAnimais.add(new Animal(1L, "Gato"));
		
		System.out.println("Lista original:");
		listaDeAnimais.forEach(System.out::println);
		
		listaDeAnimais.sort(new ComparadorPorId());
		listaDeAnimais.sort((a1,a2)-> a1.getId().compareTo(a2.getId()));
		listaDeAnimais.sort(Comparator.comparing(Animal::getId));
		
		System.out.println("Lista ordenada pelo ID:");
		listaDeAnimais.forEach(a -> System.out.println(a));
		
	}

}
