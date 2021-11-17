
public class program {
	
	public static void main(String[] args) {
		Produto p1 = new Produto(2, 5, "vela");
		Item i1 = new Item(4, p1);
		NotaFiscal n1 = new NotaFiscal(i1);
		
		System.out.println(n1.getValor_total());
		
	}
	
}
