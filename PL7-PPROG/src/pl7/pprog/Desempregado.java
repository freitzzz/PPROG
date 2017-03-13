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
public class Desempregado extends Contribuinte{
    private int mesesParagem;
    private static final int MESES_OMISSAO=0;
    private static float TAXA_OR=0.02f;
    
    public Desempregado(String nome,String morada,double outrosRendimentos,int mesesParagens){
        super(nome,morada,outrosRendimentos);
        this.mesesParagem=mesesParagens;
    }
    
    public Desempregado(){
        super();
        mesesParagem=MESES_OMISSAO;
    }
    
    public void setMesesParagem(int mesesParagem){
        this.mesesParagem=mesesParagem;
    }
    public void setTaxaOR(float taxaOR){
        TAXA_OR=taxaOR;
    }
    
    public int getMesesParagem(){
        return mesesParagem;
    }
    public float getTaxaOR(){
        return TAXA_OR;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nMeses de Paragem: "+mesesParagem+"\nTaxa Rendimentos: "+calcularImposto();
    }
    
    @Override
    public float calcularImposto(){
        return TAXA_OR*(float)super.getOutrosRendimentos();
    }
        
}
