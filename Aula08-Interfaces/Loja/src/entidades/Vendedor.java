package entidades;

public class Vendedor extends Funcionario implements Bonificacao {
    private double metaVendas;

    public Vendedor(String nome, double salario, double metaVendas) {
        super(nome, salario);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMetaVendas: " + metaVendas;
    }

    @Override
    public double calcularComissao() {
        double comissao = getSalario() * 0.02;
        return comissao;
    }
}

