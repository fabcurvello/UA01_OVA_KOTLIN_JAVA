package poo;

public class CalculosJava {

    public static void main(String[] args) {
        CalculadoraJava calc = new CalculadoraJava();
        System.out.println("Soma de 2 números: " + calc.somar(10, 20));
        System.out.println("Soma de 3 números: " + calc.somar(10, 20, 30));
    }
}
