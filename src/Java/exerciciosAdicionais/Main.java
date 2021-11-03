package Java.exerciciosAdicionais;

public class Main {
    public static void main(String[] args){
        Elevador elevador = new Elevador();
        elevador.setAndarAtual(0);
        elevador.getAndarAtual();

        elevador.setCapacidade(15);
        elevador.getCapacidade();

        elevador.setPessoasPresentes(0);
        elevador.getPessoasPresentes();

        elevador.setTotalAndares(20);
        elevador.getTotalAndares();
    }
}
