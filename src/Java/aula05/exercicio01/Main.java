package Java.aula05.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Manu");
        stringList.add("Carol");
        stringList.add("Dante");
        stringList.add("Dine");
        stringList.add("Maria");
        stringList.add("Vitor");

        listSubstring(stringList, s -> s.toUpperCase());
    }

    public static void listSubstring(List<String> stringList, Substring s){
        for (String string : stringList) {
            System.out.println(s.novaString(string));
        }
    }
}
