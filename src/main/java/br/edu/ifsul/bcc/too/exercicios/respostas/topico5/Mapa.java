package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */

public class Mapa {
    private Integer ID;
    private String nome;
    private Collection<Local> local; 

    public Mapa() {}

    public Mapa(Integer ID, String nome, Collection<Local> local) {
        this.ID = ID;
        this.nome = nome;
        this.local = local;
    }

    public Integer getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public Collection<Local> getLocal() {
        return local;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(Collection<Local> local) {
        this.local = local;
    }
}
