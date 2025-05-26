package Atividade4.Exercicio1;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class Moeda {
    private double valor;
    private String nome;

    public Moeda(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda moeda = (Moeda) obj;
        return Double.compare(moeda.valor, valor) == 0 && nome.equals(moeda.nome);
    }
}