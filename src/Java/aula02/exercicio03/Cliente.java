package Java.aula02.exercicio03;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;

    public Cliente() {}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }
}
