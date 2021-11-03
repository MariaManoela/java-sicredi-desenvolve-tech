package Java.aula01;

import java.util.Arrays;
import java.util.Collections;

public class aula01 {
    public static void main(String[] arg) {
        int[] valores = new int[20];
        int[] repetido = {1, 1, 2, 2, 3};

        for (int i = 0; i < valores.length; i++) {
            valores[i] = i * 10;
            System.out.println(valores[i]);
        }

        System.out.println("*********************");

        int[] aux = new int[20];

        for (int i = 0; i < aux.length - 1; i++) {
            for (int j = valores.length - 1; j > 0; j--) {
                aux[i] = valores[j];
                i++;
            }
        }
        for (int k = 0; k < aux.length - 1; k++) {
            System.out.println(aux[k]);
        }

        nOcorrencias(repetido, 1);
        hasRepeat(repetido);
        nroRepeat(valores);
        listRepeat(repetido);
        intersect(valores, repetido);
        difference(valores, repetido);
        int[] uniao = union(valores, repetido);
        for (int i = 0; i < uniao.length; i++){
            System.out.print(uniao[i] + ", ");
        }
        System.out.println(difference(valores, repetido));
    }

    public static int nOcorrencias(int[] l, int el) {
        int qtd = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] == el) {
                qtd++;
            }
        }
        System.out.println("O valor se repete " + qtd + " vezes");
        return qtd;
    }

    public static boolean hasRepeat(int[] l) {
        boolean retorno = false;
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[i] == l[j]) {
                    retorno = true;
                }
            }
        }
        System.out.println(retorno);
        return retorno;
    }

    public static int nroRepeat(int[] l) {
        int cont = 0;
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[i] == l[j]) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int[] listRepeat(int[] l) {
        int listaRepetidos[] = new int[l.length];
        int cont = 0;
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[i] == l[j]) {
                    cont++;
                    listaRepetidos[i] = l[i];
                    System.out.println(listaRepetidos[i]);
                }
            }
        }
        return listaRepetidos;
    }

    public static int[] union(int[] l1, int[] l2){
        int[] listaUniao = new int[l1.length + l2.length];
        int cont = 0;
        for (int i = 0; i < l1.length; i++){
            listaUniao[cont] = l1[i];
            cont ++;
        }
        for (int i = 0; i < l2.length; i++){
            listaUniao[cont] = l2[i];
            cont ++;
        }
        return listaUniao;
    }

    public static int[] intersect(int[] l1, int[] l2){
        int tamanho = l1.length + l2.length;
        int[] lista = new int[tamanho];
        int cont = 0;
        for (int i = 0; i < l1.length; i++){
            for (int j = 0; j < l2.length; j++){
                if (l1[i] == l2[j]){
                    lista[cont] = l1[i];
                    System.out.println(lista[cont]);
                    cont++;
                }
            }
        }
        return lista;
    }

    public static int[] difference(int[] l1, int[] l2){
        int tamanho = l1.length + l2.length;
        int[] lista = new int [tamanho];
        int cont = 0;
        int aux = 0;
        for (int i = 0; i < l1.length; i++){
            for (int j = 0; j < l2.length; j++){
                if (l1[i] == l2[j]) {
                    cont++;
                }
                if (j == l2.length-1 && cont ==0){
                    lista[aux++] = l2[j];
                    cont = 0;
                }
            }
        }
        return lista;
    }
}

