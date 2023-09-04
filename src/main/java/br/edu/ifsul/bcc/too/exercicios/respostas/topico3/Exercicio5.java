package br.edu.ifsul.bcc.too.exercicios.respostas.topico3;

/**
 *
 * @author telmo
 */
public class Exercicio5 {

    static String strDados = "\nA classe String é utilizada por toda a API do Java e por diversas vezes precisaremos dela em nossos códigos."
            + "\nIsso faz com que o domínio dessa classe seja fundamental para todo aquele que deseja se tornar um programador Java."
            + "\nAqui neste artigo falaremos sobre as principais características dessa classe com exemplos de código e comentários.";

    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma rotina para utilizar os
           métodos da classe java.lang.String utilizando a variável estática strDados:
           
           concat: concatena duas ou mais strings
           String.valueOf: converte um tipo primitivo em um objeto do tipo String
           startsWith:
           endsWith:
           indexOf:
           substring:
           replace:
           trim:
           compareto:
     */
    public Exercicio5() { // constutor 1 da classe 
        // System.out.println("Executou o primeiro construtor da classe!");
        manipulaString();
    }

    public Exercicio5(String aux) { //  constutor 2 da classe (com assinatura diferente)
        System.out.println("Executou o segundo construtor da classe!");
    }

    private void manipulaString() { // método da classe
        String R = "1. Exemplo de ";
        String S = R.concat("concat!"); // ou String S = "1. exemplo de ".concat(R);
        System.out.println(S);
        
        // ----------------------------------------------------------------------------
        System.out.println("2. Exemplo de valueOf!"); // converte um tipo primitivo para String
        
        double x = 1.87453739; 
        System.out.println("-> retorno pós-conversão: " + String.valueOf(x));
        
        //-----------------------------------------------------------------------------
        System.out.println("3. Exemplo de startsWith!");
        
        String z = "Abacate";
        System.out.println("-> retorno pós-conversão: " + String.valueOf(x));
        
        
    }

    public static void main(String args[]) { // método main

        // usa-se o método construtor para evitar de usar static em todos os objetos da classe
        Exercicio5 e5 = new Exercicio5(); // cria e inicializa o objeto da classe
        // new Exercicio5(); criação da instância sem atribuição à um objeto

        // e5.manipulaString(); chamada do método a partir do objeto
    }
}
