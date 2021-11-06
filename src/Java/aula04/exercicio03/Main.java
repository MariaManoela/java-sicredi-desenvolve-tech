package Java.aula04.exercicio03;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso(20);
        Normal normal1 = new Normal(20);
        Vip vip1 = new Vip(20, 10);
        CamaroteInferior camaroteinf1 = new CamaroteInferior(20, 10, "H2");
        CamaroteSuperior camarotesup1 = new CamaroteSuperior(20, 10, 15);

        ingresso1.imprimeValor();
        normal1.imprimeValor();
        vip1.imprimeValor();
        camaroteinf1.imprimeValor();
        camarotesup1.imprimeValor();
    }
}
