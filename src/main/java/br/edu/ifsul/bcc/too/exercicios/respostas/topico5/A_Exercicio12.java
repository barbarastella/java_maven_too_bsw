
package br.edu.ifsul.bcc.too.exercicios.respostas.topico5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author 20222PF.CC0003
 */

public class A_Exercicio12 {
    
    public A_Exercicio12() {}
    
    /* 11.1 Codificar o diagrama de classe sobre o estudo de caso: Counter Strike
    
    11.1.1 Criar uma rotina para adicionar objetos (dois) do tipo Jogador em uma lista.
    Cada jogador deverá ter uma lista (2 objetos) de Arma e Municao e duas patentes.
    Em seguida, imprima na saída padrão, os jogadores com seus respectivos artefatos e patentes. */
    
    private List<Object> inicializaListJogadores() {  
        List<Object> jogadores = new ArrayList();
        
        Jogador J1 = new Jogador(); 
        
        J1.setNickname("player1");

        //((Funcionario) F1).setCTPS("123456"); // opção 1: utilizando casting
        //((Funcionario) F1).setDtadmissao(Calendar.getInstance()); // opção 1: utilizando casting

        jogadores.add(J1);
        
        return null;
    }
    
    private void imprimeListJogadores(List<Object> lista){  
        
        
    }
    
    public static void main(String args[]){
        new A_Exercicio12();
    }

}
