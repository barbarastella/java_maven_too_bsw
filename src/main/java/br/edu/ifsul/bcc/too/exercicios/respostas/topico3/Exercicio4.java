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

        private static float calcular(Float x, Float y, Float z) {
            return (x + y + z) / 3f;
        }
        
    public static void main(String[] args) {
              
        System.out.println("Quantidade de argumentos: " + args.length); // imprime a quantidade de argumentos passados
        
        if (args.length == 3) {
            System.out.println("Primeiro parâmetro: " + args[0]);
            Float x = Float.parseFloat(args[0]); // converte valor de string para float
            
            System.out.println("Segundo parâmetro: " + args[1]);
            Float y = Float.parseFloat(args[1]); // converte valor de string para float
            
            System.out.println("Segundo parâmetro: " + args[2]);
            Float z = Float.parseFloat(args[2]); // converte valor de string para float
            
            Float media = calcular(x, y, z);
            System.out.println("-> Média: " + media);
             
        } else {
            System.out.println("Não recebeu Parametro/argumento recebido pela funcao main...");
        }

    }

}
