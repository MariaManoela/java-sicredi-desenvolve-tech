package Java.aula04.exercicio04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDados() {
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Preço: " + getPreco());
    }

    public void menu() {
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("==========SELECIONE UM IMÓVEL==========");
        System.out.println("1- Imóvel Novo");
        System.out.println("2- Imóvel Velho");
        System.out.println("Opção --> ");
        opcao = input.nextInt();

        switch (opcao){
            case 1:
                Novo novo = new Novo("Bento Gonçalves", 200000, 50000);
                System.out.println("======IMÓVEL NOVO======");
                novo.exibirDados();
                break;
            case 2:
                Velho velho = new Velho("Andradas", 100000, 20000);
                System.out.println("======IMÓVEL VELHO======");
                velho.exibirDados();
            default:
                System.out.println("Insira uma opção válida!");
        }

    }
}
