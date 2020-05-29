import java.util.Locale;
import java.util.Scanner;

public class avaliacaoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		int horasTrabalhadas, opcao;
		double valorPorHora;
		char resposta;
		
		//Leitura dos dados
		do {
		System.out.print("Nome: ");
		nome = sc.next();
		
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
			while (horasTrabalhadas < 0) {
			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();
			}
			
		System.out.print("Valor por hora: ");
		valorPorHora = sc.nextDouble();
			while (valorPorHora < 0) {
			System.out.print("Valor por hora: ");
			valorPorHora = sc.nextInt();
			}
		
		System.out.print("Digitar outro (S/N) ");
		resposta = sc.next().charAt(0);
		
		
		}
		while (resposta == 's' || resposta == 'S');
		
		//Menu repetindo
		
		do {
		System.out.println();
		System.out.println("MENU ");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair ");
		System.out.println("Digite uma opção: ");
		opcao = sc.nextInt();
		}
		while( opcao != 4);
		
		
		sc.close();
	}

}
