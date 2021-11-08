package Java.aula02.exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private ArrayList<Cliente> cliente = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void cadastraNome(Cliente novoCliente) {
        System.out.println("Informe o seu nome: ");
        novoCliente.setNome(input.next());
    }

    public void cadastraCpf(Cliente novoCliente) {
        System.out.println("Informe seu CPF: ");
        novoCliente.setCpf(input.next());
    }

    public void cadastraIdade(Cliente novoCliente) {
        System.out.println("Informe sua idade: ");
        novoCliente.setIdade(input.nextInt());
    }

    public void cadastraGenero(Cliente novoCliente) {
        System.out.println("Informe seu gênero: ");
        novoCliente.setGenero(input.next());
    }

    public void cadastraCliente(Cliente novoCliente) {
        cliente.add(novoCliente);
    }

    public void imprimeClientes() {
        for (int i = 0; i < cliente.size(); i++){
            System.out.println(cliente.get(i).getNome());
        }
    }

    public void exibirDados(Cliente novoCliente) {
        System.out.println("Seu nome: " + novoCliente.getNome());
        System.out.println("Seu cpf: " + novoCliente.getCpf());
        System.out.println("Sua idade: " + novoCliente.getIdade());
        System.out.println("Seu gênero: " + novoCliente.getGenero());
    }
}
