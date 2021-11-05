package Java.aula04.exercicio01;

public class Administrativo extends Assistente {
    private double bonusNoturno = 300;
    private String turno;

    public double getBonusNoturno() {
        return bonusNoturno;
    }

    public Administrativo(String nome, String cpf, double salario, int matricula, String turno) {
        super(nome, cpf, salario, matricula);
        this.turno = turno;

        if (turno == "noite"){
            setSalario(salario + bonusNoturno);
        }
    }

    public String getTurno() {
        return turno;
    }

    public void exibeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salário: " + (getSalario() + getBonusNoturno()));
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Turno: " + getTurno());

        if (turno == "noite" || turno == "Noite"){
            System.out.println("Bônus Noturno: " + getBonusNoturno());
        }
    }
}
