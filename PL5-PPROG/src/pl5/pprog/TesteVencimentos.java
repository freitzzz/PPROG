package pl5.pprog;

import javax.management.Query;

/**
 * Classe reservada aos testes da SuperClasse do Objeto Trabalhador, e suas respetivas subclasses.
 * @author joaom
 */
public class TesteVencimentos {

    public static void main(String[] args) {
     //Inicialização dos objetos
     Object[] teste=new Object[3];
     TrabalhadorComissao t1=new TrabalhadorComissao("Marcoline",5,5,5);
     TrabalhadorHora t2=new TrabalhadorHora("Marcolino",5,5);
     TrabalhadorPeca t3=new TrabalhadorPeca("Marcolina",10,10);
     teste[0]=t1;
     teste[1]=t2;
     teste[2]=t3;

        //Testes set() e get()
        System.out.println("Testes métodos set() e get()\n");
        System.out.println("Resultado esperado: Nome: Marcolina");
        t1.setNome("Marcolina");
        System.out.println("Resultado obtido: Nome:"+t1.getNome());
     //Testes métodos to()
        System.out.println("\nTestes métodos to()\n");
        System.out.printf("Resultados esperados: Trabalhador à Hora: Marcolino %nNº de Horas de Trabalho: 5 "
                + " %nPagamento por Hora: 5,00 €%n");
        System.out.println("Resultados obtidos: "+t2.toString());
     //Testes métodos do objeto
        System.out.println("\nTestes métodos do objeto\n");
        System.out.println("Resultados esperados: Vencimento: 355.0€");
        System.out.println("Resultados obtidos: Vencimento :"+t3.calcularVencimento()+"€");
     //Testes métodos abstratos
        Trabalhador[] teste2=new Trabalhador[3];
        teste2[0]=t1;
        teste2[1]=t2;
        teste2[2]=t3;
        System.out.println("\nTestes métodos abstratos\n");
        System.out.println("Resultados esperados:\n5.25\n" +
"25.0\n" +
"355.0");
        System.out.println("Resultados obtidos:");
        for(int i=0;i<teste.length;i++){
            System.out.println(teste2[i].calcularVencimento());
        }
    //Exercicio 3
    TrabalhadorPeca tp=new TrabalhadorPeca("Jorge Silva",20,30);
    TrabalhadorComissao tc=new TrabalhadorComissao("Susana Ferreira",500,1500,6);
    TrabalhadorHora th=new TrabalhadorHora("Carlos Miguel",160,(float)3.5);
    Object[] contentor=new Object[10];
    contentor[0]=tp;
    contentor[1]=tc;
    contentor[2]=th;
    //6a
        System.out.println("\nListagem toString() dos Trabalhadores\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Trabalhador){
                System.out.println(contentor[i].toString()); 
            }
        }
    //6b
        System.out.println("\nListagem toString() dos Trabalhadores à Hora\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof TrabalhadorHora){
                System.out.println(contentor[i].toString());
            }
        }
    //6c
        System.out.println("\nListagem dos nomes do Trabalhadores e seu respetivo vencimento \n");
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Trabalhador){
                System.out.println(((Trabalhador)contentor[i]).getNome()+"\n"+((Trabalhador)contentor[i]).calcularVencimento());
            }
        }
    //7
    Trabalhador[] contentor2=new Trabalhador[10];
    contentor2[0]=tp;
    contentor2[1]=tc;
    contentor2[2]=th;
    //7a
        System.out.println("\nListagem toString() dos Trabalhadores\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor2[i] instanceof Trabalhador){
                System.out.println(contentor[i].toString()); 
            }
        }
    //7b
        System.out.println("\nListagem toString() dos Trabalhadores à Hora\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor2[i] instanceof TrabalhadorHora){
                System.out.println(contentor[i].toString());
            }
        }
    //7c
        System.out.println("\nListagem dos nomes do Trabalhadores e seu respetivo vencimento \n");
        for(int i=0;i<contentor.length;i++){
            if(contentor2[i] instanceof Trabalhador){
                System.out.println(((Trabalhador)contentor[i]).getNome()+"\n"+((Trabalhador)contentor[i]).calcularVencimento());
            }
        }
    }
}