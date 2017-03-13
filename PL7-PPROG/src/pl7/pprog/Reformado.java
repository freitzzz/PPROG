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
public class Reformado extends RendimentoTrabalho{
    private static float RT=0.01f;
    private static float OR=0.03f;
    
    public Reformado(String nome,String morada,float outrosRendimentos,float rendimentos){
        super(nome,morada,outrosRendimentos,rendimentos);
    }
    public Reformado(){
        super();
    }
    
    public void setRT(float rt){
        RT=rt;
    }
    public void setOR(float or){
        OR=or;
    }
    
    public float getRT(){
        return RT;
    }
    public float getOR(){
        return OR;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nImposto: "+calcularImposto()+"€\nTaxa RT: "+RT+"%\nTaxa OR: "+"%";
    }
    @Override
    public float calcularImposto() {
        return super.getRendimentos()*RT+super.getRendimentos()*OR;
    }
    
}
