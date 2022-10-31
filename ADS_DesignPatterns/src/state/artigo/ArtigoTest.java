package state.artigo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArtigoTest {

	@Test
    public void daveArtigoTransitarDeRascunhoAteAprovado() {
        GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
        
        Artigo artigo = new Artigo();
        
        assertTrue(artigo.getEstado() instanceof EstadoRascunho);
        
        //1. Rascunho > Revisando
        gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
        artigo.publicar();
        
        assertTrue(artigo.getEstado() instanceof EstadoRevisando);
        
        //2. Revisando > Aprovado
        gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
        artigo.publicar();
        
        assertTrue(artigo.getEstado() instanceof EstadoAprovado);
        
        //imprime o historico
        System.out.println(artigo.getLogHistorico());
    }
    
    @Test
    public void daveArtigoTransitarDeRascunho_Revisando_Rascunho() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
        
        Artigo artigo = new Artigo();
        assertTrue(artigo.getEstado() instanceof EstadoRascunho);
        
        //1. rascunho > revisando
        seguranca.setUsuarioCorrente("AUTOR");
        artigo.publicar();
        
        assertTrue(artigo.getEstado() instanceof EstadoRevisando);
        //2. revisando > rascunho
        seguranca.setUsuarioCorrente("MODERADOR");
        artigo.reprovar();
        
        assertTrue(artigo.getEstado() instanceof EstadoRascunho);
        
        //imprimir log
        artigo.getLogHistorico().forEach(System.out::println);
    }

}
