/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1.pprog;

/**
 *
 * @author joaom
 */
import java.util.Scanner;
public class PL1PPROG {

    /**
     * @param args the command line arguments
     */
    private static Scanner ler=new Scanner(System.in);
    public static void saudacao(){
        System.out.println("Qual o nome da pessoa");
        String nome=ler.nextLine();
        System.out.println("Bem-vindo "+nome);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar o nome da pessoa
        System.out.println("Qual o nome da pessoa ?");
        String nome=ler.nextLine();
        //Solicitar a idade da pessoa
        System.out.println("Qual a idade da pessoa ?");
        int idade=ler.nextInt();
        ler.nextLine();
        //Criar objeto saudacao
        Pessoa p1=new Pessoa();
        //Implementar o nome
        p1.setNome(nome);
        //Implementar a idade
        p1.setIdade(idade);
        //Mostrar
        System.out.println(p1.toString());
        Pessoa p2=new Pessoa("Maria",idade);
        System.out.println(p2);
    }
    
}
