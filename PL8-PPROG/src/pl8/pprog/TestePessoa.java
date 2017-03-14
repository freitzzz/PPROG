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
public class TestePessoa {
    public static void main(String[] args){
        Object[] contentor=new Object[10];
        
        Pessoa p1=new Professor("Maria","Adjunto");
        Pessoa p2=new Professor("Manel","ND");
        Pessoa b1=new AlunoBolsa(500,"1234","Jorge");
        Pessoa b2=new AlunoBolsa(0,"1111","Marcolino");
        
        contentor[0]=p1;
        contentor[1]=p2;
        contentor[2]=b1;
        contentor[3]=b2;
        
        //Listar os nomes de professores e alunos acompanhados do nome da classe correspondente
        System.out.println("Listar os nomes de professores e alunos acompanhados do nome da classe correspondente\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Pessoa){
                System.out.println("Nome: "+((Pessoa)contentor[i]).getNome()+"\nClasse: "+((Pessoa)contentor[i]).getClass().getSimpleName()+"\n");
            }
        }
        
        //Listar o nome e a categoria de cada um dos professores
        System.out.println("Listar o nome e a categoria de cada um dos professores\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Professor){
                System.out.println("Nome: "+((Pessoa)contentor[i]).getNome()+"\nCategoria: "+((Professor)contentor[i]).getCategoria()+"\n");
            }
        }
        
        //Listar todos os alunos da escola
        System.out.println("\nListar todos os alunos da escola\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Aluno){
                System.out.println(((Aluno)contentor[i]).getNome());
            }
        }
        
        //Listar o número e o nome de cada um dos alunos que não recebem bolsa
        System.out.println("\nListar o número e o nome de cada um dos alunos que não recebem bolsa\n");
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Aluno){
                if(!((AlunoBolsa)contentor[i]).isBolseiro()){
                    System.out.println("Nome: "+((AlunoBolsa)contentor[i]).getNome()+"\n"+"Numero: "+((AlunoBolsa)contentor[i]).getNumero()+"\n");
                }
            }
        }
        //Mostrar o encargo mensal da escola com os vencimentos dos professores e as bolsas dos alunos.
        System.out.println("Mostrar o encargo mensal da escola com os vencimentos dos professores e as bolsas dos alunos.");
        float total=0;
        for(int i=0;i<contentor.length;i++){
            if(contentor[i] instanceof Pagavel){
                total=total+((Pessoa)contentor[i]).calcularGasto();
            }
        }
        System.out.println("Encargo Mensal: "+total+"€");
    }    
}
