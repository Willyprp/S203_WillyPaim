package templatemethod.relatorio.intro;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeradorRelatorioVendasAnuaisTest {

	@Test
	public void deveGerarRelatorioVendasAnuais() {
		GeradorRelatorioVendasAnuais gerador = new GeradorRelatorioVendasAnuais();
		String pagina = gerador.criarPagina(2022);
		System.out.println(pagina);
	}

}
