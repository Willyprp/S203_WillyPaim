package state.artigo;

public class EstadoAprovado implements Estado{
	private zzzArtigo artigo;
	
	public EstadoAprovado(zzzArtigo artigo) {
		
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		
		
	}

	@Override
	public void reprovar() {
		
		
	}

}
