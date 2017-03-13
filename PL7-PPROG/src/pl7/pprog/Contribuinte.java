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
public abstract class Contribuinte {
    private String nome;
    private String morada;
    private double outrosRendimentos;
    
    private static final String NOME_OMISSAO="";
    private static final String MORADA_OMISSAO="";
    private static final double OUTROS_RENDIMENTOS_OMISSAO=0;
    
    public Contribuinte(String nome,String morada,double outrosRendimentos){
        this.nome=nome;
        this.morada=morada;
        this.outrosRendimentos=outrosRendimentos;
    }
    
    public Contribuinte(){
        nome=NOME_OMISSAO;
        morada=MORADA_OMISSAO;
        outrosRendimentos=OUTROS_RENDIMENTOS_OMISSAO;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setMorada(String morada){
        this.morada=morada;
    }
    public void setOutrosRendimentos(double outrosRendimentos){
        this.outrosRendimentos=outrosRendimentos;
    }
    
    public String getNome(){
        return nome;
    }
    public String getMorada(){
        return morada;
    }
    public double getOutrosRendimentos(){
        return outrosRendimentos;
    }
    
    @Override
    public String toString(){
        return "Informação do contribuinte:\n"
                + "Nome: "+nome+"\n"
                + "Morada: "+morada+"\n"
                + "Rendimentos: "+outrosRendimentos;
    }
    
    public abstract float calcularImposto();
}
