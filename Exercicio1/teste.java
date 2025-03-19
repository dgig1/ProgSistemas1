import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        // Criação do Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar os preços dos produtos (10 produtos)
        double[] precos = new double[10];

        // Solicita ao usuário os preços dos 10 produtos
        System.out.println("Informe os preços dos 10 produtos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": R$ ");
            precos[i] = scanner.nextDouble();
        }

        // Solicita o valor do desconto
        System.out.print("Informe o valor do desconto em porcentagem (ex: 10 para 10%): ");
        double desconto = scanner.nextDouble();

        // Variável para armazenar o total após o desconto
        double totalComDesconto = 0;

        // Aplica o desconto aos preços dos produtos e soma o valor total
        for (int i = 0; i < 10; i++) {
            double precoComDesconto = precos[i] * (1 - desconto / 100);
            totalComDesconto += precoComDesconto;
        }

        // Exibe o valor total com o desconto aplicado
        System.out.printf("\nValor total dos produtos com o desconto de %.2f%%: R$ %.2f\n", desconto, totalComDesconto);

        // Fecha o scanner
        scanner.close();
    }
}
