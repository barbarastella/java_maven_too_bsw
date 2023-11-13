package br.edu.ifsul.bcc.too.anotacoes.Aula0611;

/**
 *
 * @author 20222PF.CC0003
 */
public class Aluno extends Pessoa { // subclasse de Pessoa (classe mãe); implementação de relacionamento HERANÇA
    
    //  atributos da instância: núumero da matrícula, coeficiente de rendimento
    
    private String matricula;
    private Float CR;

    // construtor com e sem parâmetros
    
    public Aluno() {}

    public Aluno(String matricula, Float CR) {
        this.matricula = matricula;
        this.CR = CR;
    }
    
    // encapsulamento

    public String getMatricula() {
        return matricula;
    }

    public Float getCR() {
        return CR;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCR(Float CR) {
        this.CR = CR;
    }
}
