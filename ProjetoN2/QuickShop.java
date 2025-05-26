package ProjetoN2;
import java.util.Scanner;

//Desenvolvido por Danilo Abude Gigliotti RA 104434312

public class QuickShop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Loja loja = new Loja();
        Cliente cliente = null;

        while (cliente == null) {
            System.out.println("1) Entrar com ID de cliente existente");
            System.out.println("2) Cadastrar novo cliente");
            System.out.println("3) Cadastrar novo produto");
            System.out.print("Escolha uma opção: ");
            int escolha = entrada.nextInt();
            entrada.nextLine();

            if (escolha == 1) {
                System.out.print("Digite seu ID de cliente: ");
                int id = entrada.nextInt();
                entrada.nextLine();
                cliente = loja.buscarClientePorId(id);
                if (cliente == null) {
                    System.out.println("Cliente não encontrado.\n");
                }
            } else if (escolha == 2) {
                System.out.print("Nome: ");
                String nome = entrada.nextLine();
                System.out.print("Email: ");
                String email = entrada.nextLine();
                System.out.print("Telefone: ");
                String telefone = entrada.nextLine();
                System.out.print("Endereço: ");
                String endereco = entrada.nextLine();

                cliente = new Cliente(nome, email, telefone, endereco);
                loja.adicionarCliente(cliente);
                System.out.println("\nCadastro realizado com sucesso!");
                System.out.println("Seu ID de cliente é: " + cliente.getId());
                System.out.println("Use esse ID para acessar o sistema futuramente.\n");
                
            } else if (escolha == 3) {
                System.out.print("Fabricante: ");
                String fabricante = entrada.nextLine();
                System.out.print("Descrição: ");
                String descricao = entrada.nextLine();
                System.out.print("Preço unitário: ");
                double preco = entrada.nextDouble();
                System.out.print("Quantidade em estoque: ");
                int estoque = entrada.nextInt();
                entrada.nextLine(); 

                try {
                    Produto novoProduto = new Produto(fabricante, descricao, preco, estoque);
                    loja.adicionarProduto(novoProduto);
                    System.out.println("Produto cadastrado com sucesso! ID: " + novoProduto.getId());
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro ao cadastrar produto: " + e.getMessage());
                }
            } else {
                System.out.println("Opção inválida.\n");
            }
        }

        int opcao;
        do {
            System.out.println("\n** QuickShop **");
            System.out.println("Bem-vindo, " + cliente.getNome() + "!");
            System.out.println("1) Ver Catálogo de Produtos");
            System.out.println("2) Fazer Novo Pedido");
            System.out.println("3) Ver Meus Pedidos");
            System.out.println("4) Sair");
            System.out.print("Selecione uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    loja.listarProdutos();
                    break;
                case 2:
                    Pedido pedido = new Pedido();
                    while (true) {
                        System.out.print("ID do produto (0 para finalizar): ");
                        int idProd = entrada.nextInt();
                        if (idProd == 0) break;
                        Produto p = loja.buscarProdutoPorId(idProd);
                        if (p == null) {
                            System.out.println("Produto não encontrado.");
                            continue;
                        }
                        System.out.print("Quantidade: ");
                        int qtd = entrada.nextInt();
                        pedido.adicionarItem(p, qtd);
                    }
                    cliente.adicionarPedido(pedido);
                    System.out.println("Pedido finalizado!\n");
                    break;
                case 3:
                    cliente.apresentarPedidos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        entrada.close();
    }
}
