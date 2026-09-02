import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarProdutos gerenciador = new GerenciarProdutos();
        int opcao;

        do {
            System.out.println("\n===== MENU DE OPCOES =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Preco: ");
                    double preco = sc.nextDouble();
                    System.out.println("Quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    Produto produto = new Produto(nome, preco, quantidade);
                    gerenciador.cadastrarProduto(produto);
                    break;

                case 2:
                    gerenciador.listarProdutos();
                    break;

                case 3:
                    gerenciador.listarProdutos();
                    System.out.println("Id para atualizar: ");
                    int idAtual = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.println("Novo preco: ");
                    double novoPreco = sc.nextDouble();
                    System.out.println("Nova quantidade: ");
                    int novaQuantidade = sc.nextInt();
                    gerenciador.atualizarProduto(idAtual, novoNome, novoPreco, novaQuantidade);
                    break;


                case 4:
                    gerenciador.listarProdutos();
                    System.out.println("Id para remover: ");
                    int idRemover = sc.nextInt();
                    gerenciador.removerProduto(idRemover);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 5);

        sc.close();
    }
}




