package manipulacaoExcecoes;

public class LimiteOrientadorException extends RuntimeException{
    public LimiteOrientadorException(String nomeOrientador, String nomeEstudante) {
        super("O orientador " + nomeOrientador + " excedeu o limite de estudantes quando foi adicionar o " + nomeEstudante);
    }
}
