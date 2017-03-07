/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6.pprog;

/**
 *
 * @author joaom
 */
public class TesteContador {
    public static void main(String[] args){
    //a)
    Object[] teste=new Object[10];
    Gas g1=new Gas("Joaquim",100);
    TarifarioSimples t1=new TarifarioSimples("Alberto",100,20);
    TarifarioBi t2=new TarifarioBi("Rogerio",100,20,2000,3000);
    teste[0]=g1;
    teste[1]=t1;
    teste[2]=t2;
    //b
        for(int i=0;i<teste.length;i++){
            if(teste[i] instanceof Contador){
                System.out.println(teste[i].toString()+"\n");
            }
        }
    //c)
    int contadorC=0;
        for(int i=0;i<teste.length;i++){
            if(teste[i] instanceof Eletricidade){
                contadorC++;
            }
        }
        System.out.println("Numero de contentor de Eletricidade criados: "+contadorC);
    //d)
        for(int i=0;i<teste.length;i++){
            if(teste[i] instanceof TarifarioBi){
                System.out.println("Nome do contador com Tarifario BiHorario: "+((Contador)teste[i]).getID()+"\n");
            }
        }
    //e)
        for(int i=0;i<teste.length;i++){
            if(teste[i] instanceof Contador){
                System.out.println("Contador: "+((Contador)teste[i]).getID()+"\n"+"Custo do consumo: "+((Contador)teste[i]).calculoCustoConsumo()+"€\n");
            }
        }
    //f)
        int maiorConsumoGas=0;
        for(int i=0;i<teste.length;i++){
            if(teste[i] instanceof Gas){
                maiorConsumoGas=((Contador)teste[i]).getConsumo();
                for(int j=i;j<teste.length;j++){
                    if(((Contador)teste[i]).getConsumo()>maiorConsumoGas){
                        maiorConsumoGas=((Contador)teste[i]).getConsumo();
                    }
                }
            }
        }
        System.out.println("Maior consumo de Gás: "+maiorConsumoGas+"\n");
    //g)
        String[] nomes=new String[3];
        nomes[0]=((Contador)teste[0]).getNome();
        nomes[1]=((Contador)teste[1]).getNome();
        nomes[2]=((Contador)teste[2]).getNome();
        int contadorG=0;
        for(int i=0;i<teste.length;i++){
            for(int j=0;j<nomes.length;j++){
                if(teste[i] instanceof Contador){
                    if(((Contador)teste[i]).getNome().equals(nomes[j])==false){
                        contadorG++;
                    
                    }
                }
            }
        }
        String[] nomes2=new String[contadorG];
        contadorG=0;
        for(int i=0;i<teste.length;i++){
            for(int j=0;j<nomes.length;j++){
                if(teste[i] instanceof Contador){
                    if(((Contador)teste[i]).getNome().equals(nomes[j])==false){
                        nomes[contadorG]=((Contador)teste[i]).getNome();
                    
                    }
                }
            }
        }
        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
}
