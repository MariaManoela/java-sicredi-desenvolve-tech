package Java.aula05.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(100);
        list.add(-200);
        list.add(150);
        list.add(-100);

        PrintApp(list, (int n) -> {
            if (n > 0) {
                return ("<C>");
            } else
                return ("<D>");
        });

//        operação ternária
        PrintApp(list, (int n) -> (n >= 0) ? n + "<C>" : n + "<D>");
    }

    public static void PrintApp(List<Integer> list, IntToStr interfac) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("R$ " + list.get(i) + interfac.intToStr(i));
        }
    }
}
