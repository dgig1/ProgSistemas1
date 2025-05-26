package ProjetoN2;

public class TestaQuickShop {
    public static void main(String[] args) {
        // Cria loja e inicializa dados
        Loja loja = new Loja();

        // Cria novo cliente manualmente
        Cliente novoCliente = new Cliente("Danilo", "danilo@email.com", "11999999999", "Rua X");
        loja.buscarClientePorId(1).adicionarPedido(new Pedido()); // Simula que cliente Ana já tem pedido

        // Adiciona cliente à loja (se quiser testar novo cliente)
        // loja.getClientes().add(novoCliente); // Se quiser adicionar novo cliente, precisa criar método getClientes()

        // Lista produtos disponíveis
        System.out.println("=== Catálogo de Produtos ===");
        loja.listarProdutos();

        // Seleciona um produto existente da loja
        Produto p1 = loja.buscarProdutoPorId(1); // Tênis Air
        Produto p2 = loja.buscarProdutoPorId(2); // Smartphone Galaxy

        // Cria novo pedido
        Pedido pedidoTeste = new Pedido();
        pedidoTeste.adicionarItem(p1, 2); // 2 Tênis
        pedidoTeste.adicionarItem(p2, 1); // 1 Smartphone

        // Atribui pedido ao cliente
        novoCliente.adicionarPedido(pedidoTeste);

        // Exibe os pedidos realizados
        System.out.println("\n=== Pedidos de " + novoCliente.getNome() + " ===");
        novoCliente.apresentarPedidos();

        // Verifica estoque atualizado
        System.out.println("\n=== Estoque Atualizado ===");
        loja.listarProdutos();
    }
}

