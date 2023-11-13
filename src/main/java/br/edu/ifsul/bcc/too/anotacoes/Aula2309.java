
package br.edu.ifsul.bcc.too.anotacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author telmo
 * Documentacao: https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450
 */

public class Aula2309 {
    
    /*
        A partir de Java 1.2, foi criado um conjunto de interfaces e classes denominado Collections Framework, 
        que faz parte do pacote java.util. 
    
        Collections Framework é um conjunto bem definido de interfaces e classes para representar e 
        tratar grupos de dados como uma única unidade, que pode ser chamada coleção, ou collection. 
        A Collections Framework contém os seguintes elementos:
            Interfaces: tipos abstratos que representam as coleções. 
            Implementações: são as implementações concretas das interfaces;
            Algoritmos: são os métodos que realizam as operações sobre os objetos das coleções.     
    
        Interfaces:
    
            Collection - define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;
            Set - interface que define uma coleção que não permite elementos duplicados.
            SortedSet: possibilita a classificação natural dos elementos, tal como a ordem alfabética;
            
    */
        
    //atributo de instância 
    private Set<Object> st;
            
    /*
            List  – define uma coleção ordenada, podendo conter elementos duplicados. 
               Temos o controle total sobre a posição onde cada elemento é inserido e pode recuperá-los 
               através de seus índices.
     
            Map   - mapeia chave para valores.

    */ 

    // interfaces não são modelos e não podem ser criadas, são apenas protótipos conceituais
    // Set: HashSet, LinkedHashSet; SortedSet: TreeSet
    // List: ArrayList, Vector, LinkedList
    // Queue: LinkedList, PriorityQueue
    
    //atributo de instância.
   // private Collection<Integer> minhaLista;
    
    //atributo de instância.
    private List<Integer> lst; // lista de inteiros; colocar <Object> fará a lista aceitar qualquer tipo de dado misturado
        
    private Map<String, String> mp; // mapa de inteiros
    
    //construtor        
    protected Aula2309(){
        
        
    }
            
    //construtor 
    public Aula2309(Integer tipo){
        
        // é como um array cujo tamanho pode crescer. A busca de um elemento é rápida, mas inserções e exclusões não são.
        lst = new ArrayList();
        
        // add: inclusão de valores na lista
        
        lst.add(1);
        lst.add(20);
        lst.add(0);
        lst.add(15);
        lst.add(8);
        lst.add(3);
        lst.add(15);//elemento duplicado.
        
        lst.remove(0);  // remove: remoção de elemento por índice
        
        // System.out.println(lst); // imprimir a lista inteira no modelo [x, y]
        
        for (int i = 0; i < lst.size(); i++) // podendo também utilizar for(Integer i : lst){System.out.println(i);}
            System.out.println("Elemento " + i + " da List: " + lst.get(i)); // get: recuperar elemento pelo índice
        
        //System.out.println("Contem o elemento com o valor 150: " + lst.contains(150));
    }
    
    //construtor 
    public Aula2309(String tipo){ 
        st = new TreeSet(); // se a necessidade for um conjunto com elementos não duplicados e acesso em ordem natural
        
        st.add("Nova Zelandia");
        st.add("França");
        st.add("Brasil");
        st.add("Belgica");
        st.add("Japão");
        st.add("Brasil"); // será desconsiderado por ser duplicado
        // st.add(1); // exemplificando o erro da conversão abaixo
        
        Integer j = 0;
        for (Object x : st)           
            System.out.println("Elemento " + (j++) + " do Set: " + (String)  x); // casting: modelagem de Object para String
            // casting só funciona neste caso porque os dados já são String, gera erro ao tentar concatenar outros tipos mesmo com a tentativa de conversão
    }
    
    public void metodoHashmap(){
        
        // escolha esta implementação se a ordenação não for importante e desejar uma estrutura onde seja necessário um ID (identificador). 
        mp = new HashMap();
        
        mp.put("id", "1"); // valor substituido pelo inserido por último com a mesma chave; pode-se ter valores repetidos, mas chave não
        mp.put("uz", "0000134");
        mp.put("cpf", "0000134");
        mp.put("id", "100000");
        
        
        for (Map.Entry <String, String> m : mp.entrySet()) // entrySet: retorna os valores do mapa
            System.out.println("Chave: " + m.getKey() + " | Valor: "+ m.getValue());
        
        // System.out.println("chave uz: " + mp.get("uz")); 
    }
    
    public void metodoClassificacaoMap() {
        //Aplicação semelhante a HashMap, com a diferença que TreeMap perde no quesito desempenho;
        SortedMap <String, Aluno_util2309> map = new TreeMap();
        
        map.put("0" , new Aluno_util2309("456a","junior"));
        map.put("1" , new Aluno_util2309("789a","fulano"));
        map.put("0" , new Aluno_util2309("789a","abel"));
        map.put("50" , new Aluno_util2309("789a","abel"));
        map.put("3" , new Aluno_util2309("123a","telmo"));
        
        for (Map.Entry <String, Aluno_util2309> m : map.entrySet())
            System.out.println("Chave: " + m.getKey() + " | Valor: " + m.getValue());         
    }
    
    public void metodoClassificacao(){
        
        java.util.List<Aluno_util2309> list = new ArrayList();//criando a variavel list.
        
        Aluno_util2309 a = new Aluno_util2309("pf009","telmo");// criacao do objeto/variavael a do tipo Aluno_util2309.
        list.add(a);
        
        Aluno_util2309 b = new Aluno_util2309("pf002","junior");
        list.add(b);
        
        Aluno_util2309 c = new Aluno_util2309("pf003","fulano");
        list.add(c);
        
        Aluno_util2309 d = new Aluno_util2309("pf000","Abel");
        list.add(d);
        
        Aluno_util2309 e = new Aluno_util2309("pf01", "Ciclano"); //criando a instancia a partir do construtor sem parâmetros
        list.add(e);
        
        System.out.println("Antes: " + list); //antes
               
        Collections.sort(list); // classificacao com base na método compareTo da classe Aluno_util2309 (@Override)      
        
        System.out.println("Depois: " + list); //depois
    }
    
    public static void main(String[] args) {
       //new Aula2309(0); //criacao da instância invoncando o construtor que recebe um integer
        
       System.out.println();
       
      // new Aula2309("a");  //criacao da instância invocando o construtor que recebe uma String.        
       
       System.out.println();
       
       //criacao da instância invocando o construtor sem parâmetros e chama o método metodoHashmap.
       new Aula2309().metodoHashmap(); 
       
       //Colecoes c = new Colecoes();
       //c.metodoHashmap();
       
       //Colecoes c = new Colecoes();
       // c.metodoClassificacao();
       
       System.out.println();
       
       new Aula2309().metodoClassificacao();        
      
       System.out.println();
       
       new Aula2309().metodoClassificacaoMap();
       
     
     
    }
    
}
