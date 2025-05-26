package ProjetoN2;
import java.util.ArrayList;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class Cliente extends Pessoa {
    public static int proximoId = 1;
    public int id;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String email, String telefone, String endereco) {
        super(nome, email, telefone, endereco);
        this.id = proximoId++;
        this.pedidos = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNome() { return nome; }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void apresentarPedidos() {
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "[" + id + "] " + nome + " - " + email;
    }
}