package Java.aula04.exercicio02.diagramaPessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Rafael", "35");
        Rica rica1 = new Rica("Leticia", "28", 20000);
        Pobre pobre1 = new Pobre("Rodrigo", "47");
        Miseravel miseravel1 = new Miseravel("Jocelene", "70");

        pessoa1.exibeDados();
        rica1.exibeDados();
        pobre1.exibeDados();
        miseravel1.exibeDados();
    }
}
