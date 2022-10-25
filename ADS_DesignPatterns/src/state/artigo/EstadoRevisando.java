package state.artigo;

public class EstadoRevisando implements Estado{
	 
	private zzzArtigo artigo;
	
	public EstadoRevisando(zzzArtigo artigo) {
		
		this.artigo = artigo;
	}
	
	@Override
	public void publicar() {
		
		
	}

	@Override
	public void reprovar() {
		
		
	}

}
