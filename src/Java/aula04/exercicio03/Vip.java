package Java.aula04.exercicio03;

public class Vip extends Ingresso{
    private double valorAdicional;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void valorVip() {
        System.out.println("Valor: R$ " + (getValor() + getValorAdicional()));
    }

    @Override
    public void imprimeValor() {
        valorVip();
    }
}
