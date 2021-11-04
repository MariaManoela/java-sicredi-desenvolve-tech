package Java.aula04.exercicio01;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Manu", "96748321065", 8000 );
        Assistente assistente1 = new Assistente("Carol", "74832641100", 10000, 23587);
        Tecnico tecnico1 = new Tecnico("Vitor", "423178945500", 5000, 78974);
        Administrativo administrativo1 = new Administrativo("Dani", "65978423300", 3000, 6597, "dia");
        Administrativo administrativo2 = new Administrativo("Dante", "65978423300", 3000, 6597, "Noite");

        funcionario1.exibeDados();
        assistente1.exibeDados();
        tecnico1.exibeDados();
        administrativo2.exibeDados();
        administrativo2.exibeDados();
    }
}
