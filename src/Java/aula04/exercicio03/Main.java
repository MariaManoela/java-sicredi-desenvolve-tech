package Java.aula04.exercicio03;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso(20);
        Normal norrmal1 = new Normal(20);
        Vip vip1 = new Vip(20, 10);
        CamaroteInferior camaroteinf1 = new CamaroteInferior(20, 10, "H2");
        CamaroteSuperior camarotesuo1 = new CamaroteSuperior(20, 10, 15);

        ingresso1.imprimeValor();
        norrmal1.imprimeValor();
        vip1.imprimeValor();
        camaroteinf1.imprimeValor();
        camarotesuo1.imprimeValor();
    }
}
