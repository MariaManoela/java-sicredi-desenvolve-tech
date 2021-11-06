package Java.aula04.exercicio03;

public class CamaroteSuperior extends Vip{
    private double adicionalCamarote;

    public CamaroteSuperior(double valor, double valorAdicional, double adicionalCamarote) {
        super(valor, valorAdicional);
        this.adicionalCamarote = adicionalCamarote;
    }

    public double getAdicionalCamarote() {
        return adicionalCamarote;
    }

    public void valorCamarote() {
        System.out.println("Valor do ingresso camarote superior: " + (getValor() + getValorAdicional() + getAdicionalCamarote()));
    }

    @Override
    public void imprimeValor() {
        valorCamarote();
    }
}
