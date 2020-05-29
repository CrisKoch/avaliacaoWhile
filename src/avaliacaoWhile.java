import java.util.Locale;
import java.util.Scanner;

public class avaliacaoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		int horasTrabalhadas;
		double valorPorHora;
		char resposta;
		
		//Leitura dos dados
		do {
		System.out.print("Nome: ");
		nome = sc.next();
		
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
			while (horasTrabalhadas < 0) {
			horasTrabalhadas = sc.nextInt();
			}
			
		System.out.print("Valor por hora: ");
		valorPorHora = sc.nextDouble();
			while (valorPorHora < 0) {
			valorPorHora = sc.nextInt();
			}
		
		System.out.print("Digitar outro (S/N) ");
		resposta = sc.next().charAt(0);
		}
		while (resposta == 's' || resposta == 'S');
		
		
		
		
		
		sc.close();
	}

}
