package Java.aula04.exercicio04;

public class Main {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("Rua Andradas", 100000);
        Novo novo1 = new Novo("Avenida Bento Gonçalves", 300000, 5000);
        Velho velho1 = new Velho("Sol Nascente", 150000, 30000);

        imovel1.exibirDados();
        novo1.exibirDados();
        velho1.exibirDados();
    }
}
