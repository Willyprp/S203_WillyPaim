package state.artigo;

public class GerenteDeSeguranca {
    
    private static GerenteDeSeguranca instance;
    
    private GerenteDeSeguranca() {
        
    }
    
    public static GerenteDeSeguranca getInstance() {
        if(instance == null) {
            instance = new GerenteDeSeguranca();
           
        }
        return instance;
    }
    
    private String usuarioCorrente;
    
    public String getUsuarioCorrente() {
        return usuarioCorrente;
    }
    
    public void setUsuarioCorrente(String usuarioCorrente) {
        this.usuarioCorrente = usuarioCorrente;
    }

    public boolean ehUsuarioModerador() {
        return "Moderador".equals(usuarioCorrente);
    }
    
    public boolean ehUsuarioAutor() {
        return "Autor".equals(usuarioCorrente);
    }
}