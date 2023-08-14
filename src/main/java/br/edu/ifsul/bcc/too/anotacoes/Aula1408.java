package br.edu.ifsul.bcc.too.anotacoes;

import java.lang.*; // usa-se * para importar tudo o que vem no pacote

/**
 *
 * @author telmo Junior
 * @data 31/03/22021
 */
public class Aula1408 { // nome de classe inicia sempre com maiúscula e deve ser o mesmo do arquivo

    // atributos da instância
    // public: acesso sem restrição
    // protected: acesso somente dentro do pacote
    // private: acesso somente dentro da classe
    
    private Integer atributoPrimeiro; // nome de variável inicia sempre com minúscula

    // métodos (funções): acessibilididade > tipo > nome > parâmetros > retorno
    // nome e parâmetros compõem a assinatura do método
    // se não informar acessibilidade, fica o default (protected)
    // se não informar tipo, fica o default (void)
    // nome de método sempre inicia em minúsculo, palavras seguintes começando em maiúscula
    
    private static float calculaMedia(float p1, float p2) { // nome de parâmetro inicia sempre com minúscula
        //float x = p1 + p2;
        //return (x / 2f);
        return (p1 + p2) / 2f;
    }

    // é possível criar dois ou mais métodos com o mesmo nome, desde que os parâmetros (tipo/nome) sejam diferentes
    
    private float calculaMedia(String p1, String p2) {
          return (Float.parseFloat(p1) + Float.parseFloat(p2)) / 2f; // conversão de string para float; converte só uma var por vez
    }

    public static void main(String[] args) { // main é um método especial: definição como public static void é obrigatória

        // variáveis são posições na memória do computador que podem armazenar dados
        // formadas por quatro elementos: nome, tipo, tamanho e valor. 
        // dependendo da programação, o básico de uma declaração de variável pode ter somente um tipo, um nome e um valor   
        
        int a, b = 0;
        float c = 4, d = 7;
        boolean t;
        
        // mesmo tendo o mesmo nome, o programa consegue distinguir entre qual método chamar pela assinatura: quantidade e tipo dos parâmetros
        
        float media = calculaMedia(c, d); // foi preciso adicionar static ao método calculaMedia para ser possível chamá-lo
        System.out.println("-> Resultado: " + media); // shortcut: sout 

        String e = "";
        char f;
        f = 'A';
        
        int[] vetor;
        vetor = new int[10];
        
        int[] array = {1, 2, 3};
        
        //imprimeDados(m.toString());
    }

    private static void imprimeDados(String dados) {
        System.out.println(dados);
    }

    //private static Float calculaMedia(Integer p1, Integer p2) {
       // return (p1 + p2) / 2f;
    //}
}
