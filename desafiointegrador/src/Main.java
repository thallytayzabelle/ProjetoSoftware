package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== LOJA DE INFORMÁTICA ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Cadastrar eletrônico");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Alterar preço");
            System.out.println("5 - Excluir produto");
            System.out.println("6 - Realizar venda");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            if(opcao == 1){
                System.out.println("Nome do produto: ");
                String nome = entrada.nextLine();

                System.out.println("Preço: ");
                double preco = entrada.nextDouble();

                System.out.println("Quantidade do produto: ");
                int quantidade = entrada.nextInt();
                entrada.nextLine();

                Produto p = new Produto(nome, preco, quantidade);

                produtos.add(p);

                System.out.println("Produto cadastrado!");
            }

            if(opcao == 2){
                System.out.println("Nome do eletrônico: ");
                String nome = entrada.nextLine();

                System.out.println("Preço: ");
                double preco = entrada.nextDouble();

                System.out.println("Quantidade do estoque: ");
                int quantidade = entrada.nextInt();

                System.out.println("Garantia em meses: ");
                int garantia = entrada.nextInt();
                entrada.nextLine();

                Eletronico e = new Eletronico(nome, preco, quantidade, garantia);

                produtos.add(e);

                System.out.println("Eletrônico cadastrado!");
            }

            if(opcao == 3){
                if (produtos.isEmpty()){
                    System.out.println("Nenhum produto cadastrado!");
                } else {
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("\nPosição: " + (i + 1));

            produtos.get(i).exibirInformacoes();

            System.out.println("-----------------------------");
                    }
                }
            }

            if(opcao == 4){
                System.out.println("Digite a posição do produto: ");
                int posicao = entrada.nextInt();

                if(posicao >= 1 && posicao <= produtos.size()){
                    System.out.println("Digite o novo preço: ");
                    double novoPreco = entrada.nextDouble();

                    produtos.get(posicao - 1).setPreco(novoPreco);

                    System.out.println("Preço alterado!");
                } else {
                    System.out.println("Posição inválida!");
                }

                entrada.nextLine();
            }

            if(opcao == 5){
                System.out.println("Digite a posição do produto: ");
                int posicao = entrada.nextInt();

                if(posicao >= 1 && posicao <= produtos.size()){
                    produtos.remove(posicao - 1);
                    System.out.println("Produto excluído!");
                } else {
                    System.out.println("Posição inválida!");
                }

                entrada.nextLine();
            }

            if(opcao == 6){
                System.out.println("Digite a posição do produto: ");
                int posicao = entrada.nextInt();

                if(posicao >= 1 && posicao <= produtos.size()){
                    System.out.println("Quantidade para vender: ");
                    int quantidade = entrada.nextInt();
                    Produto p = produtos.get(posicao - 1);
                    if(p.vender(quantidade)){
                        System.out.println("Venda realizada!");
                        if (p.vender(quantidade)) {
                            System.out.println("Venda realizada!");
                            System.out.println("Valor total R$ " + p.calcularTotal(quantidade));
                            System.out.println("Estoque restante: " + p.getQuantidadeEstoque());
                        } else {
                            System.out.println("Posição inválida!");
                        }
                          entrada.nextLine();
                        }
                    }
                }

        } while (opcao != 0);

        entrada.close();
    }
}