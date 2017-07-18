/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl12.pprog;

/**
 * Classe que representa um quadro de uma exposição.
 * @author joaom
 */
public class Quadro implements Comparable<Quadro>{
    //Atributos
    private String designacao;
    private String autor;
    private int anoCriacao;
    
    //Constantes
    private static final String DESIGNACAO_OMISSAO="N/D";
    private static final String AUTOR_OMISSAO="N/D";
    private static final int ANO_CRIACAO_OMISSAO=0;
    
    //Construtores
    
    public Quadro(String designacao,String autor,int anoRealizacao){
        this.designacao=designacao;
        this.autor=autor;
        this.anoCriacao=anoRealizacao;
    }
    public Quadro(){
        designacao=DESIGNACAO_OMISSAO;
        autor=AUTOR_OMISSAO;
        anoCriacao=ANO_CRIACAO_OMISSAO;
    }
    public Quadro(Quadro quadro){
        designacao=quadro.designacao;
        autor=quadro.autor;
        anoCriacao=quadro.anoCriacao;
    }
    //Métodos set()
    
    public void setDesignacao(String designacao){
        this.designacao=designacao;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setAnoCriacao(int anoCriacao){
        this.anoCriacao=anoCriacao;
    }
    
    //Métodos get()
    
    public String getDesignacao(){
        return designacao;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoCriacao(){
        return anoCriacao;
    }
    
    //Métodos internos
    
    @Override
    public String toString(){
        return "Quadro "+designacao
                + "\nAutor: "+autor
                + "\nAno Criação: "+anoCriacao;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null||this.getClass()!=obj.getClass()){
            return false;
        }
        Quadro obj2=(Quadro) obj;
        if(obj2.designacao.equalsIgnoreCase(designacao)&&obj2.autor.equalsIgnoreCase(autor)&&obj2.anoCriacao==anoCriacao){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public int compareTo(Quadro quadro){
        return -quadro.autor.compareTo(autor);
    }
}
