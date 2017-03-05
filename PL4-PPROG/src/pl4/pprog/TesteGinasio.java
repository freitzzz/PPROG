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
public class TesteGinasio {
    public static void main(String[] args){
    //Inicalização dos construtores de teste.
    Ginasio g1=new Ginasio();
    Ginasio g2=new Ginasio("Joao","M",19,177,70);
    //Teste métodos get()
        System.out.println("Testes metodos get()\n");
    //Para a instancia de objeto g1, os resultados deverão ser N/D e 0
        //Teste get() g1
        System.out.println("Instancia de objeto g1");
        System.out.println(g1.getNome()+"\n"+g1.getSexo()+"\n"+g1.getIdade()+"\n"+g1.getAltura()+"\n"+g1.getPeso());
        //Teste get() g2
        System.out.println("Instancia de objeto g2");
        System.out.println(g2.getNome()+"\n"+g2.getSexo()+"\n"+g2.getIdade()+"\n"+g2.getAltura()+"\n"+g2.getPeso());
    //Teste metodos set()
        System.out.println("\nTestes Metodos set()\n");
        g1.setNome("Teste");
        g1.setAltura(50);
        System.out.println("Resultados Esperados:\nNome:Teste\nAltura:50\nResultados Obtidos:");
        System.out.println("Nome:"+g1.getNome()+"\nAltura:"+g1.getAltura());
    //Teste metodos to()
        System.out.println("\nTestes metodos to()\n");
        System.out.println("Método toString()");
        System.out.println(g2.toString());
        System.out.println("\nTeste Método toMetros()");
        System.out.println(g2.toMetros()+"m");
    //Teste metodos is()
        System.out.println("\nTestes metodos is()\n");
        System.out.println("IMC de "+g2.getNome()+": "+g2.calculoIMC());
        System.out.println("Resultado esperado do méotodo isSaudavel(): true");
        System.out.println("Resultado obtido:"+g2.isSaudavel());
    //Teste metodos do objeto
        System.out.println("\nTestes metodos do objeto:\n");
        System.out.println("\nTeste metodo calculoIMC()\nResultado esperado: Numero real positivo\nResultado obtido:");
        System.out.println(g2.calculoIMC());
        System.out.println("\nTeste método grauObesidade()\nResultado esperado: Saudável\nResultado obtido:");
        System.out.println(g2.grauObesidade());
        System.out.println("\nTeste método diferencaIdades()\nResultado esperado: 19\nResultado obtido:");
        System.out.println(g2.diferencaIdades(g1));
        System.out.println("\nTeste metodo maisNovo()");
        System.out.println(g2.maisNovo(g1));
    }
}
