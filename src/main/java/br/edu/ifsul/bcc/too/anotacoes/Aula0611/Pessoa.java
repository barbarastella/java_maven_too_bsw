package br.edu.ifsul.bcc.too.anotacoes.Aula0611;

import java.util.Calendar;

/**
 *
 * @author 20222PF.CC0003
 */

public class Pessoa { // superclasse não referencia ninguém
    
    // atribuos da instância: CPF, RG, nome, logradouro e número, data de nascimento, peso
    
    private String CPF;
    private String RG;
    private String nome;
    private String logradouro;
    private Integer numero;
    private Calendar dtnsc;
    private Float peso;
    private Boolean status;
    
    // construtor com e sem parâmetros
    
    public Pessoa() {}

    public Pessoa(String CPF, String RG, String nome, String logradouro, Integer numero, Calendar dtnsc, Float peso, Boolean status) {
        this.CPF = CPF;
        this.RG = RG;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.dtnsc = dtnsc;
        this.peso = peso;
        this.status = status;
    }
    
    // encapsulamento
    
    public String getCPF() {
        return CPF;
    }

    public String getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public Calendar getDtnsc() {
        return dtnsc;
    }

    public Float getPeso() {
        return peso;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setDtnsc(Calendar dtnsc) {
        this.dtnsc = dtnsc;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
