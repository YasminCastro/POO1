package atividadePOO_1;

public class telefone {

	private int numMinutos = 0;
	private double preco = 2.0;

	public void duracaoLigacao(int a) {
		this.numMinutos = a;
	}

	public void alterarPreco(double p) {
		this.preco = p;
	}

	public void mostrarConta() {
		System.out.println(this.numMinutos * this.preco);
	}
}
