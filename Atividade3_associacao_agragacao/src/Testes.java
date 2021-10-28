
public class Testes {

		public static void main (String[] args) {
			Livro liv1 = new Livro("Senhor dos aneis", "Moderna");
			Autor aut1 = new Autor("J. R. R Tolkien", liv1);
			
			System.out.println(aut1.getNome());
			System.out.print(liv1.getNome());
		}
}
