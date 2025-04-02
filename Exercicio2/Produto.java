//Desenvolvido por Danilo Abude Gigliotti RA 10443431//

import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println("\nAntes do desconto:");
        produto.exibirInformacoes();

        System.out.print("\nDigite o percentual de desconto: ");
        double desconto = scanner.nextDouble();
        produto.aplicarDesconto(desconto);

        System.out.println("\nApós aplicar o desconto:");
        produto.exibirInformacoes();

        scanner.close();
    }
}