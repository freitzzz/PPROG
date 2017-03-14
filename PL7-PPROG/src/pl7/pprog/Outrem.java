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
public class Outrem extends RendimentoTrabalho{
    private String nomeDaEmpresa;
    private static final String NOME_OMISSAO="";
    private static float LIMITE_INFERIOR_RT=0.01f;
    private static float LIMITE_SUPERIOR_RT=0.02f;
    private static float OR=0.02f;
    private static final float TAXA_RT=30000;
    public Outrem(String nome,String morada,float outrosRendimentos,float rendimentos,String nomeDaEmpresa){
        super(nome,morada,outrosRendimentos,rendimentos);
        this.nomeDaEmpresa=nomeDaEmpresa;
    }
    public Outrem(){
        super();
        nomeDaEmpresa=NOME_OMISSAO;
    }
    
    public void setNomeDaEmpresa(String nomeDaEmpresa){
        this.nomeDaEmpresa=nomeDaEmpresa;
    }
    public void setLimiteInferiorRT(float rt){
        LIMITE_INFERIOR_RT=rt;
    }
    public void setLimiteSuperiorRT(float rt){
        LIMITE_SUPERIOR_RT=rt;
    }
    public void setOR(float or){
        OR=or;
    }
    
    public String getNomeDaEmpresa(){
        return nomeDaEmpresa;
    }
    public float getLimiteInferiorRT(){
        return LIMITE_INFERIOR_RT;
    }
    public float getLimiteSuperiorRT(){
        return LIMITE_SUPERIOR_RT;
    }
    public float getOR(){
        return OR;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nNome da Empresa: "+nomeDaEmpresa+"\nImposto: "+calcularImposto()+"€\nTaxa RT: "+taxaRT()+"%\nTaxa OR: "+OR+"%";
    }
    @Override
    public float calcularImposto() {
        return super.getRendimentos()*taxaRT()+(float)super.getOutrosRendimentos()*OR;
    }
    
    public float taxaRT(){
        if(super.getRendimentos()>TAXA_RT){
            return LIMITE_SUPERIOR_RT;
        }else{
            return LIMITE_INFERIOR_RT;
        }
    }
}
