/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl15.pprog;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author joaom
 */
public class PL15PPROG {

    /**
     * @param args the command line arguments
     */
    private static final Scanner READ = new Scanner(System.in);

    private static boolean lerData(Data data) {
        try {
            System.out.println("Digite uma data no formato aa/mm/dd");
            String dataInserida[] = READ.nextLine().split("/");
            int ano = Integer.parseInt(dataInserida[0]);
            int mes = Integer.parseInt(dataInserida[1]);
            int dia = Integer.parseInt(dataInserida[2]);
            data.setData(ano, mes, dia);
            return false;
        } catch (NumberFormatException e) {
            System.out.println("Apenas digitos numérios!");
        } catch (MesInvalidoException e) {
            System.out.println("Formato do mês invalido!");
        } catch (DiaInvalidoException e) {
            System.out.println("Formato do dia invalido!");
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        boolean nomeFicheiroInvalido;
        do {
            Formatter escreverFicheiro;

            System.out.println("\nNome do Ficheiro: ");

            try {
                nomeFicheiroInvalido = false;
                escreverFicheiro = new Formatter(READ.nextLine());
                System.out.println("Ficheiro Criado");
                try {
                    System.out.println("\nNome/\"ENTER para terminar\"): ");
                    String nome = READ.nextLine();
                    while (!nome.trim().isEmpty()) {
                        Data d = new Data();
                        lerData(d);
                        escreverFicheiro.format("%s; %s %n", nome, d);
                        System.out.println("\nNome/\"ENTER para terminar\"): ");
                        nome = READ.nextLine();
                    }
                } finally {
                    escreverFicheiro.close();
                }
            } catch (Exception e) {
                System.out.println("\n" + e.getMessage());
            }
        } catch (FileNotFoundException e) {
                System.out.println("\nImpossivel de criar o ficheiro!!\n" + e.getMessage());
                System.out.println("\nDigite novamente o nome do ficheiro: ");
                nomeFicheiroInvalido = true;
        }
        while (nomeFicheiroInvalido);
    }
}
