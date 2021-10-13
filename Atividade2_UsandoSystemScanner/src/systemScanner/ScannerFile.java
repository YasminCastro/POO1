package systemScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile{
	
	public static void main(String args[]) throws FileNotFoundException{
		
		File text = new File("D:/Meus Documentos/Documentos/Eclipse/2_atividade_usandoSystemScanner/src/notas.txt");
		Scanner scan = new Scanner(text);
		
		
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println("Aluno: " + line);
			
			
		}
		
		
	}
}