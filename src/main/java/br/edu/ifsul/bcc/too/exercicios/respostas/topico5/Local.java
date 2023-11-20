package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

/**
 *
 * @author 20222PF.CC0003
 */

public class Local {
    private Integer ID;
    private String nome;
    private String latitude;
    private String longitude;

    public Local() {}

    public Local(Integer ID, String nome, String latitude, String longitude) {
        this.ID = ID;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public Integer getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
