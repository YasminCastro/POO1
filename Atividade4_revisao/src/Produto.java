
public class Produto {
	
	private int codigo;
	private float valor;
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Produto(int codigo, float valor, String descricao ) {
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    }
	
	
	
}
