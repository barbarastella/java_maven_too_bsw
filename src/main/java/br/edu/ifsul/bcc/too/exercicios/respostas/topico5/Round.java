package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */

public class Round {
    private Integer ID;
    private Integer numero;
    private Calendar inicio;
    private Calendar fim;
    private Collection<Objetivo> objetivo;

    public Round() {}

    public Round(Integer ID, Integer numero, Calendar inicio, Calendar fim, Collection<Objetivo> objetivo) {
        this.ID = ID;
        this.numero = numero;
        this.inicio = inicio;
        this.fim = fim;
        this.objetivo = objetivo;
    }

    public Integer getID() {
        return ID;
    }

    public Integer getNumero() {
        return numero;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public Collection<Objetivo> getObjetivo() {
        return objetivo;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public void setObjetivo(Collection<Objetivo> objetivo) {
        this.objetivo = objetivo;
    }
}
