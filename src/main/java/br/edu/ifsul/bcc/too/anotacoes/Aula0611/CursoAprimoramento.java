package br.edu.ifsul.bcc.too.anotacoes.Aula0611;

/**
 *
 * @author 20222PF.CC0003
 */

public class CursoAprimoramento { 
    
    private Integer codigo;
    private String nome;
    private String descricao;
    private Integer CH;

    public CursoAprimoramento() {}

    public CursoAprimoramento(Integer codigo, String nome, String descricao, Integer CH) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.CH = CH;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCH() {
        return CH;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCH(Integer CH) {
        this.CH = CH;
    }
    
    @Override // sobrescrevendo o método toString do classe java.lang.Object
    public String toString()
    {
        return codigo + ": " + nome;
    }
}
