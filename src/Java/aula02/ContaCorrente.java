package Java.aula02;

public class ContaCorrente {
    private double saldo = 0.0;
    private int nroConta;

    public ContaCorrente (int n) {
        nroConta = n;
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
