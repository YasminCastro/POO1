import java.util.Date;

public class Emprestimo {
	private Aluno responsavel;
	private Livro livro_alugado;
	private Date data_retirada;
	private Date data_devolucao;
		
	
	public Aluno getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(Aluno responsavel) {
		this.responsavel = responsavel;
	}


	public Livro getLivro_alugado() {
		return livro_alugado;
	}


	public void setLivro_alugado(Livro livro_alugado) {
		this.livro_alugado = livro_alugado;
	}


	public Date getData_retirada() {
		return data_retirada;
	}



	public void setData_retirada(Date data_retirada) {
		this.data_retirada = data_retirada;
	}



	public Date getData_devolucao() {
		return data_devolucao;
	}



	public void setData_devolucao(Date data_devolucao) {
		this.data_devolucao = data_devolucao;
	}



	public Emprestimo(Aluno responsavel, Livro livro_alugado ) {
        this.responsavel = responsavel;
        this.livro_alugado = livro_alugado;
    }

	
}
