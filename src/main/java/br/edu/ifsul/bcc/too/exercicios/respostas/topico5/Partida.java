package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */

public class Partida {
    private Integer ID;
    private Calendar inicio;
    private Calendar fim;
    private Jogador jogador;
    private Collection<Round> round;

    public Partida() {}

    public Partida(Integer ID, Calendar inicio, Calendar fim, Jogador jogador, Collection<Round> round) {
        this.ID = ID;
        this.inicio = inicio;
        this.fim = fim;
        this.jogador = jogador;
        this.round = round;
    }

    public Integer getID() {
        return ID;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Collection<Round> getRound() {
        return round;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void setRound(Collection<Round> round) {
        this.round = round;
    }
}
