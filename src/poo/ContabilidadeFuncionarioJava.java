package poo;

public class ContabilidadeFuncionarioJava {

    public static void main(String[] args) {
        Funcionario2Java ger = new Gerente2Java();
        Funcionario2Java dev = new Desenvolvedor2Java();
        Funcionario2Java func = new Funcionario2Java();

        System.out.println("Salário do gerente: " + ger.calcularSalario());
        System.out.println("Salário do desenvolvedor: " + dev.calcularSalario());
        System.out.println("Salário do funcionário: " + func.calcularSalario());
    }
}
