import java.util.ArrayList;
import java.util.List;


public class Aluno {
	private String matricula;
	private String nome;
	private List<Emprestimo> listaEmprestimos = new ArrayList<Emprestimo>();
	
	
	public void add_Emprestimo(Emprestimo emprestimo) {
		this.listaEmprestimos.add(emprestimo);
		
	}
	
	public void remove_Emprestimo(Emprestimo emprestimo) {
		this.listaEmprestimos.remove(emprestimo);
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Aluno(String matricula, String nome ) {
        this.matricula = matricula;
        this.nome = nome;
    }
	
	

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", listaEmprestimos=" + listaEmprestimos + "]" ;
	}

	
	
	
	
}
