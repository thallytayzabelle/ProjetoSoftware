import entidades.Filme;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("===LISTA DE OPÇÕES=== ");
            System.out.println("1 - ADICIONAR FILME");
            System.out.println("2 - SAIR DO PROGRAMA");
            System.out.println("Digite a opção desejada: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome do filme: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o gênero do Filme: ");
                    String genero = sc.nextLine();

                    System.out.println("Digite o durção do Filme: ");
                    int duracao = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o valor do Filme: ");
                    double valor = sc.nextDouble();

                    System.out.println("Digite a quantidade do Filme: ");
                    int qtdIngressos = sc.nextInt();

                    filmes.add(new Filme(nome, genero, duracao, valor, qtdIngressos));
                    break;
                    case "2":
                        System.out.println("Saindo do programa");
                        return;

            }
        }
    }
}
