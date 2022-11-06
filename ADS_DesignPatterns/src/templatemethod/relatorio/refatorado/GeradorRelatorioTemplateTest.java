package templatemethod.relatorio.refatorado;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeradorRelatorioTemplateTest {

	@Test
	public void deveGerarRelatorioVendasMensaisPeloTemplate() {
		GeradorRelatorioTemplate template = new GeradorRelatorioVendasMensais(2022, 10);
		String pagina = template.criarPagina();
		System.out.println(pagina);
	}
	
	public void deveGerarRelatorioVendasAnuaisPeloTemplate() {
		GeradorRelatorioTemplate template = new GeradorRelatorioVendasAnuais(2022);
		String pagina = template.criarPagina();
		System.out.println(pagina);
	}


}
