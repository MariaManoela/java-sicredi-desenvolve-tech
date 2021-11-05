package Java.aula04.exercicio02.diagramaPessoa;

public class Miseravel extends Pessoa {
    public Miseravel(String nome, String idade) {
        super(nome, idade);
    }

    public void mendiga() {
        System.out.println("Mendigando");
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        mendiga();
    }
}
