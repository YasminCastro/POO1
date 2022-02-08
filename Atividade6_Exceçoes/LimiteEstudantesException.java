package manipulacaoExcecoes;

public class LimiteEstudantesException extends RuntimeException{
    public LimiteEstudantesException(String nome){
        super("O limite de estudantes foi excedido na linha do aluno: " + nome);
    }
}
