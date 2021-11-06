package Java.aula02.exercicios01e02;

import java.util.ArrayList;

public class CadastroDeContas {
    private ArrayList<ContaCorrente> contaCorrente = new ArrayList<>();
    private int nroContas = 0;

    public boolean novaContaCorrente (ContaCorrente c){
        boolean res = false;

        if (c != null){
            contaCorrente.add(c);
            System.out.println("Conta criada com sucesso!");
            res = true;
        }else{
            System.out.println("Não foi possível criar a conta.");
            res = false;
        }
        nroContas = contaCorrente.size();
        return res;
    }

    public ContaCorrente getConta(int nro) {
        ContaCorrente res = null;

        try {
            for (int i = 0; i < nroContas; i++) {
                if (nro == contaCorrente.get(i).getNroConta()) {
                    res = contaCorrente.get(i);
                }
            }
        }
        catch (Exception e){
            System.out.println("Conta não encontrada." + e);
        }
        return res;
    }

    public double getSaldoTotal(){
        double saldoContas = 0.0;
        for (int i = 0; i < contaCorrente.size(); i++){
            saldoContas += contaCorrente.get(i).getSaldo();
        }
        return saldoContas;
    }

    public int qtdContas (double noMinimo){
        int numero = 0;

        for (int i = 0; i < contaCorrente.size(); i++){
            if (contaCorrente.get(i).getSaldo() >= noMinimo){
                numero++;
            }
        }
        return numero;
    }
}