package poo;

public class FuncionarioJava {

    private String nome;
    private String cargo;

    public FuncionarioJava(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo);
    }
}
