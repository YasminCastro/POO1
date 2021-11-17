
public class program2 {

	public static void main(String[] args) {
		Livro l1 = new Livro(1, "Pequeno principe");
		Livro l2 = new Livro(2, "Harry potter");
		Aluno a1 = new Aluno("apsok121", "Yasmin Castro");
		Emprestimo e1 = new Emprestimo(a1, l1);
		Emprestimo e2 = new Emprestimo(a1, l2);
		
		
		a1.add_Emprestimo(e1);
		a1.add_Emprestimo(e2);
		
		System.out.println(a1.toString());
		
	}
}
