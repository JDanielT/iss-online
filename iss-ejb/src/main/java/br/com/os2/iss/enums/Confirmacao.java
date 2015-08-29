package br.com.os2.iss.enums;

/**
 *
 * @author daniel
 */
public enum Confirmacao {
    
    S("SIM"), N("NÃO");
    
    private final String descricao;
    
    private Confirmacao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
