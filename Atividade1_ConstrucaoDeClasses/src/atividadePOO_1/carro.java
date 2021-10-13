package atividadePOO_1;

public class carro {
	private double velocidade = 0.0;

	public void acelerar() {
		this.velocidade += 10;
	}

	public void freiar() {
		this.velocidade -= 10;
	}

	public void mostrarVelocidade() {
		System.out.println(velocidade);
	}
}
