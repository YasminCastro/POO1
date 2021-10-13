package atividadePOO_1;

public class time {
	private int pontosGanhos = 0;

	public void ganharPartida() {
		this.pontosGanhos += 3;
	}

	public void empatarPartida() {
		this.pontosGanhos -= 1;
	}

	public void perderPartida() {
		this.pontosGanhos += 0;
	}

	public void mostrarPontos() {
		System.out.println(pontosGanhos);
	}
}
