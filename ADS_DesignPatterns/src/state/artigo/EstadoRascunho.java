
package state.artigo;

import java.time.LocalDateTime;

public class EstadoRascunho implements Estado{

    private Artigo artigo;
    
    public EstadoRascunho(Artigo artigo) {
        this.artigo = new Artigo();
    }
    
    @Override
    public void publicar() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
        
        if(seguranca.ehUsuarioAutor()) {
            this.artigo.transitarEstadoPara(new EstadoRevisando(artigo));
            this.artigo.getLogHistorico().add("Transitando para Revisando em " + LocalDateTime.now());
            return;
        }else {
            throw new RuntimeException("Usuario não tem permissão para publicar");
        }
        }


    @Override
    public void reprovar() {

    }
    
    

}