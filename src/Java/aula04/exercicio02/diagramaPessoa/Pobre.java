package Java.aula04.exercicio02.diagramaPessoa;

public class Pobre extends Pessoa {
    public Pobre(String nome, String idade) {
        super(nome, idade);
    }

    public void trabalha() {
        System.out.println("Trabalhando");
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        trabalha();
    }
}
