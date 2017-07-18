/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl12.pprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe reservada aos testes dos objetos Exposicao e Quadro.
 * @author joaom
 */
public class Teste {
    private static void listar(List contentor){
        for(int i=0;i<contentor.size();i++){
            System.out.println(contentor.get(i)+"\n");
        }
    }
    
    public static void main(String[] args){
        //5a) Crie diversas instâncias de Quadro
        Quadro q1=new Quadro("Arte Moderna","Gali",2000);
        Quadro q2=new Quadro("Arte Rupestre","Dali",1582);
        Quadro q3=new Quadro("Arte Gotica","Fali",2007);
        Quadro q4=new Quadro("Arte Abstrata","Hali",111);
        Quadro q5=new Quadro();
        //5b) Armazene essas instâncias num contentor do tipo ArrayList
        List<Quadro> quadros=new ArrayList();
        quadros.add(q1);
        quadros.add(q2);
        quadros.add(q3);
        quadros.add(q4);
        quadros.add(q5);
        //5c) Visualize os objetos do contentor utilizando o método listar
        listar(quadros);
        
        //7a) Crie diversas instâncias de Exposicao, usando as instâncias de Quadro criadas anteriormente. Algumas destas instâncias devem ser partilhadas por todas as exposições criadas.
        Exposicao e1=new Exposicao("#1",3000,q1,true);
            e1.addQuadro(q2,false);
            e1.addQuadro(q3,false);
            e1.addQuadro(q4,false);
            e1.addQuadro(q5,false);
        Exposicao e2=new Exposicao("#2",2142,q1,true);
            e2.addQuadro(q2,true);
            e2.addQuadro(q3,false);
            e2.addQuadro(q4,false);
            e2.addQuadro(q5,false);
        Exposicao e3=new Exposicao("#3",400,q1,true);
            e3.addQuadro(q2,true);
            e3.addQuadro(q3,true);
            e3.addQuadro(q4,false);
            e3.addQuadro(q5,false);
        Exposicao e4=new Exposicao("#4",9999,q1,true);
            e4.addQuadro(q2,true);
            e4.addQuadro(q3,true);
            e4.addQuadro(q4,true);
            e4.addQuadro(q5,false);
        Exposicao e5=new Exposicao("#5",12312,q1,true);
            e5.addQuadro(q2,true);
            e5.addQuadro(q3,true);
            e5.addQuadro(q4,true);
            e5.addQuadro(q5,true);
        //7b) Armazene estas instâncias num contentor do tipo ArrayList
        List<Exposicao> exposicoes=new ArrayList<>();
        exposicoes.add(e1);
        exposicoes.add(e2);
        exposicoes.add(e3);
        exposicoes.add(e4);
        exposicoes.add(e5);
        //7c) Visualize os objetos deste contentor reutilizando o método listar
        listar(exposicoes);
        //8) Modifique o conteúdo de uma das instâncias de Quadro partilhada por todas as exposições. Para confirmar estas modificações, visualize novamente os objetos do contentor de exposições.
        System.out.println("NOVA LISTAGEM");
        q1.setAutor("MONA LISA");
        listar(exposicoes);
        q5.setAutor("SO NO N/D");
        listar(exposicoes);
        //9)Programe uma listagem do contentor de exposições por ordem decrescente do ano da exposição.
        System.out.println("LISTAGEM DAS EXPOSICOES POR ORDEM DECRESCENTE");
        Collections.sort(exposicoes);
        Collections.reverse(exposicoes);
        listar(exposicoes);
        //10) Teste o método da classe Exposicao para remover um quadro.
        e1.removeQuadro(q1);
        listar(exposicoes);
    }
    
}
