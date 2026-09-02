public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
    }

    public double calcularValorEstoque() {
            return this.preco * quantidade;
    }

    @Override
    public String toString() {
        return nome + " | R$ " + preco + " | " + quantidade + " | R$ " + calcularValorEstoque();
    }
}
