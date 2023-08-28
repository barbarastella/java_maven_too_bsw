
package br.edu.ifsul.bcc.too.exercicios.respostas.topico3;

import java.util.Scanner;

/**
 *
 * @author Prof. Telmo Júnior
 */
public class Exercicio2 {
    
    static  int[][] rgDados1 = new int[3][3];
    static  int[][] rgDados2 = new int[3][3];
    static  int[][] rgDados3 = new int[3][3];
    
    public static void main(String[] args) {
        
        /*
            2) Com base no código fonte produzido no exercicio 1, implemente um tratamento de exceção para
               tratar possível erro na conversão de string para integer no comando "Integer.parseInt(sc.next())".
        
               Documentação: https://www.devmedia.com.br/blocos-try-catch/7339
        */
        
        Scanner sc = new Scanner(System.in); //variável sc de tipo Scanner; System.in para definir entrada padrão

        for (int linha = 0; linha < rgDados1.length; linha++) {
            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {

                System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "] da MATRIZ 1: "); // solicita valor

                boolean flag = true; // validação do valor inserido
                while (flag) {
                    try {
                        if (sc.hasNext()) {
                            rgDados1[linha][coluna] = Integer.parseInt(sc.next()); // converte de string para inteiro e atribui à matriz
                            flag = false;
                        }
                    } catch (NumberFormatException e) { // da classe Exception que representa os erros possíveis do código
                        // e.printStackTrace(); imprime todos os erros localizados
                        // e.getMessage(); imprime uma mensagem detalhada do erro
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
