package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */

public class Compra {
    private Integer ID;
    private Calendar data;
    private Float total;
    private Jogador jogador;
    private Collection<ItensCompra> itensCompra;

    public Compra() {}

    public Compra(Integer ID, Calendar data, Float total, Jogador jogador, Collection<ItensCompra> itensCompra) {
        this.ID = ID;
        this.data = data;
        this.total = total;
        this.jogador = jogador;
        this.itensCompra = itensCompra;
    }

    public Integer getID() {
        return ID;
    }

    public Calendar getData() {
        return data;
    }

    public Float getTotal() {
        return total;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Collection<ItensCompra> getItensCompra() {
        return itensCompra;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void setItensCompra(Collection<ItensCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }
}
