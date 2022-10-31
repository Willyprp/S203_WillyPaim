package state.artigo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ZzzArtigo {

    private String estado;
    
    private List<String> logHistorico = new ArrayList<>();
    
    public ZzzArtigo() {
        this.estado = "RASCUNHO"; // estado inicial
    }
    
    public String getEstado() {
        return estado;
    }
    
    public List<String> getLogHistorico(){
        return logHistorico;
    }
    
    public void publicar() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
        
        if("RASCUNHO".equals(this.estado)) {
            if(seguranca.ehUsuarioAutor()) {
                this.estado = "REVISANDO";
                this.logHistorico.add("Transitando para Revisando em " + LocalDateTime.now());
                return;
            }else {
                throw new RuntimeException("Usuario não tem permissão para publicar");
            }
        }
        if("REVISANDO".equals(this.estado)) {
            if(seguranca.ehUsuarioModerador()) {
                this.estado = "Aprovado";
                this.logHistorico.add("Transitando para APROVADO em " + LocalDateTime.now());
                
            }else {
                throw new RuntimeException("Usuario não tem permissão para publicar");
            }
        }
        
        if("Aprovado".equals(estado)) {
            //faz nada
            return;
        }
    }
    
    public void reprovar() {
        GerenteDeSeguranca gerente = GerenteDeSeguranca.getInstance();
        
        if("RASCUNHO".equals(estado)) {
            //faz nda
            return;
        }
        
        if("REVISANDO".equals(estado)) {
            if(gerente.ehUsuarioModerador()) {
                this.estado = "RASCUNHO";
                logHistorico.add("Transitando para Rascunho em" + LocalDateTime.now());
                
            }else{
               throw new RuntimeException("Usuario não tem permissão para reprovar"); 
            }
        }
        
        if("APROVADO".equals(estado)) {
            //faz nda
            return;
        }
    }
}
