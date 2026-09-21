package entidades;

public class Ebook extends ItemBiblioteca {
    private double tamanhoArquivoMb;

    public Ebook(String titulo, String autor, int anoPublicacao, double tamanhoArquivoMb) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivoMb = tamanhoArquivoMb;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Ebook");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Tamanho: " + tamanhoArquivoMb + "MB");
        System.out.println();
    }
}
