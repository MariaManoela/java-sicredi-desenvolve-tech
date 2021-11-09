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

//        novaLista(lista, (inteiro1, inteiro2) -> inteiro1 + inteiro2);
        System.out.println(novaLista(lista, (inteiro1, inteiro2) -> inteiro1 + inteiro2));
    }

    public static List novaLista(ArrayList<Integer> l, Inteiros inteiros){
        List novaLista = new ArrayList();
        for (int i = 0; i < novaLista.size()-1; i++){
            novaLista.add(inteiros.resultante(l.get(i), l.get(i+1)));
        }
        return novaLista;
    }
}
