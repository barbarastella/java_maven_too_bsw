package br.edu.ifsul.bcc.too.anotacoes.Aula0611;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */
public class Pedido {

    // atributos da instância: código, data, valor total, cliente
    private String codigo;
    private Calendar data;
    private Float total;
    private Cliente C; // implementação de relacionamento ASSOCIAÇÃO (o mesmo que um relacionamento 1-N em banco de dados)
    private Collection<Produto> produtos; // AGREGAÇÃO: semelhante ao relacionamento N-N de um banco de dados

    // construtor com e sem parâmetros
    public Pedido() {
    }

    public Pedido(String codigo, Calendar data, Float total, Cliente C, Collection<Produto> produtos) {
        this.codigo = codigo;
        this.data = data;
        this.total = total;
        this.C = C;
        this.produtos = produtos;
    }

    // encapsulamento
    public String getCodigo() {
        return codigo;
    }

    public Calendar getData() {
        return data;
    }

    public Float getTotal() {
        return total;
    }

    public Cliente getC() {
        return C;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setC(Cliente C) {
        this.C = C;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setProduto(Produto produto) { // recebe um único produto e adiciona à coleção
        if (this.produtos != null) {
            this.produtos = new ArrayList();
        }

        this.produtos.add(produto);
    }

    /*@Override
    public String toString() { // já formata a impressão
        String retorno = new String();
        
        retorno = this.getC().getCPF() + " " + this.getCodigo();
        
        return retorno;
    }*/
}
