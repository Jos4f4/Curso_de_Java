package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Consumer.PriceUpdate;
import Predicated.Product;
//Static version...
public class Main {

	private static final String Colletors = null;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		List<String> names = list.stream().map(Product::staticUpperCaseName()).collect(Colletors.toList());
	}
	
	names.forEach(System.out::println);
}
