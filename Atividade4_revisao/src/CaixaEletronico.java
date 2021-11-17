
public class CaixaEletronico {
	private String endereco;
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public CaixaEletronico(String endereco ) {
        this.endereco = endereco;
    }
	
	public boolean saque(Conta conta, Float valor) {
		boolean sucesso = false;
		
		if(conta.getSaldo() >= valor && valor > 0) {
			float atualizacao = conta.getSaldo() - valor;
			conta.setSaldo(atualizacao);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public boolean deposito(Conta conta, Float valor) {
		boolean sucesso = false;
		
		if(valor > 0) {
			float atualizacao = conta.getSaldo() + valor;
			
			conta.setSaldo(atualizacao);
			sucesso = true;
		}
		
		return sucesso;
	}
	
}
