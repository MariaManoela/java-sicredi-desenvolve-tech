package Java.aula02;

public class CadastroDeContas {
    private ContaCorrente [] cad = new ContaCorrente[100];
    private int nroContas = 0;

    public boolean novaContaCorrente(ContaCorrente c) {
        boolean res = false;

        if (nroContas < 100 || c != null) {
            cad[nroContas] = c;
            nroContas ++;
            res = true;
        }

        return res;
    }
}