package br.edu.ifsul.bcc.too.exercicios.respostas.topico3;

/**
 *
 * @author telmo junior
 */
public class Exercicio4 {

    /*
      4) Teste e recupere duas informações recebidas por parâmetro no método main. Para isso execute a main informando dois valores. 
         Caso os valores sejam inteiros positivos. Calcule a média e imprima na tela o resultado. Caso contrário, informe e finalize o programa.
             
        Comando para compilação (a partir do diretorio java): javac br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4.java
        Comando para execução (a partir do diretorio java): java br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4
     */

        private static float calcular(Float x, Float y) {
            return (x + y) / 2f;
        }
        
    public static void main(String[] args) {
              
        if (args.length == 2) {
            System.out.println("Insira o primeiro valor: " + args[0]);
            Float x = Float.parseFloat(args[0]);
            
            System.out.println("Insira o segundo valor: " + args[1]);
            Float y = Float.parseFloat(args[1]);
            
            Float media = calcular(x, y);
            System.out.println("-> Média: " + media);
             
        } else {
            System.out.println("Não recebeu Parametro/argumento recebido pela funcao main.");
        }

    }

}