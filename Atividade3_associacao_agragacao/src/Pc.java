
public class Pc {
	
	private String dono;
	private Teclado teclado;
	private Webcam webcam;
	
	public Pc(String dono, Teclado teclado, Webcam webcam) {
		
		if(teclado == null) {
			throw new NullPointerException("A referência do teclado não pode ser nula");
		}
		
		this.dono = dono;
		this.teclado = teclado;
		this.webcam = webcam;
	}
	
	public boolean trocaTeclado(Teclado teclado) {
		boolean sucesso = false;
		
		if(teclado != null) {
			this.teclado = teclado;
			sucesso = true;
		}
		
		return sucesso;
	}
	
	
	public boolean addWebcam(Webcam webcam) {
		
		boolean sucesso = false;
		
		if(this.webcam ==null) {
			this.webcam = webcam;
			sucesso = true;
		}
		return sucesso;
	}

	public boolean removeWebcam() {
		boolean sucesso = false;
		if(this.webcam != null) {
			this.webcam = null;
			sucesso = true;
		}
		
		return sucesso;
	}
	
	
	
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Webcam getWebcam() {
		return webcam;
	}

	public void setWebcam(Webcam webcam) {
		this.webcam = webcam;
	}

	@Override
	public String toString() {
		return "Pc [dono=" + dono + ", teclado=" + teclado + ", webcam=" + "]";
	}
	
	

}
