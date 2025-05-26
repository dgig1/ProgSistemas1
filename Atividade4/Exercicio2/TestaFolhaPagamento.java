package Atividade4.Exercicio2;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class TestaFolhaPagamento {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("Ana", 3000) {
            @Override
            public double calcularProventos() {
                return salarioBase;
            }
        };

        funcionarios[1] = new FuncionarioComissionado("Carlos", 2500, 10000, 0.05);
        funcionarios[2] = new FuncionarioProdutividade("Beatriz", 2000, 100, 10);

        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.getNome() + " - Proventos: R$" + f.calcularProventos());
        }
    }
}
