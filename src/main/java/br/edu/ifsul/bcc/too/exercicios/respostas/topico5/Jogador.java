package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */

public class Jogador {
    private String nickname;
    private String senha;
    private Integer pontos;
    private Calendar data_cadastro;
    private Calendar data_ultimo_login;
    private Endereco address; // associação
    private Collection<Patente> patente; // agregação // cada jogador deve ter 2 patentes
    private Collection<Artefato> artefato; // agregação
    private Collection<Compra> compra; // composição
    
    public Jogador() {}

    public Jogador(String nickname, String senha, Integer pontos, Calendar data_cadastro, Calendar data_ultimo_login, Endereco address, Collection<Patente> patente, Collection<Artefato> artefato, Collection<Compra> compra) {
        this.nickname = nickname;
        this.senha = senha;
        this.pontos = pontos;
        this.data_cadastro = data_cadastro;
        this.data_ultimo_login = data_ultimo_login;
        this.address = address;
        this.patente = patente;
        this.artefato = artefato;
        this.compra = compra;
    }

    public String getNickname() {
        return nickname;
    }

    public String getSenha() {
        return senha;
    }

    public Integer getPontos() {
        return pontos;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public Calendar getData_ultimo_login() {
        return data_ultimo_login;
    }

    public Endereco getAddress() {
        return address;
    }

    public Collection<Patente> getPatente() {
        return patente;
    }

    public Collection<Artefato> getArtefato() {
        return artefato;
    }

    public Collection<Compra> getCompra() {
        return compra;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
    }

    public void setAddress(Endereco address) {
        this.address = address;
    }

    public void setPatente(Collection<Patente> patente) {
        this.patente = patente;
    }

    public void setArtefato(Collection<Artefato> artefato) {
        this.artefato = artefato;
    }

    public void setCompra(Collection<Compra> compra) {
        this.compra = compra;
    }
}
