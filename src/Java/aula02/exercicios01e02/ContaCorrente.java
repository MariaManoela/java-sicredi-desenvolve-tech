package Java.aula02.exercicios01e02;

public class ContaCorrente {
    private double saldo = 0.0;
    private int nroConta;

    public ContaCorrente (int nroConta, double saldo) {
        this.nroConta = nroConta;
        this.saldo = saldo;
    }

    public void deposito (double valor) {
        if (valor > 0){
            saldo += valor;
        }else{
            System.out.println("Valor inválido.");
        }
    }

    public double retirada (double valor) {
        if (saldo - valor >= 0){
            saldo -= valor;
        }else{
            System.out.println("Não é possível realizar a retirada desse valor.");
        }
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNroConta() {
        return nroConta;
    }
}
