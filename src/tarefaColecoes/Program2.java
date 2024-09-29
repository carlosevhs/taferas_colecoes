package tarefaColecoes;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite os nomes e genero das pessoas separadas por vírgula");
		String names = sc.nextLine();
		
		String[] pessoas = names.split(",");
		Arrays.sort(pessoas);

		System.out.println("Pessoas do sexo masculino:");
		for (String p : pessoas) {
			if ( p.split("-")[1].toUpperCase().charAt(0) == 'M') {
				System.out.println(p.split("-")[0]);				
			}
		}
		
		System.out.println("\nPessoas do sexo feminino:");
		
		for (String p : pessoas) {
			if ( p.split("-")[1].toUpperCase().charAt(0) == 'F') {
				System.out.println(p.split("-")[0]);				
			}
		}
		
		sc.close();
	}

}
