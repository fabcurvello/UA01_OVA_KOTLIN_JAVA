package poo;

public class CadastroFuncionarioJava {
    public static void main(String[] args) {
        GerenteJava gerente = new GerenteJava("Alice");
        DesenvolvedorJava desenvolvedor = new DesenvolvedorJava("Paulo");

        gerente.exibirInformacoes();
        desenvolvedor.exibirInformacoes();
    }
}
