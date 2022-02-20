import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);		
		List<String> degraus = new java.util.ArrayList<>();
		
		
		
		
		
		System.out.print("Se, N é para 6, então digite 1:");
		int qtdDegraus = entrada.nextInt();
		
		
		for (int i = 0;i < qtdDegraus; i++) {
			degraus.add("".repeat(qtdDegraus - i) + "*".repeat( + 1));
			degraus.add("".repeat(qtdDegraus - i) + "*".repeat( + 2));
			degraus.add("".repeat(qtdDegraus - i) + "*".repeat( + 3));
			degraus.add("".repeat(qtdDegraus - i) + "*".repeat( + 4));
			degraus.add("".repeat(qtdDegraus - i) + "*".repeat( + 5));
			degraus.add("".repeat(qtdDegraus - i) + "*".repeat( + 6));
			
		}
		
		
		for (String d : degraus) {
			System.out.println(d);
		}
		
	}

}
