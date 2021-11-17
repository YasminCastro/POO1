
public class program3 {
	
	public static void main(String[] args) {
		
		CaixaEletronico ce1 = new CaixaEletronico();
		
		Conta c1 = new Conta(123, 321, 100);
		ce1.saque(c1, 10);
		System.out.println(c1.getSaldo());

}
