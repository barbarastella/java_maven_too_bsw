package br.edu.ifsul.bcc.too.anotacoes.Aula0611;

import java.util.Collection;
import java.util.logging.Logger;

/**
 *
 * @author 20222PF.CC0003
 */

public class Foto {
    
    private Integer codigo;
    private String filename;
    private String path;
    private Byte[] file; // ou private String base64;
    private Produto produto; // AGREGAÇÃO por COMPOSIÇÃO (collection na classe Produto)

    public Foto() {}

    public Foto(Integer codigo, String filename, String path, Byte[] file, Produto produto) {
        this.codigo = codigo;
        this.filename = filename;
        this.path = path;
        this.file = file;
        this.produto = produto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getFilename() {
        return filename;
    }

    public String getPath() {
        return path;
    }

    public Byte[] getFile() {
        return file;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setFile(Byte[] file) {
        this.file = file;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}