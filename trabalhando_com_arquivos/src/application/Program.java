package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("J:\\Projetos\\Curso_de_Java\\trabalhando_com_arquivos\\txttexto.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally{
			if(sc != null) {
				sc.close();
			}
		}

	}

}
