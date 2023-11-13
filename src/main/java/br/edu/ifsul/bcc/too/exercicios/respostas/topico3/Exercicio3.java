package br.edu.ifsul.bcc.too.exercicios.respostas.topico3;

import javax.swing.JOptionPane; // biblioteca de recursos visuais para interação com o usuário

/**
 * @author Telmo Júnior
 */
public class Exercicio3 {

    public static void main(String[] args) {

        int[][] rgDados1 = new int[2][3];
        int[][] rgDados2 = new int[3][2]; // linha e coluna - se a quantidade de coluna da primeira for igual a quantida de linha da segunda
        int[][] rgDados3 = new int[2][2];

        /*
            3) Com base nos métodos da classe JOptionPane obtenha informações do console e inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para multiplicar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3.
               Por fim imprima no console os dados gerados (rgDados3).

               Documentação: https://www.devmedia.com.br/introducao-a-interface-gui-no-java/25646
                             https://brasilescola.uol.com.br/matematica/multiplicacao-matrizes.htm
         */
        for (int linha = 0; linha < rgDados1.length; linha++) {
            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {

                System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "] da MATRIZ 1: ");

                boolean flag = true;
                while (flag) {
                    try {
                        String num = JOptionPane.showInputDialog(null, "Informe um valor inteiro:", "Informe", JOptionPane.PLAIN_MESSAGE);
                        //parentComponent -> posição da caixa de diálogo da interface, neste caso "null" mantém centralizado
                        // message -> mensagem informativa na caixa de diálogo
                        // title -> título da caixinha
                        // messageType: altera o ícone da mensagem, podendo informar um erro, warning, informação etc. "PLAIN_MESSAGE" deixa sem um ícone

                        rgDados1[linha][coluna] = Integer.parseInt(num);

                        flag = false;

                    } catch (NumberFormatException e) {
                        System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
                        flag = true;
                    }
                }
            }
        }
                

        for (int linha = 0; linha < rgDados2.length; linha++) {
            for (int coluna = 0; coluna < rgDados2[linha].length; coluna++) {

                System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "] da MATRIZ 2: ");

                boolean flag = true;
                while (flag) {
                    try {
                        String num = JOptionPane.showInputDialog(null, "Informe um valor inteiro:", "Informe", JOptionPane.PLAIN_MESSAGE);
                        rgDados2[linha][coluna] = Integer.parseInt(num);

                        flag = false;

                    } catch (NumberFormatException e) {
                        System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
                        flag = true;
                    }
                }

            }
        }

        System.out.println("\nMatriz 1:");

        for (int linha = 0; linha < rgDados1.length; linha++) {
            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {
                System.out.print(rgDados1[linha][coluna] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz 2:");

        for (int linha = 0; linha < rgDados2.length; linha++) {
            for (int coluna = 0; coluna < rgDados2[linha].length; coluna++) {
                System.out.print(rgDados2[linha][coluna] + "\t");
            }
            System.out.println();
        }

        for (int linha = 0; linha < rgDados1.length; linha++) {
            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {
                rgDados3[linha][coluna] = rgDados1[linha][coluna] + rgDados2[linha][coluna]; // atribui a soma das matrizes 1 e 2 para a 3 
                System.out.print(rgDados3[linha][coluna] + "\t"); // imprime matriz rgDados3
            }
            System.out.println();
        }

    }

}
