package br.edu.ifsul.bcc.too.anotacoes.Aula0611;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 20222PF.CC0003
 */
public class Exercicio { // ESTUDANDO HERANÇA

    // relacionamentos do diagrama de classes: agregação, agregação por composição, associação e herança
    // EXERCÍCIO 1: criar um método que retorne uma coleção de Pessoa: a coleção deverá ter 5 pessoas (1 Funcionario, 2 Cliente, 2 Aluno)
    
    private Collection<Pessoa> getPessoas() {
        Collection<Pessoa> listPessoa = new ArrayList();

        Pessoa F1 = new Funcionario(); // opcção 2: Funcionario F1 = new Funcionario(), oopção 3: Pessoa F1 = new Funcionario(CTPS, data de adimissão)

        F1.setNome("João da Silva");
        F1.setCPF("038.033.350.35");
        F1.setRG("711127724");
        F1.setDtnsc(Calendar.getInstance());
        F1.setLogradouro("Cipreste");
        F1.setNumero(249);
        F1.setPeso(65f);
        F1.setStatus(Boolean.TRUE);

        ((Funcionario) F1).setCTPS("123456"); // opção 1: utilizando casting
        ((Funcionario) F1).setDtadmissao(Calendar.getInstance()); // opção 1: utilizando casting

        listPessoa.add(F1);

        // -------------------------------------
        Cliente C1 = new Cliente();

        C1.setNome("Maria Oliveira");
        C1.setCPF("111.222.333-44");
        C1.setRG("1234567890");
        C1.setDtnsc(Calendar.getInstance());
        C1.setLogradouro("Avenida Brasil");
        C1.setNumero(1023);
        C1.setPeso(30f);
        C1.setStatus(Boolean.TRUE);
        C1.setDtcompra(Calendar.getInstance());
        C1.setObs("Batatinha");

        listPessoa.add(C1);

        Cliente C2 = new Cliente();
        C2.setNome("Joana Santos");
        C2.setCPF("555.666.777-88");
        C2.setRG("6459786130");
        C2.setDtnsc(Calendar.getInstance());
        C2.setLogradouro("Presidente Vargas");
        C2.setNumero(12);
        C2.setPeso(75f);
        C2.setStatus(Boolean.TRUE);
        C1.setDtcompra(Calendar.getInstance());
        C1.setObs("Feijão");

        // informações de Cliente
        listPessoa.add(C2);

        // -------------------------------------
        Aluno A1 = new Aluno();

        A1.setNome("Jéferson Wehrmann");
        A1.setCPF("1546.645.789-77");
        A1.setRG("5783752954");
        A1.setDtnsc(Calendar.getInstance());
        A1.setLogradouro("São Luis");
        A1.setNumero(2545);
        A1.setPeso(90f);
        A1.setStatus(Boolean.TRUE);
        A1.setCR(79.8f);
        A1.setMatricula("20222PF.CC0003");

        listPessoa.add(A1);

        Aluno A2 = new Aluno();

        A2.setNome("Pedro Pedroso");
        A2.setCPF("888.999.000-44");
        A2.setRG("65457455");
        A2.setDtnsc(Calendar.getInstance());
        A2.setLogradouro("JFK");
        A2.setNumero(548);
        A2.setPeso(45f);
        A2.setStatus(Boolean.TRUE);
        A2.setCR(58.4f);
        A2.setMatricula("20223PF.CC00067");

        listPessoa.add(A2);

        return listPessoa;
    }

    // EXERCÍCIO 2: criar um método que receba uma collection de Pessoa; imprimir os elementos na saída padrão e indicar a instância (se é Funcionario, Aluno ou Cliente)
    
    private void impressaoExercicio2(Collection<Pessoa> pessoas) {
        /*for (Pessoa P : pessoas) {
            if (P instanceof Funcionario) {
                System.out.println("\nFUNCIONÁRIO");
                System.out.println("CTPS: " + ((Funcionario) P).getCTPS());
                System.out.println("Data de admissão: " + ((Funcionario) P).getDtadmissao());

            } else if (P instanceof Cliente) {
                System.out.println("\nCLIENTE");
                System.out.println("Observação: " + ((Cliente) P).getObs());
                System.out.println("Data da compra: " + ((Cliente) P).getDtcompra());

            } else if (P instanceof Aluno) {
                System.out.println("\nALUNO");
                System.out.println("Matrícula: " + ((Aluno) P).getMatricula());
                System.out.println("Coeficiente de rendimento: " + ((Aluno) P).getCR());
            }

            if (P instanceof Pessoa) {
                System.out.println("Nome: " + P.getNome());
                System.out.println("RG: " + P.getRG());
                System.out.println("Logradouro: " + P.getLogradouro());
                System.out.println("Número: " + P.getNumero());
                System.out.println("Data de nascimento: " + P.getDtnsc());
                System.out.println("Peso: " + P.getPeso());
                System.out.println("Status: " + P.getStatus());
            }
        }*/
    }

    // EXERCÍCIO 3: criar métodos que gere um cliente , um produto, uma foto e um pedido (obter dados via JOptionPane)
    // criar um método que imprima um pedido (todas as informações)
    
    private Pedido exercicio3() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        Pessoa P = generatePessoa();
        Cliente C = generateCliente();
        Produto Pt = generateProduto();
        Foto F = generateFoto(Pt);
        Pedido PD = generatePedido(C,  Pt);
        
        return PD;
    }

    private Pessoa generatePessoa() {
        Pessoa P = new Pessoa();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        
        try { // setar atributo data da compra
            String dado = JOptionPane.showInputDialog(null, "Informe a data de nascimento:", "dd/MM/aaaa", JOptionPane.PLAIN_MESSAGE);
            // P.setDtnsct(dado); envia data para ser convertida no set
        
            Calendar dataC = Calendar.getInstance();

            try {
                Date dataD = formatador.parse(dado);
                dataC.setTime(dataD);

            } catch (Exception e) {
                System.out.println("Erro ao converter data!");
            }

            P.setDtnsc(dataC);

        } catch (NumberFormatException e) {
            System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
        }

        try { // setar atributo nome
            String dado = JOptionPane.showInputDialog(null, "Insira o nome:", "Digite", JOptionPane.PLAIN_MESSAGE);

            P.setNome(dado);
        } catch (NumberFormatException e) {
            System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
        }

        try { // setar atributo logradouro
            String dado = JOptionPane.showInputDialog(null, "Insira o logradouro:", "Digite", JOptionPane.PLAIN_MESSAGE);

            P.setLogradouro(dado);
        } catch (NumberFormatException e) {
            System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
        }
        
        try { // setar atributo número
            String dado = JOptionPane.showInputDialog(null, "Insira o número:", "Digite", JOptionPane.PLAIN_MESSAGE);

            P.setNumero(Integer.parseInt(dado));
        } catch (NumberFormatException e) {
            System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
        }
        
        try { // setar atributo peso
            String dado = JOptionPane.showInputDialog(null, "Insira o peso:", "Digite", JOptionPane.PLAIN_MESSAGE);

            P.setPeso(Float.parseFloat(dado));
        } catch (NumberFormatException e) {
            System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
        }
        
        try { // setar atributo status
            String dado = JOptionPane.showInputDialog(null, "Insira o status:", "0 para INATIVO ou 1 para ATIVO", JOptionPane.PLAIN_MESSAGE);
                
           P.setStatus(Boolean.parseBoolean(dado));
            
        System.out.println("Status: " + P.getStatus());
        } catch (NumberFormatException e) {
            System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
        }
        
        System.out.println("\nPESSOA");
        System.out.println("Nome: " + P.getNome());
        System.out.println("Logradouro e número: " + P.getNumero() + P.getNumero());
        System.out.println("Peso: " + P.getPeso());
        System.out.println("Data de nascimento: " + formatador.format(P.getDtnsc().getTime()));
        System.out.println("Status: " + P.getStatus());

        return P;
    }

    private Cliente generateCliente() {
        Cliente C = new Cliente();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        try { // setar atributo data da compra
            String dado = JOptionPane.showInputDialog(null, "Informe a data da compra:", "dd/MM/aaaa", JOptionPane.PLAIN_MESSAGE);

            Calendar dataC = Calendar.getInstance();

            try {
                Date dataD = formatador.parse(dado);
                dataC.setTime(dataD);

            } catch (Exception e) {
                System.out.println("Erro ao converter data!");
            }

            C.setDtcompra(dataC);

        } catch (NumberFormatException e) {
            System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
        }

        try { // setar atributo observação
            String dado = JOptionPane.showInputDialog(null, "Observação:", "Digite", JOptionPane.PLAIN_MESSAGE);

            C.setObs(dado);
        } catch (NumberFormatException e) {
            System.out.println("ERRO! " + e.getLocalizedMessage() + "Tente novamente!");
        }

        System.out.println("\nCLIENTE");
        System.out.println("Observação: " + C.getObs());
        System.out.println("Data da compra: " + formatador.format(C.getDtcompra().getTime()));

        return C;
    }

    private Produto generateProduto() {
        return null;
    }

    private Foto generateFoto(Produto produto) {
        Foto f = new Foto();
        
        f.setProduto(produto);
        
        return f;
    }

    private Pedido generatePedido(Cliente cliente, Produto produto) {
        Pedido p = new Pedido();
        p.setC(cliente);
        p.setProduto(produto);
        
        return p;
    }

    private void impressaoExercicio3(Pedido pedido) {
        System.out.println(pedido.getCodigo());
        System.out.println(pedido.getC().getCPF());
        
        for (Produto P : pedido.getProdutos())
        {
            System.out.println("Produto: " + P.getID());
                    
            for (Foto F : P.getFotos())
                System.out.println("Foto (código): " + F.getCodigo());
        }
    }

    // --------------------------------------------------------------------
    
    public Exercicio() {
        impressaoExercicio2(getPessoas());
        impressaoExercicio3(exercicio3());
    }

    public static void main(String[] args) {
        new Exercicio();
    }
}
