package Atividade4.Exercicio2;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class FuncionarioComissionado extends Funcionario {
    private double totalVendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, double salarioBase, double totalVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularProventos() {
        return salarioBase + (totalVendas * percentualComissao);
    }
}