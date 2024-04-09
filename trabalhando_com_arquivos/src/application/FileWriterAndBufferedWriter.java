package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good mornig", "Goof Afternoon", "Good Night"};
		//Cria o arquivo e grava o String lines no txt
		String path = "J:\\Projetos\\Curso_de_Java\\trabalhando_com_arquivos\\txttextoOne.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //Para não recriar um arquivo
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
