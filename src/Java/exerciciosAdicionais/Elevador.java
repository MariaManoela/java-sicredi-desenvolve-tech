package Java.exerciciosAdicionais;

public class Elevador {
        private int andarAtual;
        private int totalAndares;
        private int capacidade;
        private int pessoasPresentes;

        public void inicializa (int capacidade, int totalAndares){
            andarAtual = 0;
            pessoasPresentes = 0;
            this.capacidade = capacidade;
            this.totalAndares = totalAndares;
        }

        public void entra (){
            if(pessoasPresentes < capacidade){
                pessoasPresentes += 1;
                System.out.println("Total de pessoas: " +pessoasPresentes);
            }else{
                System.out.println("Capacidade máxima atingida!");
            }
        }

        public void sai (){

        }

        public void sobe (){

        }

        public void desce (){

        }


}
