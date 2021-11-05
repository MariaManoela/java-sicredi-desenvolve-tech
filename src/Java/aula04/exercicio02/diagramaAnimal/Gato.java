package Java.aula04.exercicio02.diagramaAnimal;

public class Gato extends Animal {
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public void mia() {
        System.out.println("MIAU");
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        mia();
    }
}
