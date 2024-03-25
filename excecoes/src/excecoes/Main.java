package application;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("End of program");
		sc.close();
	}
}
//===========================================================================================
Pilha de chamadas de métodos
http://educandoweb.com.br
Prof. Dr. Nelio Alves

package application;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
	}
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}

//====================================================================================================
Bloco finally
http://educandoweb.com.br
Prof. Dr. Nelio Alves
Bloco finally
	try {
	}
	catch (ExceptionType e) {
	}
	finally {
	}
• É um bloco que contém código a ser executado independentemente de ter
ocorrido ou não uma exceção.
• Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro
recurso específico ao final do processamento.

package application;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}