package Atividade4.Exercicio2;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularProventos();

    public String getNome() {
        return nome;
    }
}
