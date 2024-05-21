package main.java.com.desafio_controle_fluxo;

class ParametrosInvalidosException extends Exception {
    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosException() {
        super("Os parâmetros são inválidos.");
    }
}