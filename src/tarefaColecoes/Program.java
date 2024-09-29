package tarefaColecoes;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os nomes das pessoas separadas por virgula");
		String names = sc.nextLine();
		
		String[] pessoas = names.split(",");
		Arrays.sort(pessoas);
		
		for (String p : pessoas) {
			System.out.print(p);
		}
		
		sc.close();
		
	}

}
