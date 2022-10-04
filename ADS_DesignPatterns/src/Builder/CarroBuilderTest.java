package Builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarroBuilderTest {

	@Test
	public void deveConstruirUmCarro() {
		// partes validas
		
		Motor motorVtec = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta [] portas = {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosh = new FreioABS();
		
		CarroBuilder carroBuilder = new CarroBuilder();
		carroBuilder.buildMotor(motorVtec);
		carroBuilder.buildPortas(portas);
		carroBuilder.buildFreioABS(freioBosh);
		carroBuilder.buildComputadorBordo(computadorBordoSiemens);
		Carro carroPronto = carroBuilder.getCarro();
		
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getMotor());
		assertNotNull(carroPronto.getPortas());
		assertNotNull(carroPronto.getComputadorBordo());
		assertNotNull(carroPronto.getFreioABS());
		assertEquals(carroPronto.getPortas().length, 2);
		assertTrue(carroPronto.getPortas().length == 2);
	}
}
