package br.edu.ifsul.bcc.too.anotacoes.Aula0611;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */

public class Produto {
    
    private Integer ID;
    private String nome;
    private Float valor;
    private Collection<Foto> fotos; // AGREGAÇÃO: semelhante ao relacionamento N-N de um banco de dados

    public Produto() {}

    public Produto(Integer ID, String nome, Float valor, Collection<Foto> fotos) {
        this.ID = ID;
        this.nome = nome;
        this.valor = valor;
        this.fotos = fotos;
    }

    public Integer getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public Float getValor() {
        return valor;
    }

    public Collection<Foto> getFotos() {
        return fotos;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void setFotos(Collection<Foto> fotos) {
        this.fotos = fotos;
    }
    
    public void setFoto(Foto foto)
    {
        if (this.fotos == null)
            this.fotos = new ArrayList();
        
        this.fotos.add(foto);
    }
}
