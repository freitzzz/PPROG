package model;

public class DiaInvalidoException extends IllegalArgumentException {

    public DiaInvalidoException() {
        super("Dia é inválido!!");
    }
    
    public DiaInvalidoException(String mensagem) {
        super(mensagem);
    }

}
