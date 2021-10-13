package atividadePOO_1;

public class elevador {
	private int andar;
	private int totalAndares;
	private int capacidade;
	private int ocupacao;

	public void Elevador(int totalAndares, int capacidade) {
		this.andar = 0;
		this.ocupacao = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}

	public void entra() {
		if (this.ocupacao != this.capacidade) {
			this.ocupacao += 1;
		}
	}

	public void sai() {
		if (this.ocupacao != 0) {
			this.ocupacao -= 1;
		}
	}

	public void sobe() {
		if (this.andar != this.totalAndares) {
			this.andar += 1;
		}
	}

	public void desce() {
		if (this.andar != 0) {
			this.andar -= 1;
		}
	}

	public int getAndar() {
		return andar;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getOcupacaoAtual() {
		return ocupacao;
	}

	public int getCapacidade() {
		return capacidade;
	}
}
