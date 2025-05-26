package ProjetoN2;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class Produto {
    public static int proximoId = 1;
    public int id;
    public String fabricante;
    public String descricao;
    public double preco;
    public int estoque;

    public Produto(String fabricante, String descricao, double preco, int estoque) {
        if (preco <= 0 || estoque < 0) throw new IllegalArgumentException("Preço ou estoque inválidos");
        this.id = proximoId++;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public String getFabricante() { return fabricante; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }
    public void reduzirEstoque(int qtd) { estoque -= qtd; }

    @Override
    public String toString() {
        return "[" + id + "] " + descricao + " (" + fabricante + ") - R$" + preco + " - Estoque: " + estoque;
    }
}