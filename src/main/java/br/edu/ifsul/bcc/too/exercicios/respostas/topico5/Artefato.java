package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

/**
 *
 * @author 20222PF.CC0003
 */

public abstract class Artefato { // abstract faz com que não seja possível criar uma instância Artefato()
    private Integer ID;
    private String nome;
    private Float peso;
    private Float valor;

    public Artefato() {}

    public Artefato(Integer ID, String nome, Float peso, Float valor) {
        this.ID = ID;
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }

    public Integer getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public Float getPeso() {
        return peso;
    }

    public Float getValor() {
        return valor;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
