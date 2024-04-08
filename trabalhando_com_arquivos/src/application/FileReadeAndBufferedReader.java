package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// MODO CORRETO, MAS POLUÍDO
public class FileReadeAndBufferedReader {

	public static void main(String[] args) {
		
		String path = "J:\\Projetos\\Curso_de_Java\\trabalhando_com_arquivos\\txttexto.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}	
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}



//MODO CORRETO
public class FileReadeAndBufferedReader {

	public static void main(String[] args) {
		
		String path = "J:\\Projetos\\Curso_de_Java\\trabalhando_com_arquivos\\txttexto.txt";
		//FileReader fr = null;
		//BufferedReader br = null;
		
		try(BufferedReader = new BufferedReader(FileReader(path))){
			//fr = new FileReader(path);
			//br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}	
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}