import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[10];
        System.out.println("Informe os preços dos produtos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": R$ ");
            precos[i] = scanner.nextDouble();
        }
        System.out.print("Informe o valor do desconto: ");
        double desconto = scanner.nextDouble();
        double totalComDesconto = 0;
        for (int i = 0; i < 10; i++) {
            double precoComDesconto = precos[i] * (1 - desconto / 100);
            totalComDesconto += precoComDesconto;
        }
        System.out.printf("\nValor total dos produtos com o desconto de %.2f%%: R$ %.2f\n", desconto, totalComDesconto);
        scanner.close();
    }
}
