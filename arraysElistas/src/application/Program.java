package application;
import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
	}
}

// Fazer um programa para ler um número inteiro N e os dados (nome e
//preço) de N Produtos. Armazene os N produtos em um vetor. Em
//seguida, mostrar o preço médio dos produtos.

package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();
	}
}


// ----------------------------------------------------------------------------------------------------

package entities;
public class Rent {
	private String name;
	private String email;
	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String toString() {
	return name + ", " + email;
}
}
//-----------------------------------------
package application;
import java.text.ParseException;
import java.util.Scanner;
import entities.Rent;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}

//LISTAS =====================================================

package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Program {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Maria");
	list.add("Alex");
	list.add("Bob");
	list.add("Anna");
	list.add(2, "Marco");
	System.out.println(list.size());
	for (String x : list) {
		System.out.println(x);
	}
	System.out.println("---------------------");
	list.removeIf(x -> x.charAt(0) == 'M');
	for (String x : list) {
		System.out.println(x);
	}
	System.out.println("---------------------");
	System.out.println("Index of Bob: " + list.indexOf("Bob"));
	System.out.println("Index of Marco: " + list.indexOf("Marco"));
	System.out.println("---------------------");
	List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
	for (String x : result) {
		System.out.println(x);
	}
	System.out.println("---------------------");
	String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
	System.out.println(name);
	}
}

//Matrizes =============================================================

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}