package Java.aula02.exercicio03;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cadastro.cadastraNome(cliente1);
        cadastro.cadastraCpf(cliente1);
        cadastro.cadastraIdade(cliente1);
        cadastro.cadastraGenero(cliente1);
        cadastro.cadastraCliente(cliente1);

        cadastro.cadastraNome(cliente2);
        cadastro.cadastraCpf(cliente2);
        cadastro.cadastraIdade(cliente2);
        cadastro.cadastraGenero(cliente2);
        cadastro.cadastraCliente(cliente2);
        cadastro.imprimeClientes();
    }
}
