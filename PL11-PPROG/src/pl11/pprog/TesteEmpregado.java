/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl11.pprog;

import utilitarios.Data;
import utilitarios.Tempo;

/**
 *
 * @author joaom
 */
public class TesteEmpregado {
    public static void main(String[]args){
        //a)Crie e visualize uma instância de Data para representar a data atual
        
        Data d1=new Data();
        System.out.println(Data.dataAtual().toString());
        
        //b)Crie e visualize duas instâncias de Tempo
        
        Tempo t1=new Tempo(12,12,12);
        Tempo t2=Tempo.tempoAtual();
        System.out.println("b)Crie e visualize duas instâncias de Tempo ");
        System.out.println(t1);
        System.out.println(t2);
        
        //c)Crie duas instâncias de Empregado usando para o efeito as instâncias de Data e de Tempo criadas anteriormente

        Empregado e1=new Empregado("Jose","Marcolino",d1,t1,t2);
        Empregado e2=new Empregado("Jarcolino","das dores",d1,t1,t2);
        //Objetos iniciais sem valores alterados
        System.out.println("Objetos iniciais criados");
        System.out.println(e1+"\n\n");
        System.out.println(e2+"\n\n");
        
        
        //d)Teste se os atributos do tipo Data dos empregados criados possuem referências partilhadas;
        if(e1.getDataContrato()==e2.getDataContrato()){
            System.out.println("As referencias do tipo Data dos objetos Empregado sao partilhadas");
        }else{
            System.out.println("As referencias do tipo Data dos objetos Empregado não sao partilhadas");
        }
        
        //e) Teste se os atributos do tipo Tempo dos empregados criados possuem referências partilhadas;
        
        if(e1.getHoraEntrada()==e2.getHoraEntrada()||e1.getHoraSaida()==e2.getHoraSaida()){
            System.out.println("As referencias do tipo Tempo dos objetos Empregado sao partilhadas");
        }else{
            System.out.println("As referencias do tipo Tempo dos objetos Empregado não sao partilhadas");
        }
        
        //f) Altere o conteúdo do objeto Data e o conteúdo dos objetos Tempo inicialmente criados;  
        
        d1=new Data(5,5,5);
        t1=t1.tempoAtual();
        t2=new Tempo(5,5,5);
        
        
        //g) Visualize as instâncias de Data e de Tempo, bem como as instâncias de Empregado criadas
        
        System.out.println("Instancias Tempo e Data\n"+d1+"\n"+t1+"\n"+t2);
        System.out.println("Objetos Empregado\n"+e1+"\n"+e2);
        //Objetos e1 com data de entrada alterada
        System.out.println("Alterar data de contrato de um dos empregados");
        e1.setDataContrato(Data.dataAtual());
        System.out.println("Alterado\n\n"+e1);
        System.out.println("Inalterado\n\n"+e2);
        
        //h) Altere a data de contrato e as horas de entrada e de saída do segundo empregado
        
        e2.setDataContrato(Data.dataAtual());
        e2.setHoraEntrada(t2);
        
        //i) Armazene as instâncias de Empregado criadas num contentor de objetos do tipo array
        
        Object[] contentor=new Object[5];
        contentor[0]=e1;
        contentor[1]=e2;
        
        //j) Liste todos os empregados; 
        
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Empregado){
                System.out.println(contentor[i]);
            }
        }
        
        //Liste o nome, o número de horas de trabalho por semana e a antiguidade de cada um dos empregados.
        
        System.out.println("Empregado 1:\nNome:"+e1.getPrimeiroNome()+" "+e1.getUltimoNome()+"\nNumero de horas de trabalho por semana:"+e1.horasTrabalhoSemanal()+"\nAntiguidade:"+e1.tempoContratado());
        System.out.println("Empregado 1:\nNome:"+e2.getPrimeiroNome()+" "+e2.getUltimoNome()+"\nNumero de horas de trabalho por semana:"+e2.horasTrabalhoSemanal()+"\nAntiguidade:"+e2.tempoContratado());
    }
}
