package Java.aula03;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
    Map<String,String> agenda = new HashMap<>();

    public void inserir(String nome, String numero) {
        agenda.put(nome, numero);
    }
    public String buscarNumero(String nome) {
        String numeroBuscado = agenda.get(nome);
        return numeroBuscado;
    }
    public void remover(String nome) {
        if (buscarNumero(nome) != null){
            agenda.remove(nome);
        }
    }
    public int tamanho(){
        return agenda.size();
    }
}
