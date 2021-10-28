
public class Webcam {
	
	private String marca;
	private String MP;
	
	public Webcam(String marca, String MP) {
		this.marca = marca;
		this.MP = MP;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMP() {
		return MP;
	}
	public void setMP(String mP) {
		MP = mP;
	}

	@Override
	public String toString() {
		
		return "Teclado [marca=" + marca + "MP=" + MP + "]";
	}
	
	
	
}
