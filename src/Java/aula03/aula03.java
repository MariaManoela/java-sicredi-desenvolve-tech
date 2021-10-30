package Java.aula03;

public class aula03 {
    public static void main(String[] args){
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.inserir("Manu", "999999999");
        agenda.inserir("Vitor", "888888888");
        agenda.inserir("Dine", "777777777");
        agenda.inserir("Carol", "666666666");
        agenda.inserir("Vanderlei", "555555555");

        String numero = agenda.buscarNumero("Vitor");

        System.out.println(agenda.tamanho());
        agenda.remover("Vitor");
        System.out.println(agenda.tamanho());
        System.out.println(numero);
    }
}
