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

        for (int i = 0; i < valores.length; i++) {
            if (i < 10) {
                int apoio = valores[valores.length - (i + 1)];
                valores[valores.length - (i + 1)] = valores[i];
                valores[i] = apoio;
            }
            System.out.println(valores[i] + " ");
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

