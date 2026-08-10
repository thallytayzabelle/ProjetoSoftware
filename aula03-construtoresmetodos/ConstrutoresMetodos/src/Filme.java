public class Filme {

    String titulo;
    String genero;
    String autor;
    int duracao;
    double valor;
    int qtdIngressos;

    public Filme(String titulo, String genero, String autor, int duracao, double valor, int qtdIngressos) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.duracao = duracao;
        this.valor = valor;
        this.qtdIngressos = qtdIngressos;
    }

    public void decrementaIngresso(int ingressos) {
         if (ingressos > 0 && ingressos <= this.qtdIngressos) {
             this.qtdIngressos -= ingressos;
             System.out.println("Compra realizada com sucesso! ");
         } else {
             System.out.println("Quantidade inválida");
         }
    }

    public double compraIngresso(int ingressos) {
        if (ingressos > 0 && ingressos <= this.qtdIngressos) {
            return this.valor * ingressos;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                "\nGenero: " + genero +
                "\nDuracao: " + duracao +
                "\nAutor: " + autor +
                "\nValor do Ingresso: " + valor +
                "\nQuantidade de Ingressos Disponíveis: " + qtdIngressos;
    }
}
