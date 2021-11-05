package Java.aula04.exercicio02.diagramaAnimal;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Mel", "Siamês");
        Cachorro cachorro1 = new Cachorro("Bob", "Pastor Alemão");
        Gato gato1 = new Gato("Amora", "SRD");
        Gato gato2 = new Gato("Jinx", "SRD");

        animal1.exibeDados();
        animal1.caminha();

        cachorro1.exibeDados();
        cachorro1.late();

        gato1.exibeDados();
        gato1.mia();
    }
}
