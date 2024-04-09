package application;

import java.io.File;
import java.util.Scanner;

public class InformationFileCaminho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		//Acessando o nome do arquivo
		System.out.println("getName: " + path.getName());	
		//Acessando o caminho
		System.out.println("getParent: " + path.getParent());
		//Todo o caminho
		System.out.println("getPath: " + path.getPath());
		
		sc.close();

	}

}
