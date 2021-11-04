package Java.aula02;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(12345, 5.00);
        ContaCorrente c2 = new ContaCorrente(56245, 30.00);
        ContaCorrente c3 = new ContaCorrente(48575, 100.00);

        c1.deposito(20);
        c1.retirada(10);

        CadastroDeContas cadastro = new CadastroDeContas();
        cadastro.novaContaCorrente(c1);
        cadastro.novaContaCorrente(c2);
        cadastro.novaContaCorrente(c3);

        System.out.println(cadastro.getConta(12345).getSaldo());

        System.out.println(cadastro.getSaldoTotal());

        System.out.println(cadastro.qtdContas(0));
    }
}
