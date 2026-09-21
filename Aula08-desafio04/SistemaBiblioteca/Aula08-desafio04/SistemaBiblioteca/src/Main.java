import entidades.*;

public class Main {
    public static void main(String[] args) {
        // Etapa 6: pelo menos dois livros, uma revista e um ebook
        Livro livro = new Livro("Java para Iniciantes", "Ana Lima", 2025, "978-00-000-000-0");
        Livro livro2 = new Livro("Dom Casmurro", "Machado", 1899, "123");
        Revista revista = new Revista("Veja", "Abril", 2024, 10);
        Ebook ebook = new Ebook("Java POO", "Deitel", 2022, 5.5);

        // Etapa 7: referências do tipo ItemBiblioteca
        ItemBiblioteca item1 = livro;
        ItemBiblioteca item2 = revista;
        ItemBiblioteca item3 = ebook;

        System.out.println("=== ITENS DA BIBLIOTECA ===");
        item1.exibirInformacoes();
        item2.exibirInformacoes();
        item3.exibirInformacoes();

        // Etapa 8: referências do tipo Emprestavel
        Emprestavel emprestavel1 = livro;
        Emprestavel emprestavel2 = revista;
        // Emprestavel emprestavel3 = ebook;

        // Etapa 9: Roteiro de testes
        System.out.println("=== TESTES ===");
        System.out.println("Teste 2 - Emprestar livro disponível: ");
        emprestavel1.emprestar();

        System.out.println("\nTeste 3 - Emprestar mesmo livro novamente:");
        emprestavel1.emprestar();

        System.out.println("\nTeste 4 - Devolver o livro:");
        emprestavel1.devolver();

        System.out.println("\nTeste 5 - Referências Emprestavel:");
        System.out.println("Disponível? " + emprestavel2.estaDisponivel());
        emprestavel2.emprestar();
        System.out.println("Disponível? " + emprestavel2.estaDisponivel());
    }
}
