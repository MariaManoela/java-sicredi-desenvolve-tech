package Java.aula04.exercicio03;

public class Normal extends Ingresso{
    public Normal(double valor) {
        super(valor);
    }

    public void valorNormal() {
        System.out.println("=====INGRESSO NORMAL=====");
    }

    @Override
    public void imprimeValor() {
        valorNormal();
        super.imprimeValor();
    }
}
