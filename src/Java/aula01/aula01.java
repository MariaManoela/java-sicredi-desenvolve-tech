package Java.aula01;

import java.util.Arrays;
import java.util.Collections;

public class aula01 {
    public static void main(String[] arg) {
        int[] valores = new int[20];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = i * 10;
            System.out.println(valores[i]);
        }

        System.out.println("*********************");

        int[] aux = new int[20];

        for (int i = 0; i < aux.length-1; i++) {
            for (int j = valores.length-1 ; j > 0; j--) {
                aux[i] = valores[j];
                i++;
            }
        }
        for (int k = 0; k < aux.length - 1; k++) {
            System.out.println(aux[k] + " ");
        }
        nOcorrencias(valores, 5);
        hasRepeat(valores);
    }

    public static int nOcorrencias(int[] l, int el) {
        int qtd = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] == el) {
                qtd++;
                System.out.println("o valor se repete: " + qtd);
            } else {
                System.out.println("O valor não se repete");
                return 0;
            }
        }
        return qtd;

    }

    public static boolean hasRepeat(int[] l) {
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                if (l[j] == l[i]) {
                    System.out.println("O elemento " + l[j] + " se repete.");
                    return true;
                } else {
                    System.out.println("O elemente " + l[j] + "não se repete.");
                    return false;
                }
            }
        }
        return true;
    }
}

