package br.edu.ifsul.bcc.too.anotacoes;

import java.text.SimpleDateFormat; // biblioteca para formatação de datas
import java.util.Calendar; // biblioteca Calendar
import java.util.Date; // biblioteca Date

/**
 *
 * @author 20222PF.CC0003
 */
public class Aula1109 {

    // atributos da instância
    private Calendar dataCalendar; // variável tipo Calendar
    private Date dataDate; // variável tipo Date
    private SimpleDateFormat formatador; // variável tipo SimpleDateFormat que extrai informações das vaiáveis anteriores

    // classes concretas: é usado o new para inicializar 
    // classes abstratas: não é possível usar o new para inicializar
    public Aula1109() throws ParseException // construtor
    {
        System.out.println("\nTestes com datas~\n");

        // utilizando Calendar ---------------------------------------------------------------------------------------------------------------------------
        
        dataCalendar = Calendar.getInstance(); // inicialização de uma variável Calendar, pega a data atual do sistema operacional

        System.out.println("CALENDAR");
        System.out.println("Data antes: " + dataCalendar); // impressão da data antes de formatar

        // dataCalendar.set(Calendar.DAY_OF_MONTH, 1); // altera o dia para 1
        // dataCalendar.set(Calendar.MONTH, 3); // altera o mês para 3 (equivalente a abril, pois a contagem começa em 0)
        // dataCalendar.set(Calendar.YEAR, 2002); // altera o ano para 2002
        
        dataCalendar.set(Calendar.DAY_OF_MONTH, 12);
        dataCalendar.set(Calendar.MONTH, 1);
        dataCalendar.set(Calendar.YEAR, 1983);

        formatador = new SimpleDateFormat("dd/MM/yyyy"); // definição do formato da data (mês: MM, minutos: mm)
        String dataFormatada = formatador.format(dataCalendar.getTime()); // formatação da data; getTime retorna um valor Date para a variável Calendar

        System.out.println("Data depois: " + dataFormatada); // impressão da data
        System.out.println("Data em milissegundos: " + dataCalendar.getTimeInMillis() + "\n"); // impressão da data em milissegundos

        // utilizando Date -------------------------------------------------------------------------------------------------------------------------------
        
        dataDate = new Date(); // inicialização do atributo

        System.out.println("DATE");
        System.out.println("Data antes: " + dataDate); // impressão da data antes da formatação

        dataFormatada = formatador.format(dataDate); // formatação da data; sem getTime porque já é tipo Date

        System.out.println("Data depois: " + dataFormatada); // impressão da data depois da formatação
        System.out.println("Data em milissegundos: " + dataDate.getTime() + "\n"); // impressão da data em milissegundos

        // Exercício 1: imprimir a diferença em milissegundos e em dias entre dataDate e dataCalendar
        long miliCalendar = dataCalendar.getTimeInMillis();
        long miliDate = dataDate.getTime();

        System.out.println("– Diferença em milissegundos: " + (miliDate - miliCalendar));

        miliCalendar = ((((miliCalendar / 1000) / 60) / 60) / 24); // conversão milissegundos > segundos > minutos > horas > dias (podendo usar 86400000);
        miliDate = ((((miliDate / 1000) / 60) / 60) / 24); // conversão milissegundos > segundos > minutos > horas > dias (podendo usar 8640000);

        System.out.println("– Diferença em dias: " + (miliDate - miliCalendar) + "\n");

        // Exercício 2: utilizar o mét6odo compareTo da classe Calendar para testar duas datas e explicar os retornos -1, 0 e 1
        
        System.out.println("Data maior (retorno 1): " + dataDate.compareTo(dataCalendar.getTime()));
        System.out.println("Data igual (retorno 0): " + dataDate.compareTo(dataDate)); 
        
        Date newDate = dataCalendar.getTime(); // converte Calendar para Date
        System.out.println("Data menor (retorno -1): " + newDate.compareTo(dataDate)); 
        
        // Exercício 3: converter string "25/09/1983" para Calendar
        
        String data = "25/09/1983";
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(formatador.parse(data));
        
        System.out.println("Data convertida (Calendar): " + cal); 
        
        // Exercício 4: converter string "25/09/1983" para Date
    }

    public static void main(String[] args) {
        new Aula1109(); // criação da instância
    }
}
