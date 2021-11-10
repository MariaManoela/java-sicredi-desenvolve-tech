package Java.aula05.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.println(novaLista(lista, (int n, int n2) -> n + n2));
        System.out.println(novaLista(lista, (int n, int n2) -> (n + n2) / 2));
        System.out.println(novaLista(lista, (int n, int n2) -> {
            if (n > n2){
                return n;
            }else{
                return n2;
            }
        }));
    }

    public static List novaLista(ArrayList<Integer> l, Inteiros inteiros){
        List novaLista = new ArrayList();
        for (int i = 0; i < l.size()-1; i++){
            novaLista.add(inteiros.resultante(l.get(i), l.get(i+1)));
        }
        return novaLista;
    }
}
