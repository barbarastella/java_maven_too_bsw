package br.edu.ifsul.bcc.too.anotacoes;

import java.lang.String;

/**
 *
 * @author telmo
 */
public class Aula0409 {

    public Aula0409(String texto, String texto2, String texto3, String texto4) { // construtor
        testeComparacaoStrings(texto, texto2, texto3, texto4);
        testeSplit("1,2,3,4,5,6,7,a,b,c,8");
        teste2Split("{codigo: 1},{codigo: 22},{codigo: 300}");
    }

    private void testeComparacaoStrings(String texto, String texto2, String texto3, String texto4) {

        // == -> verificação de instância 
        /**
         * if (texto == texto2) { System.out.println("Texto tem a mesma
         * instância de texto2."); } else { System.out.println("Texto não tem a
         * mesma instância de texto2."); }
         *
         * if (texto == texto3) { System.out.println("Texto tem a mesma
         * instância de texto3."); } else { System.out.println("Texto não tem a
         * mesma instância de texto3."); }
         *
         * // equals -> verificação de conteúdo if (texto.equals(texto2)) {
         * System.out.println("O conteúdo de texto e texto2 é igual."); } else {
         * System.out.println("O conteúdo de texto e texto2 não é igual."); }
         *
         * if (texto.equals(texto3)) { System.out.println("O conteúdo de texto e
         * texto3 é igual."); } else { System.out.println("O conteúdo de texto e
         * texto3 não é igual."); }
         *
         * // equalsIgnoreCase -> verificação de conteúdo ignorando distinção
         * entre maiúsculas e minúsculas if (texto.equalsIgnoreCase(texto2)) {
         * System.out.println("O conteúdo de texto e texto2 é igual."); } else {
         * System.out.println("O conteúdo de texto e texto2 não é igual."); }
         *
         * if (texto.equalsIgnoreCase(texto3)) { System.out.println("O conteúdo
         * de texto e texto3 é igual."); } else { System.out.println("O conteúdo
         * de texto e texto3 não é igual.");
        }*
         */
    }

    private void testeSplit(String teste) // base no método java.lang.String.split
    {
        /**
         * // imprima uma lista de informações inteiras na saída padrão,
         * converta para inteiro se necessário String[] vet = teste.split(",");
         *
         * for (String X : vet) { try { Integer num = Integer.valueOf(X);
         * System.out.println(num); } catch (NumberFormatException e) {
         * System.out.println("-"); } } *
         */
    }

    private void teste2Split(String teste) // base no método java.lang.String.split
    {
        String[] vet = teste.split(",");

        if (vet.length == 0) {
            System.out.println("O vetor possui zero partes!");
        } else {
            for (String x : vet) {
                //System.out.println("String: " + x);
                //System.out.println("Índice do espaço: " + x.indexOf(" "));
                //System.out.println("Índice do fecha chaves: " + x.indexOf("}"));
                String y = x.substring(x.indexOf(" ") + 1, x.indexOf("}"));
                
                //Integer z = Integer.parseInt(y); // ou Integer.valueOf
                System.out.println("Valor: " + y + "\n");
            }
        }
    }

    public static void main(String[] args) {

        /*
            Uma String armazena uma sequência de caracteres. Apesar de ser fácil de utilizar, essa classe possui diversas 
            características que podem não ser óbvias para quem está tendo o seu primeiro contato com ela.
        
            Por exemplo, um objeto String é imutável, o que significa que o texto que ele carrega nunca é alterado. 
            Sempre que um texto precisa ser modificado é utilizado mais espaço em memória para que uma nova String seja 
            criada contendo a nova versão dele. Essas características serão o assunto que abordaremos primeiro.
         */
        String texto = "Qualquer texto entre aspas é uma String";
        String texto2 = new String("Qualquer texto entre aspas é uma String");
        String texto3 = "Qualquer texto entre aspas é uma String";
        String texto4 = new String("Qualquer texto entre aspas é uma String");

        "Qualquer texto entre aspas é uma String".length();

        new Aula0409(texto, texto2, texto3, texto4);

        // Principais métodos da classe String: concat, String.valueOf, Length, startsWith endsWith, indexOf, substring, replace, trim
        // Implementar um construtor para essa classe: no método main, criar uma instância de ManipulacaoStrings (Exercicio5_1)
        // Chamar o método testeComparacaoStrings dentro do construtor e implementar rotinas para testar os comandos:
        // ==, equals, equalsIgnoreCase, compareTo e compareToIgnoreCase usando as variáveis texto, texto2 e txt
    }
}
/*
        Fontes: 
            
            https://www.devmedia.com.br/string-em-java-entendendo-e-utilizando-essa-classe/25503
            
 */
