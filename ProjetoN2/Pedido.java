package ProjetoN2;
import java.util.ArrayList;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class Pedido {
    public static int proximoId = 1;
    public int id;
    private ArrayList<Item> itens;

    public Pedido() {
        this.id = proximoId++;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (quantidade <= 0 || quantidade > produto.getEstoque()) {
            System.out.println("Quantidade inválida ou insuficiente no estoque.");
            return;
        }
        produto.reduzirEstoque(quantidade);
        itens.add(new Item(produto, quantidade));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido #" + id + "\n");
        for (Item item : itens) {
            sb.append(" - " + item + "\n");
        }
        return sb.toString();
    }
}
