package strategy.frete;;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalculadoraFreteTest {

	@Test
	public void deveCalcularFreteParaDHL() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
        double valorobtido = calculadora.calculaValor("dhl",10.0);
		double valoresperado = 100.0;
        assertEquals(valorobtido,valoresperado);
	}

    @Test
	public void deveCalcularFreteParaSedex() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
        double valorobtido = calculadora.calculaValor("sedex",10.0);
		double valoresperado = 70.00;
        assertEquals(valorobtido,valoresperado);
	}

    @Test
	public void deveCalcularFreteParaJadLog() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
        double valorobtido = calculadora.calculaValor("jadlog",10.0);
		double valoresperado = 0.00;
        assertEquals(valorobtido,valoresperado);
	}

    @Test
	public void deveLancarExceptionParaServicoDesconhecido() {
        try{
			CalculadoraFrete calculadora = new CalculadoraFrete();
            double valorobtido = calculadora.calculaValor("azul",10.0);
		}catch(IllegalStateException e){
			e.printStackTrace();
		}
	}
}
