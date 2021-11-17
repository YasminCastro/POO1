
public class Item {
	
	private int quantidade;
	private Produto produto;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
	
	
	}
