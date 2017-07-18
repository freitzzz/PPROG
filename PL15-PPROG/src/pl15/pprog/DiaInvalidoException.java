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
public class DiaInvalidoException extends IllegalArgumentException{
    public DiaInvalidoException(String mensagem){
        super(mensagem);
    }
    public DiaInvalidoException(){
        super("Numero de dias incorreto!");
    }
}
