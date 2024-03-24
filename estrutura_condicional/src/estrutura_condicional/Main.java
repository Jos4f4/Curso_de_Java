package estrutura_condicional;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//If-Else
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		else {
			System.out.println("VVV");
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		
		int x = sc.nextInt();
		String dia;
		if (x == 1) {
			dia = "domingo";
		}
		else if (x == 2) {
			dia = "segunda";
		}
		else if (x == 3) {
			dia = "terca";
		}
		else if (x == 4) {
			dia = "quarta";
		}
		else if (x == 5) {
			dia = "quinta";
		}
		else if (x == 6) {
			dia = "sexta";
		}
		else if (x == 7) {
			dia = "sabado";
		}
		else {
			dia = "valor invalido";
		}
		System.out.println("Dia da semana: " + dia);
		
		//Switch-Case
		int x = sc.nextInt();
		String diad;
		switch (x) {
		case 1:
		diad = "domingo";
		break;
		case 2:
		diad = "segunda";
		break;
		case 3:
		diad = "terca";
		break;
		case 4:
		diad = "quarta";
		break;
		case 5:
		diad = "quinta";
		break;
		case 6:
		diad = "sexta";
		break;
		case 7:
		diad = "sabado";
		break;
		default:
		diad = "valor invalido";
		break;
		}
		System.out.println("Dia da semana: " + diad);
		sc.close();
		
	}

}
