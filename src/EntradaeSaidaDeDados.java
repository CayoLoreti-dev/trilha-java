import java.util.Scanner;

public class EntradaeSaidaDeDados {
    public static void main(String[] args) {
//
//        System.out.println("Olá eu faço a impressão e pulo a linha");
//        System.out.print("Olá eu faço a impressão na mesma linha");
//        System.out.printf("Olá eu faço a impressão formatada");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha restante

        System.out.print("Digite se você está empregado (true/false): ");
        boolean emprega = scanner.nextBoolean();
        scanner.nextLine();

        // Exibir resumo
        System.out.println("Olá sou " + nome + ". Tenho " + idade + " anos e estou empregado: " + emprega + ".");

        scanner.close();
        }
}
