package poo;

public class CirculoJava extends FormaJava{

    private double raio;

    public CirculoJava(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
