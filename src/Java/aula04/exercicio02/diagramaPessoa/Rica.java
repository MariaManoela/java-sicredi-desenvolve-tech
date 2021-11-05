package Java.aula04.exercicio02.diagramaPessoa;

public class Rica extends Pessoa{
    private double dinheiro;

    public Rica(String nome, String idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void fazCompras() {
        System.out.println("Dinheiro disponível para compras: " + getDinheiro());
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        fazCompras();
    }
}
