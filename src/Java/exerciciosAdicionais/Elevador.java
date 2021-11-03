package Java.exerciciosAdicionais;

public class Elevador {
        private int andarAtual;
        private int totalAndares;
        private int capacidade;
        private int pessoasPresentes;

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void inicializa (int capacidade, int totalAndares){
            andarAtual = 0;
            pessoasPresentes = 0;
            this.capacidade = capacidade;
            this.totalAndares = totalAndares;
        }

        public void entra (){
            if (pessoasPresentes < capacidade){
                pessoasPresentes++;
                System.out.println("------PESSOA ENTRANDO------");
                System.out.println("Total de pessoas: " + pessoasPresentes);
            }else{
                System.out.println("Capacidade máxima atingida!");
            }
        }

        public void sai (){
            if (pessoasPresentes > 0){
                pessoasPresentes--;
                System.out.println("------PESSOA SAINDO------");
                System.out.println("Total de pessoas: " + pessoasPresentes);
            }else{
                System.out.println("Elevador vazio!");
            }
        }

        public void sobe (){
            if (andarAtual < totalAndares){
                andarAtual++;
                System.out.println("------SUBINDO------");
                System.out.println("O elevador se encontra no " + andarAtual + " andar");
            }else{
                System.out.println("O elevador se encontra no último andar");
            }
        }

        public void desce (){
            if (andarAtual > 0){
                andarAtual--;
                System.out.println("------DESCENDO------");
                System.out.println("O elevador se encontra no " + andarAtual + "andar");
            }else{
                System.out.println("O elevador se encontra no térreo");
            }
        }
}
