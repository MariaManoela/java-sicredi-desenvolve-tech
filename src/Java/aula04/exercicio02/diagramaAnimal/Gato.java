package Java.aula04.exercicio02.diagramaAnimal;

public class Gato extends Animal {
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
    }

    public void mia() {
        System.out.println("MIAU");
    }
}
