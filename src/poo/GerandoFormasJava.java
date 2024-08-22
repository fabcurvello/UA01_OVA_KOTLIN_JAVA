package poo;

public class GerandoFormasJava {
    public static void main(String[] args) {
        FormaJava circulo = new CirculoJava(5);
        FormaJava retangulo = new RetanguloJava(3,4);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retêncgulo: " + retangulo.calcularArea());
    }
}
