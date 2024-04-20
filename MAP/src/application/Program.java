package application;

import java.util.Map;

public class Program {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		//Não aceita repetições, se adicionarmos chave de mesmo valor, o valor anterior e sobrescrevido
		cookies.remove("email");
		
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		
		System.out.println("ALL COOKIES: ");
		for(String key : cookies.keyset()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
