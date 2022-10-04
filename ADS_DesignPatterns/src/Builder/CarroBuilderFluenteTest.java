package Builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarroBuilderFluenteTest {

	@Test
	public void deveConstruirUmCarro() {
		// partes validas
		
		Motor motorVtec = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta [] portas = {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosh = new FreioABS();
		
		Carro carroPronto = new CarroBuilderFluente()
				.buildPorta(portas)
				.buildMotor(motorVtec)
				.buildComputadorBordo(computadorBordoSiemens)
				.buildFreioABS(freioBosh)
				.getCarro();
		
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getMotor());
		assertNotNull(carroPronto.getPortas());
		assertNotNull(carroPronto.getComputadorBordo());
		assertNotNull(carroPronto.getFreioABS());
		assertEquals(carroPronto.getPortas().length, 2);
		assertTrue(carroPronto.getPortas().length == 2);
	}
}
