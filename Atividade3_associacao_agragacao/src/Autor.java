import java.util.ArrayList;
import java.util.List;

public class Autor {
	private String nome;
	private List<Livro> listaLivro = new ArrayList<Livro>();
	
	
	public Autor (String nome, Livro livro) {
		
		this.nome = nome;		
		this.listaLivro.add(livro);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Livro> getListaLivro() {
		return listaLivro;
	}


	public void setListaLivro(List<Livro> listaLivro) {
		this.listaLivro = listaLivro;
	}
	
	 
	
}
