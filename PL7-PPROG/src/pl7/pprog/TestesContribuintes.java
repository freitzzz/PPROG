/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7.pprog;

/**
 *
 * @author joaom
 */
public class TestesContribuintes {
    public static void main(String[] args){
        //a) Criar dois objetos de cada classe instanciável.
        
        //Sub-Classe Desempregado
        Contribuinte d1=new Desempregado("Jacolina","Rua das Cavadas",50000,6);
        Contribuinte d2=new Desempregado("Jacolino","Vizinho da Jacolina",3000,6);
        //Sub-Classe Reformado
        Contribuinte r1=new Reformado("Antonio","Praceta DºAntonio",2000,2000);
        Contribuinte r2=new Reformado();
        //Sub-Classe Outrem
        Contribuinte o1=new Outrem("Xano","Ermesinde",9999,9999,"Traficante de Gomas");
        Contribuinte o2=new Outrem("Xana","Zinde City",100000,100000,"Só trabalho no Verão e é para o bronze");
        //Sub-Classe Proprio
        Contribuinte p1=new Proprio("Ficticio","Ficticia",10000,100,"Conta Propria");
        Contribuinte p2=new Proprio("Rocha","ISEP",30000,30000,"PRAXE");
        //Sub-Classe Reformado
        
        //b) Criar e preencher um contentor do tipo array com comprimento superior ao número de objetos criados.
        
        Object[] contentor=new Object[10];
        contentor[0]=d1;
        contentor[1]=d2;
        contentor[2]=r1;
        contentor[3]=r2;
        contentor[4]=o1;
        contentor[5]=o2;
        contentor[6]=p1;
        contentor[7]=p2;
        
        //c) Varrimento do contentor para apresentação de cada objeto e respetivo valor do imposto extraordinário.
        System.out.println("\n\nc) Varrimento do contentor para apresentação de cada objeto e respetivo valor do imposto extraordinário\n\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Contribuinte){
                System.out.println(contentor[i].toString()+"\n");
            }
        }
        
        //d) Varrimento do contentor para apresentação do nome e imposto extraordinário a pagar pelos contribuintes desempregados.
        System.out.println("\n\nd) Varrimento do contentor para apresentação do nome e imposto extraordinário a pagar pelos contribuintes desempregados.\n\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Desempregado){
                System.out.println(contentor[i].toString()+"\n");
            }
        }
    }
}
