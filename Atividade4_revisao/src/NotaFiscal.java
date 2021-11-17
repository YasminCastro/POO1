import java.util.ArrayList;
import java.util.List;


public class NotaFiscal {

	private float valor_total;
	private List<Item> ListaItens = new ArrayList<>();
	
	public float getValor_total() {
		return valor_total;
	}
		
	public List<Item> getListaItens(){
		return ListaItens;
	}
	
	public NotaFiscal(Item item) {
		this.ListaItens.add(item);
		this.valor_total += item.getProduto().getValor() * item.getQuantidade();
	}
 	
}
