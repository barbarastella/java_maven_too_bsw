package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

/**
 *
 * @author 20222PF.CC0003
 */

public class Patente {
    private Integer ID;
    private String nome;
    private String cor;

    public Patente() {}

    public Patente(Integer ID, String nome, String cor) {
        this.ID = ID;
        this.nome = nome;
        this.cor = cor;
    }

    public Integer getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
