package ProjetoN2;
import java.util.ArrayList;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class Loja {
    private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;

    public Loja() {
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
        inicializarDados();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Cliente buscarClientePorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public void listarProdutos() {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    private void inicializarDados() {
        adicionarCliente(new Cliente("Ana", "ana@email.com", "11990000001", "Rua A"));
        adicionarCliente(new Cliente("Bruno", "bruno@email.com", "11990000002", "Rua B"));
        adicionarProduto(new Produto("Nike", "Tênis Air", 399.90, 10));
        adicionarProduto(new Produto("Samsung", "Smartphone Galaxy", 1899.00, 5));
        adicionarProduto(new Produto("Dell", "Notebook Inspiron", 3499.99, 3));
    }
}
