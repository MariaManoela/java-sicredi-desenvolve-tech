package Java.aula04.exercicio03;

public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do assento: " + getLocalizacao());
    }

    @Override
    public void imprimeValor() {
        imprimeLocalizacao();
        super.imprimeValor();
    }
}
