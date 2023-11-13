package br.edu.ifsul.bcc.too.anotacoes.Aula0611;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0003
 */
public class Funcionario extends Pessoa { // subclasse de Pessoa (classe mãe); implementação de relacionamento HERANÇA
    
    // atributos da instância: número do CTPS, data de admissão
    
    private String CTPS;
    private Calendar dtadmissao;
    private Collection<CursoAprimoramento> cursos; // AGREGAÇÃO: semelhante ao relacionamento N-N de um banco de dados
    
    // construtor com e sem parâmetros
    
    public Funcionario() {}

    public Funcionario(String CTPS, Calendar dtadmissao) {
        this.CTPS = CTPS;
        this.dtadmissao = dtadmissao;
    }
    
    // encapsulamento

    public String getCTPS() {
        return CTPS;
    }

    public Calendar getDtadmissao() {
        return dtadmissao;
    }

    public Collection<CursoAprimoramento> getCursos() {
        return cursos;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public void setDtadmissao(Calendar dtadmissao) {
        this.dtadmissao = dtadmissao;
    }

    public void setCursos(Collection<CursoAprimoramento> cursos) {
        this.cursos = cursos;
    }
    
    
}
