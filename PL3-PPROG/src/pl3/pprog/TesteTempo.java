/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl3.pprog;

/**
 *
 * @author joaom
 */
public class TesteTempo {
    public static void main(String[] args){
    //1)
    //a) Obter o estado de uma instância Tempo no formato: hh/mm/ss e hh/mm/ss AM/PM
    Tempo t4=new Tempo(10,10,10);
        System.out.println(t4.toString());
        System.out.println(t4.toMostrar());
    //b) Acrescentar 1 segundo a um dado tempo. 
    t4.tick();
        System.out.println(t4.toString());
    //c) Verificar se um dado tempo é maior do que outro. Este tempo deve poder ser representado por uma instância de Tempo ou pelos valores simples das horas, minutos e segundos.
    Tempo t3=new Tempo(12,12,12);
        System.out.println(t3.toCompararString(11,13,12));
        System.out.println(t4.toComparar(t3));
    //d) Determinar a diferença entre dois tempos fornecidos: Segundos e Tempo
        System.out.println(t3.diferencaTempos(t3));
    //2)
    //a) Crie uma instância da classe Tempo com o nome t1 e que represente o tempo: 5 horas, 30 minutos e 12 segundos.
    Tempo t1=new Tempo(5,30,12);
    //b) Mostre o tempo t1 usando o formato "hh:mm:ss AM (ou PM)". 
        System.out.println(t1.toMostrar());
    //c) Acrescente 1 segundo ao tempo t1
    t1.tick();
    //d) Mostre novamente t1 usando o formato "hh:mm:ss AM (ou PM)".
        System.out.println(t1.toMostrar());
    //e) Crie uma outra instância da classe Tempo chamada t2 que guarde o tempo: 18 horas, 5 minutos e 20 segundos.
    Tempo t2=new Tempo(18,5,20);
    //f) Mostre o tempo t2 usando o formato "hh:mm:ss AM (ou PM)".
        System.out.println(t2.toMostrar());
    //g) Verifique se o tempo t1 é maior do que o tempo t2
        System.out.println(t1.toComparar(t2));
    //h) Verifique se o tempo t1 é maior do que o tempo 23 horas, 7 minutos e 4 segundos usando o método que recebe por parâmetro as horas, os minutos e os segundos de um tempo.
        System.out.println(t1.toCompararString(23,7,4));
    //i) Determinar a diferença entre o tempo t1 e o tempo t2: Em segundos e Tempo
        System.out.println("Em segundos: "+t1.diferencaTempos(t2));
        
    }
}
