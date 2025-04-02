//Desenvolvido por Danilo Abude Gigliotti RA 10443431//

import java.util.Scanner;

class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, titular, saldo);
        conta.exibirSaldo();

        System.out.print("\nDigite o valor a depositar: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);
        conta.exibirSaldo();

        System.out.print("\nDigite o valor a sacar: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);
        conta.exibirSaldo();

        scanner.close();
    }
}
