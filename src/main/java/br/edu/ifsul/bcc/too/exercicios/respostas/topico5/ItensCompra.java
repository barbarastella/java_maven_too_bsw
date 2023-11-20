package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

/**
 *
 * @author 20222PF.CC0003
 */

public class ItensCompra {
    private Integer ID;
    private String qtd;
    private Float valor;
    private Compra compra;
    private Artefato artefato;

    public ItensCompra() {}

    public ItensCompra(Integer ID, String qtd, Float valor, Compra compra, Artefato artefato) {
        this.ID = ID;
        this.qtd = qtd;
        this.valor = valor;
        this.compra = compra;
        this.artefato = artefato;
    }

    public Integer getID() {
        return ID;
    }

    public String getQtd() {
        return qtd;
    }

    public Float getValor() {
        return valor;
    }

    public Compra getCompra() {
        return compra;
    }

    public Artefato getArtefato() {
        return artefato;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void setArtefato(Artefato artefato) {
        this.artefato = artefato;
    }
}
