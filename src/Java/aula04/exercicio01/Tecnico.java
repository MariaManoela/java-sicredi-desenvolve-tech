package Java.aula04.exercicio01;

public class Tecnico extends Assistente {
    private double bonus = 100;

    public double getBonus(double salario){
        return salario + bonus;
    }

    public Tecnico(String nome, String cpf, double salario, int matricula){
        super(nome, cpf, salario, matricula);
        setSalario(salario + bonus);
    }
}
