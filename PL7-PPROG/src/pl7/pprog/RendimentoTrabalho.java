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
public abstract class RendimentoTrabalho extends Contribuinte{
    private float rendimentos;
    private static final float RENDIMENTOS_OMISSAO=0;
    public RendimentoTrabalho(String nome,String morada,float outrosRendimentos,float rendimentos){
        super(nome,morada,outrosRendimentos);
        this.rendimentos=rendimentos;
    }
    public RendimentoTrabalho(){
        super();
        rendimentos=RENDIMENTOS_OMISSAO;
    }
    
    public void setRendimentos(float rendimentos){
        this.rendimentos=rendimentos;
    }
    
    public float getRendimentos(){
        return rendimentos;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nRendimentos de Trabalho: "+rendimentos;
    }
    @Override
    public abstract float calcularImposto();
    
}
