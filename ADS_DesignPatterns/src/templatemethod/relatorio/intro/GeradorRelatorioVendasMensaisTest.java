package templatemethod.relatorio.intro;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeradorRelatorioVendasMensaisTest {

	@Test
	public void deveGerarRelatorioVendasMensais() {
		GeradorRelatorioVendasMensais gerador = new GeradorRelatorioVendasMensais();
		String pagina = gerador.criarPagina(2022, 10);
		System.out.println(pagina);
	}

}
