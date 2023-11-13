package br.edu.ifsul.bcc.too.anotacoes.Aula0611;

import java.util.Calendar;

/**
 *
 * @author 20222PF.CC0003
 */
public class Cliente extends Pessoa { // subclasse de Pessoa (classe mãe); implementação de relacionamento HERANÇA
    
    // atributos da instância: data da última compra e observações
    
    private Calendar dtcompra;
    private String obs;
    
    // construtor com e sem parãmetros

    public Cliente() {}

    public Cliente(Calendar dtcompra, String obs) {
        this.dtcompra = dtcompra;
        this.obs = obs;
    }
    
    // encapsulamento

    public Calendar getDtcompra() {
        return dtcompra;
    }

    public String getObs() {
        return obs;
    }

    public void setDtcompra(Calendar dtcompra) {
        this.dtcompra = dtcompra;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
