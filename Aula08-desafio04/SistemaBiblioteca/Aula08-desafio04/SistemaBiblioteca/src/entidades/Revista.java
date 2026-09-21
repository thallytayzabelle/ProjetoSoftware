package entidades;

public class Revista extends ItemBiblioteca implements Emprestavel {
    private int edicao;
    private boolean disponivel = true;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Revista");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
        System.out.println("Dispoível: " + (disponivel ? "Sim" : "Não"));
        System.out.println();
    }

    @Override
    public void emprestar() {
        if (disponivel){
            disponivel = false;
            System.out.println("Item emprestado com sucesso");
        } else {
            System.out.println("Item indisponível para empréstimo");
        }
    }

    @Override
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Item devolvido com sucesso");
        } else {
            System.out.println("O item já está disponível");
        }
    }

    @Override
    public boolean estaDisponivel() {
        return disponivel;
    }
}
