package Java.aula04.exercicio03;

import java.util.Scanner;

public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void imprimeValor() {
        System.out.println("Valor: R$ " + getValor());
    }

    public void menu() {
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("===========SELECIONE SEU INGRESSO===========");
        System.out.println("1- Ingresso Normal");
        System.out.println("2- Ingresso VIP");
        System.out.println("Opção ---> ");
        opcao = input.nextInt();

        do{
            switch (opcao){
                case 1:
                    Normal normal = new Normal(25);
                    normal.imprimeValor();
                    break;
                case 2:
                    System.out.println("=====INGRESSO VIP=====");
                    System.out.println("1- Camarote Superior");
                    System.out.println("2- Camarote Inferior");
                    System.out.println("Opção --> ");
                    opcao = input.nextInt();

                    if (opcao == 1){
                        System.out.println("=====CAMAROTE SUPERIOR=====");
                        CamaroteSuperior camsup = new CamaroteSuperior(25, 10, 15);
                        camsup.imprimeValor();
                    }else if (opcao == 2){
                        System.out.println("=====CAMAROTE INFERIOR=====");
                        CamaroteInferior caminf = new CamaroteInferior(25, 5, "H2");
                        caminf.getLocalizacao();
                        caminf.imprimeValor();
                    }else{
                        System.out.println("Opção inválida!");
                    }
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");
            }
        }while(opcao == 1 && opcao == 2);
    }
}
