package systemScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile{
	
	public static void main(String args[]) throws FileNotFoundException{
		
		double nota1, nota2, media;
		File text = new File("D:/Meus Documentos/Documentos/Eclipse/2_atividade_usandoSystemScanner/src/notas.txt");
		Scanner scan = new Scanner(text).useDelimiter(";|\n");
		
		
		 
		while(scan.hasNextLine()) {
			String nome = scan.next();
			String aux;
			aux = scan.next();
			nota1 = Double.parseDouble(aux);
			aux = scan.next();
			nota2 = Double.parseDouble(aux);
			media = (nota1 + nota2)/2;
			System.out.println("Aluno:" + nome);
			System.out.println("Nota 1: " + nota1 + " Nota 2: "  + nota2);
			System.out.println("Media: " + media);
			String line = scan.nextLine();
			
			
		}
		
		scan.close();
	}
}