/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author joaom
 */
public class DataInvalidaException extends IllegalArgumentException{
    public DataInvalidaException(String erro){
        super(erro+" é invalido!!");
    }
}
