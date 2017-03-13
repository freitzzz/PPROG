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
public class Proprio extends RendimentoTrabalho{
    private String profissao;
    private static final String PROFISSAO_OMISSAO="";
    private static float RT=0.03f;
    private static float LIMITE_INFERIOR_OR=0.02f;
    private static float LIMITE_SUPERIOR_OR=0.05f;
    private static final float TAXA_OR=50000f;
    public Proprio(String nome,String morada,float outrosRendimentos,float rendimentos,String profissao){
        super(nome,morada,outrosRendimentos,rendimentos);
        this.profissao=profissao;
    }
    public Proprio(){
        super();
        profissao=PROFISSAO_OMISSAO;
    }
    
    public void setProfissao(String profissao){
        this.profissao=profissao;
    }
    public void setRT(float rt){
        RT=rt;
    }
    public void setLimiteInferiorOR(float or){
        LIMITE_INFERIOR_OR=or;
    }
    public void setLimiteSuperiorOR(float or){
        LIMITE_SUPERIOR_OR=or;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nProfissão: "+profissao+"\nImposto: "+calcularImposto()+"€\nTaxa RT: "+RT+"%\nTaxa OR: "+taxaOR()+"%";
    }
    @Override
    public float calcularImposto() {
        return super.getRendimentos()*RT+super.getRendimentos()*taxaOR();
    }
    public float taxaOR(){
        if(super.getRendimentos()>TAXA_OR){
            return LIMITE_SUPERIOR_OR;
        }else{
            return LIMITE_INFERIOR_OR;
        }
    }
}
