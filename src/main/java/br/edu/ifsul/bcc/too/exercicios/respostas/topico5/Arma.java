package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */

public class Arma extends Artefato {
    private Float comprimento_cano;
    private Tipo tipo;
    Collection<Municao> municao;

    public Arma() {}

    public Arma(Float comprimento_cano, Tipo tipo, Collection<Municao> municao) {
        this.comprimento_cano = comprimento_cano;
        this.tipo = tipo;
        this.municao = municao;
    }
    
    public Float getComprimento_cano() {
        return comprimento_cano;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Collection<Municao> getMunicao() {
        return municao;
    }

    public void setComprimento_cano(Float comprimento_cano) {
        this.comprimento_cano = comprimento_cano;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setMunicao(Collection<Municao> municao) {
        this.municao = municao;
    }
}
