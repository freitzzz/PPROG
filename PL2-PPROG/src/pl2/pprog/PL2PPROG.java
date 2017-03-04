/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2.pprog;

/**
 *
 * @author joaom
 */
public class PL2PPROG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // a) Permitir obter o estado de um objeto Data no formato "ano/mês/dia".
        System.out.println("a) Permitir obter o estado de um objeto Data no formato \"ano/mês/dia\".");
        Data d1=new Data(1997,07,22);
        System.out.println("Resultado Obtido: "+d1.toAnoMesDiaString());
        System.out.println("Resultado Esperado: 1997/07/22");
        // b) Determinar o dia da semana de uma data, tendo em conta que:
        System.out.println("b) Determinar o dia da semana de uma data, tendo em conta que:");
        Data d2=new Data(1,1,1);
        System.out.println("Resultado Obtido: "+d2.diaDaSemana());
        System.out.println("Resultado Esperado: Segunda-Feira");
        // c) Permitir obter o estado de um objeto Data por extenso. Exemplo: "terça-feira, 23 de fevereiro de 2016".
        Data d3=new Data(23,2,2016);
        System.out.println("Resultado Obtido: "+d3.toString());
        System.out.println("Resultado Esperado: Terça-feira, 2016 de Fevereiro de 23");
        // d) Verificar se uma data é maior (mais recente) do que outra.
        Data d4=new Data(2017,2,23);
        Data d5=new Data(2016,8,7);
        if(d4.isMaior(d5)==false){
            System.out.println("Resultado Obtido: "+d4+" é menor que "+d5);
        }else{
            System.out.println("Resultado Obtido: "+d4+" é maior que "+d5);
        }
        System.out.println("Resultado Esperado: "+d4+ " é menor que "+d5);
        //2
        //a) Crie uma instância da classe Data com o nome data1 e que represente a data de hoje
        Data data1=new Data(2017,02,21);
        //b) Mostre data1 usando o formato por extenso.
        System.out.println(d1.toString());
        //c) Crie uma outra instância da classe Data chamada data2 que guarde a data 25 de abril de 1974. 
        Data data2=new Data(1974,04,25);
        //d) Mostre data2 no formato "ano/mês/dia".  
        System.out.println(data2.toAnoMesDiaString());
        //e) Utilize o método de instância isMaior para confirmar que, de facto, data1 é mais recente do que data2.
        if(data1.isMaior(data2)){
            System.out.println(data1+" é maior que "+data2);
        }else{
            System.out.println(data1+" é menor que "+data2);
        }
        //f) Determine o número de dias entre data1 e data2.
        System.out.println("A diferença de dias é"+data1.diferenca(data2));
        //g) Determine o número de dias que faltam para o Natal, usando o método que recebe, por parâmetro, o dia, o mês e o ano de uma data.
        System.out.println("Faltam "+data1.diferenca(2017,12,25)+" dias para o Natal!");
        //h) Determine o dia da semana em que ocorreu o dia 25 de abril de 1974.
        System.out.println("O 25 de Abril de 1974 foi a"+data2.diaDaSemana());
        //i) Verifique se o ano 1974 foi bissexto, invocando o método de classe isAnoBissexto:
        if(data2.isAnoBissexto(data2.getAno())){
            System.out.println("O ano de 1974 foi bissexto");
        }else{
            System.out.println("O ano de 1974 nao foi bissexto");
        }
        if(Data.isAnoBissexto(data2.getAno())){
            System.out.println("O ano de 1974 foi bissexto");
        }else{
            System.out.println("O ano de 1974 nao foi bissexto");
        }
        
    }
    
    
}
