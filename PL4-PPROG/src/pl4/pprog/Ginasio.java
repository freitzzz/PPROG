/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl4.pprog;

/**
 *
 * @author joaom
 */
/**
 * Classe respetiva ao objeto Ginasio
 */
public class Ginasio {
    //Variáveis de instancia
    
    /**
     * Nome do utente.
     */
    private String nome;
    /**
     * Sexo do utente.
     */
    private String sexo;
    /**
     * Idade do utente.
     */
    private int idade;
    /**
     * Altura do utente.
     */
    private int altura;
    /**
     * Peso do utente.
     */
    private double peso;
    
    //Constantes das variaveis de instancia
    
    private static final String NOME_NAO_DEFINIDO="N/D";
    private static final String SEXO_NAO_DEFINIDO="N/D";
    private static final int IDADE_NAO_DEFINIDO=0;
    private static final int ALTURA_NAO_DEFINIDO=0;
    private static final double PESO_NAO_DEFINIDO=0;
    
    //Variáveis dos métodos
    
    private static int magro=18;
    private static int obeso=25;
    
    /**
     * Construtor do objeto Ginasio que recebe como parametros a informação do utente.
     * @param nome Nome do utente.
     * @param sexo Sexo do utente.
     * @param idade Idade do utente.
     * @param altura Altura do utente.
     * @param peso Peso do utente.
     */
    
    //Construtores do objeto
    
    public Ginasio(String nome,String sexo,int idade,int altura,double peso){
        this.nome=nome;
        this.sexo=sexo;
        this.idade=idade;
        this.altura=altura;
        this.peso=peso;
    }
    /**
     * Construtor do objeto Ginasio sem parametros.
     */
    public Ginasio(){
        nome=NOME_NAO_DEFINIDO;
        sexo=SEXO_NAO_DEFINIDO;
        idade=IDADE_NAO_DEFINIDO;
        altura=ALTURA_NAO_DEFINIDO;
        peso=PESO_NAO_DEFINIDO;
    }
    /**
     * Método que retorna o nome do utente.
     * @return Nome do utente.
     */
    
    //Métodos get()
    
    public String getNome(){
        return nome;
    }
    /**
     * Método que retorna o sexo do utente.
     * @return Sexo do utente.
     */
    public String getSexo(){
        return sexo;
    }
    /**
     * Método que retorna a idade do utente.
     * @return Idade do utente.
     */
    public int getIdade(){
        return idade;
    }
    /**
     * Método que retorna a altura do utente.
     * @return Altura do utente.
     */
    public int getAltura(){
        return altura;
    }
    /**
     * Método que retorna o peso do utente.
     * @return Peso do utente.
     */
    public double getPeso(){
        return peso;
    }
    
    //Métodos set()
    
    /**
     * Método que declara um novo valor à variavel de instancia nome através de uma String recebida por parâmetro.
     * @param nome Nome do utente.
     */
    public void setNome(String nome){
        this.nome=nome;
    }
    /**
     * Método que declara um novo valor à variavel de instancia sexo através de uma String recebida por parâmetro.
     * @param sexo Sexo do Utente.
     */
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    /**
     * Método que declara um novo valor à variavel de instancia idade através de um int recebido por parâmetro.
     * @param idade Idade do utente.
     */
    public void setIdade(int idade){
        this.idade=idade;
    }
    /**
     * Método que declara um novo valor à variavel de instancia altura através de um int recebido por parâmetro.
     * @param altura Altura do utente.
     */
    public void setAltura(int altura){
        this.altura=altura;
    }
    /**
     * Método que declara um novo valor à variavel de instancia peso através de um double recebido por parâmetro.
     * @param peso Peso do utente.
     */
    public void setPeso(double peso){
        this.peso=peso;
    }
    /**
     * Método que declara um novo valor à variavel de referencia magro.
     * @param magro Novo valor de classificação de Magro.
     */
    public void setMagro(int magro){
        Ginasio.magro=magro;
    }
    /**
     * Método que declara um novo valor à variavel de referencia obeso.
     * @param obeso Novo valor de classificação de Obeso.
     */
    public void setObeso(int obeso){
        Ginasio.obeso=obeso;
    }
    //Métodos to()
    @Override
    public String toString(){
        return "Informação do utente:\n"
                + "Nome: "+nome+"\n"
                + "Sexo: "+sexo+"\n"
                + "Idade: "+idade+" anos\n"
                + "Altura: "+altura+" cm\n"
                + "Peso: "+peso+" kg";
    }
    /**
     * Método que converte a altura do utente de cm em metros.
     * @return Altura do utente em metros.
     */
    public double toMetros(){
        return (double)altura/100;
    }
    
    //Métodos is()
    
    /**
     * Método que determina se um utente é ou não classificado como Saudável.
     * @return Um booleano verdeiro/falso.
     */
    public boolean isSaudavel(){
        return grauObesidade().equals("Saudável");
    }
    /**
     * Método que determina se um utente é ou não classificado como Magro.
     * @return Um booleano verdeiro/falso.
     */
    public boolean isMagro(){
        return grauObesidade().equals("Magro");
    }
    /**
     * Método que determina se um utente é ou não classificado como Obeso.
     * @return Um booleano verdeiro/falso.
     */
    public boolean isObeso(){
        return grauObesidade().equals("Obeso");
    }
    
    //Métodos do objeto
    
    /**
     * Método que calcula o IMC (Indice de massa corporal do utente.
     * @return IMC do utente.
     */
    public double calculoIMC(){
        return peso/Math.pow(toMetros(),2);
    }
    /**
     * Método que determina qual o grau de obesidade no qual o utente pertence. Os termos de classificação são comparados com o IMC.
     * Tabela de classificação:
     * IMC &#60; 18 Magro
     * IMC[18,25] Saudável
     * IMC &#62; 25 Obeso
     * @return O grau de obesidade do utente.
     */
    public String grauObesidade(){
        if(calculoIMC()<magro){
            return "Magro";
        }else{
            if(calculoIMC()>obeso){
                return "Obeso";
            }else{
                return "Saudável";
            }
        }
    }
    /**
     * Método que calcula a diferenca das idades entre dois utentes.
     * @param utente Instancia de um objeto Ginasio
     * @return A diferença de idades entre dois utentes.
     */
    public int diferencaIdades(Ginasio utente){
        return Math.abs(idade-utente.idade);
    }
    /**
     * Método que calcula a diferenca das idades entre dois utentes.
     * @param idade Idade do utente.
     * @return A diferença de idades entre dois utentes.
     */
    public int diferencaIdades(int idade){
        return Math.abs(this.idade-idade);
    }
    /**
     * Método que indica qual entre dois utentes é o mais novo.
     * @param utente Instancia de um objeto Ginasio.
     * @return Qual dos utentes é o mais novo em formato String.
     */
    public String maisNovo(Ginasio utente){
        if(idade<utente.idade){
            return "O utente "+nome+" é mais novo que o utente: "+utente.nome;
        }else{
            if(idade>utente.idade){
                return "O utente "+utente.nome+" é mais novo que o utente: "+nome;
            }else{
                return "Ambos utentes tem a mesma idade.";
            }
        }
    }
    /**
     * Método que indica qual entre dois utentes é o mais novo.
     * @param idade Idade do utente.
     * @return Qual dos utentes é o mais novo em formato String.
     */
    public String maisNovo(int idade){
        if(this.idade<idade){
            return "O utente "+this.nome+" é mais novo que o utente: "+nome;
        }else{
            if(this.idade>idade){
                return "O utente "+nome+" é mais novo que o utente: "+this.nome;
            }else{
                return "Ambos utentes tem a mesma idade.";
            }
        }
    }
}
