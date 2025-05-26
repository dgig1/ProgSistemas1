package Atividade4.Exercicio2;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class FuncionarioProdutividade extends Funcionario {
    private int quantidadeProduzida;
    private double valorPorUnidade;

    public FuncionarioProdutividade(String nome, double salarioBase, int quantidadeProduzida, double valorPorUnidade) {
        super(nome, salarioBase);
        this.quantidadeProduzida = quantidadeProduzida;
        this.valorPorUnidade = valorPorUnidade;
    }

    @Override
    public double calcularProventos() {
        return salarioBase + (quantidadeProduzida * valorPorUnidade);
    }
}
