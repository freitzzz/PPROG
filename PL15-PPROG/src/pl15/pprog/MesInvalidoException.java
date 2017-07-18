/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl15.pprog;

/**
 *
 * @author joaom
 */
public class MesInvalidoException extends IllegalArgumentException{
    public MesInvalidoException(){
        super("Número de mês invalido!");
    }
    public MesInvalidoException(String mensagem){
        super(mensagem);
    }
}
