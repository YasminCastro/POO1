package atividadePOO_1;

public class relogio {
	private int hora = 6;

	public void adicionarHora() {
		if (this.hora == 23) {
			this.hora = 0;
		} else {
			this.hora += 1;
		}
	}

	public void subtrairHora() {
		if (this.hora == 0) {
			this.hora = 23;
		} else {
			this.hora -= 1;
		}
	}

	public void mostrarHora() {
		System.out.println(hora);
	}
}
