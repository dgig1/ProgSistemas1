package Aula11;

public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ale", 1000);
        System.out.printf("Saldo: %.2f\n", conta.getSaldo());
        
    }
}
