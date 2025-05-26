package ProjetoN2;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class Item {
    public Produto produto;
    public int quantidade;
    public double precoUnitario;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }

    public String toString() {
        return produto.getDescricao() + " x " + quantidade + " = R$" + (quantidade * precoUnitario);
    }
}
