package state.artigo;

import java.time.LocalDateTime;

public class EstadoRevisando implements Estado{
    private Artigo artigo;
    
    
    
    public EstadoRevisando(Artigo artigo) {
        this.artigo = artigo;
    }

    @Override
    public void publicar() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance(); 
            if(seguranca.ehUsuarioModerador()) {
                this.artigo.transitarEstadoPara(new EstadoAprovado(artigo));
                artigo.getLogHistorico().add("Transitando para APROVADO em " + LocalDateTime.now());
                
            }else {
                throw new RuntimeException("Usuario não tem permissão para publicar");
            }
    }

    @Override
    public void reprovar() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance(); 
 
            if(seguranca.ehUsuarioModerador()) {
                this.artigo.transitarEstadoPara(new EstadoRascunho(artigo));
                this.artigo.getLogHistorico().add("Transitando para APROVADO em " + LocalDateTime.now());
                
            }else {
                throw new RuntimeException("Usuario não tem permissão para publicar");
    }
    }
}