public class roupa {
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;


    public roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double valorTotalEstoque(){
        return this.quantidade * this.valor;
    }

    public void incrementaQuantidade(int quantidade) {
        if (quantidade > 0){
            this.quantidade += quantidade;
            System.out.println("Quantidade atualizada com sucesso! ");
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public void decrementaQuantidade(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Quantidade atualizada com sucesso! ");
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                "\nTipo: " + tipo +
                "\nTamanho: " + tamanho +
                "\nQuantidade: " + quantidade +
                "\nValor: R$ " + valor +
                "\nValor total do estoque: R$ " + valorTotalEstoque();
    }
}

