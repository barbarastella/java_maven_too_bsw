package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */

public class Objetivo {
    private Integer ID;
    private String descricao;
    private Integer pontos;
    private Collection<Local> local; 

    public Objetivo() {}

    public Objetivo(Integer ID, String descricao, Integer pontos, Collection<Local> local) {
        this.ID = ID;
        this.descricao = descricao;
        this.pontos = pontos;
        this.local = local;
    }

    public Integer getID() {
        return ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getPontos() {
        return pontos;
    }

    public Collection<Local> getLocal() {
        return local;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public void setLocal(Collection<Local> local) {
        this.local = local;
    }
}
