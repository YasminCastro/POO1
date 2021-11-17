
public class Livro {
	private String titulo;
	private int codigo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Livro(int codigo, String titulo ) {
        this.codigo = codigo;
        this.titulo = titulo;
    }
	
}
