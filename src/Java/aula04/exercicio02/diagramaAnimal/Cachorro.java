package Java.aula04.exercicio02.diagramaAnimal;

public class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
    }

    public void late() {
        System.out.println("AUAU");
    }
}
