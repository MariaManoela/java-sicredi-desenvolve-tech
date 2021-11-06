package Java.aula02.exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private ArrayList<Cliente> cliente = new ArrayList<>();
    Cliente cliente1 = new Cliente();
    Cliente cliente2 = new Cliente();
    Scanner input = new Scanner(System.in);

    public void cadastraNome() {
        System.out.println("Informe o seu nome: ");
        cliente1.setNome(input.nextLine());
    }

    public void cadastraCpf() {
        System.out.println("Informe seu CPF: ");
        cliente1.setCpf(input.nextLine());
    }

    public void cadastraIdade() {
        System.out.println("Informe sua idade: ");
        cliente1.setIdade(input.nextInt());
    }

    public void cadastraGenero() {
        System.out.println("Informe seu gênero: ");
        cliente1.setGenero(input.next());
    }

    public void cadastraCliente() {
        cliente.add(cliente1);
        cliente.add(cliente2);
    }

    public void imprimeClientes() {
        for (int i = 0; i < cliente.size(); i++){
            System.out.println(cliente.get(i).getNome());
        }
    }

    public void exibirDados() {
        System.out.println("Seu nome: " + cliente1.getNome());
        System.out.println("Seu cpf: " + cliente1.getCpf());
        System.out.println("Sua idade: " + cliente1.getIdade());
        System.out.println("Seu gênero: " + cliente1.getGenero());
    }
}
