package br.edu.ifsul.bcc.too.exercicios.respostas.topico3;

/**
 *
 * @author Prof. Telmo Júnior
 */
import java.util.Scanner; // pacote essencial para o uso do tipo Scanner

public class Exercicio1 {

    public static void main(String[] args) {

        int[][] rgDados1 = new int[3][3];
        int[][] rgDados2 = new int[3][3]; // matrizes
        int[][] rgDados3 = new int[3][3];

        /*
            1) Com base no método hasNext da classe Scanner obtenha informações do console e inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para somar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3. 
               Por fim imprima no console os dados gerados (rgDados3).
        
               Documentação: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
         */
        Scanner sc = new Scanner(System.in); //variável sc de tipo Scanner

        for (int linha = 0; linha < rgDados1.length; linha++) {
            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {

                System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "] da MATRIZ 1: "); // solicita valor

                boolean flag = true; // validação do valor inserido
                while (flag) {
                    try {
                        if (sc.hasNext()) {
                            rgDados1[linha][coluna] = Integer.parseInt(sc.next()); // converte de sting para inteiro e atribui à matriz
                            flag = false;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!"); // imprime mensagem de erro se o valor inserido não for int
                        flag = true;
                    }
                }
            }
        }

        System.out.println(); // quebra de linha

        for (int linha = 0; linha < rgDados1.length; linha++) {
            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {

                System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "] da MATRIZ 2: "); // solicita valor

                boolean flag = true; // validação do valor inserido
                while (flag) {
                    try {
                        if (sc.hasNext()) {
                            rgDados2[linha][coluna] = Integer.parseInt(sc.next()); // converte de sting para inteiro e atribui à matriz
                            flag = false;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!"); // imprime mensagem de erro se o valor inserido não for int
                        flag = true;
                    }
                }
            }
        }

        System.out.println("\nMatriz 1:");

        for (int linha = 0; linha < rgDados1.length; linha++) {
            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {
                System.out.print(rgDados1[linha][coluna] + "\t"); // imprime matriz rgDados1
            }
            System.out.println();
        }

        System.out.println("\nMatriz 2:");

        for (int linha = 0; linha < rgDados1.length; linha++) {
            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {
                System.out.print(rgDados2[linha][coluna] + "\t"); // imprime matriz rgDados2
            }
            System.out.println();
        }

        System.out.println("\nMatriz 3:");

        for (int linha = 0; linha < rgDados1.length; linha++) {
            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {
                rgDados3[linha][coluna] = rgDados1[linha][coluna] + rgDados2[linha][coluna]; // atribui a soma das matrizes 1 e 2 para a 3 
                System.out.print(rgDados3[linha][coluna] + "\t"); // imprime matriz rgDados3
            }
            System.out.println();
        }
    }

}