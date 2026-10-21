package entidades;

public class Eletronico extends Produto {
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int quantidadeEstoque, int garantiaMeses) {
        super (nome, preco, quantidadeEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    // Getters
    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    // Setters
    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Garantia Meses: " + garantiaMeses);
    }
}
