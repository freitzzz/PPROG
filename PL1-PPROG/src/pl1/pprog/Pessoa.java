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
public class Pessoa {
   private String nome;
   private int idade;
   public static final String NOME_INVALIDO="Não foi introduzido um nome.";
   public static final int IDADE_INVALIDO=0;
   public Pessoa(){
       nome=NOME_INVALIDO;
   }
   public Pessoa(String nome){
       this.nome=nome;
   }
   public Pessoa(String nome,int idade){
       this.nome=nome;
       this.idade=idade;
   }
   public String getNome(){
       return nome;
   }
   public int getIdade(){
       return idade;
   }
   public void setNome(String nome){
       this.nome=nome;
   }
   public void setIdade(int idade){
       this.idade=idade;
   }
   @Override
   public String toString(){
       return nome+" tem "+idade+" anos.";
   }
}
