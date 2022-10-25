package state.artigo;

import java.time.LocalDate;

public class EstadoRascunho implements Estado {

	private zzzArtigo artigo;

	public EstadoRascunho(zzzArtigo artigo) {

		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();

		if (gerenteDeSeguranca.ehUsuarioAutor()) {
			this.estado = "REVISANDO";
			this.logHistorico.add("Transitado para REVISANDO em " + LocalDate.now());
			return;
		} else {
			throw new RuntimeException("Usuario não tem permissão para publicar");
		}

	}

	@Override
	public void reprovar() {

	}

}
