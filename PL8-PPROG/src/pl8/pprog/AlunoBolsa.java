    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl8.pprog;

/**
 *
 * @author joaom
 */
public class AlunoBolsa extends Aluno implements Pagavel{
    private float valorBolsa;
    private static final float VALOR_BOLSA_OMISSAO=0;

    public AlunoBolsa(float valorBolsa,String numero,String nome){
        super(numero,nome);
        this.valorBolsa=valorBolsa;
    }
    public AlunoBolsa(){
        super();
        valorBolsa=VALOR_BOLSA_OMISSAO;
    }

    public void setValorBolsa(float valorBolsa){
        this.valorBolsa=valorBolsa;
    }

    public float getValorBolsa(){
        return valorBolsa;
    }
    
    public boolean isBolseiro(){
        return valorBolsa!=0;
    }
    
    public String isBolseiroString(){
        if(isBolseiro()){
            return "Bolseiro";
        }else{
            return "Não Bolseiro";
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+"\n"+isBolseiroString()+"\nValor da Bolsa: "+valorBolsa+"€";
    }
    
    @Override
    public float calcularGasto() {
        return valorBolsa;
    }

}
