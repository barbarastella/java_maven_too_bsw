
package br.edu.ifsul.bcc.too.anotacoes;

/**
 *
 * @author telmo
 */
public class Aluno_util2309 implements Comparable<Aluno_util2309> {
    
    private String matricula;// atributo da instância.
    private String nome;//atributo da instância.
    
    //construtor protegido - somente acessível dentro do pacote.
    public Aluno_util2309(){
        
    }
    
    public Aluno_util2309(String matricula, String nome){
        
        //os dados recebidos por parametro são utilizados para inicilizar os atributos da instância.
        
        //atributo da instância recebe o parâmetro.
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno_util2309 t) {
        
        //ascendente pela matricula
        return this.matricula.compareTo(t.matricula); // classifica pela matrícula em Colecoes.java
        
        //descendente pela matricula
        //return t.matricula.compareTo(this.matricula);
        
        //ascendente pelo nome
        // return this.nome.compareTo(t.nome); // classifica pelo nome em Colecoes.java
        
        //desccendente pelo nome
        //  return t.nome.compareTo(this.nome);
        
    }
    
    //o metodo toString pertence a classe java.lang.Object.
    //polimorfismo: alteração de forma (sobreescrita de método).
    
    @Override
    public String toString(){
        
        return matricula+ " - "+nome;
    }
    
    
}
