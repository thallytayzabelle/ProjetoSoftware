package entidades;

public class Livro extends ItemBiblioteca implements Emprestavel {
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        super(titulo, autor, anoPublicacao);
        this.isbn = isbn;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nLIVRO: " + titulo + " | ISBN: " + isbn + " | Disponível: " + disponivel);
    }

    @Override
    public void exibirAutor() {}
}
