package model;

public class MesInvalidoException extends IllegalArgumentException {

    public MesInvalidoException() {
        super("Mês é inválido!!");
    }
    
    public MesInvalidoException(String mensagem) {
        super(mensagem);
    }

}
