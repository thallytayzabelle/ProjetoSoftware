package entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque > 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade Estoque: " + quantidadeEstoque);
    }

    public double calcularTotal(int quantidadeEstoque) {
        return preco * quantidadeEstoque;
    }

    public boolean vender(int quantidade) {
        if (quantidadeEstoque > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque = quantidadeEstoque - quantidade;
            return true;
        } else {
            return false;
        }
    }
}

