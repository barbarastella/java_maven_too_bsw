package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

/**
 *
 * @author 20222PF.CC0003
 */

public class Municao extends Artefato {
    private Boolean explosiva;
    private Calibre calibre;

    public Municao() {}

    public Municao(Boolean explosiva, Calibre calibre) {
        this.explosiva = explosiva;
        this.calibre = calibre;
    }

    public Boolean getExplosiva() {
        return explosiva;
    }

    public Calibre getCalibre() {
        return calibre;
    }

    public void setExplosiva(Boolean explosiva) {
        this.explosiva = explosiva;
    }

    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }
}
