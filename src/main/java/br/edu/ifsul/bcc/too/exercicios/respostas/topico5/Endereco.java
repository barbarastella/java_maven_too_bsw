package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

/**
 *
 * @author 20222PF.CC0003
 */

public class Endereco {
    private Integer ID;
    private String CEP;
    private String complemento;

    public Endereco(Integer ID, String CEP, String complemento) {
        this.ID = ID;
        this.CEP = CEP;
        this.complemento = complemento;
    }

    public Endereco() {}

    public Integer getID() {
        return ID;
    }

    public String getCEP() {
        return CEP;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
