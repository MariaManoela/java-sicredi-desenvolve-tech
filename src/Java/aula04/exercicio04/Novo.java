package Java.aula04.exercicio04;

import java.util.Random;

public class Novo extends Imovel{
    private double valorAdicional;

    public Novo() {
    }

    public Novo(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void valorAdicional() {
        System.out.println("Valor adicional do imóvel novo: R$ " + getValorAdicional());
        System.out.println("Valor total: R$ " + (getPreco() + getValorAdicional()));
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        valorAdicional();
    }
}
