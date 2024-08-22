package poo;

public class RetanguloJava extends FormaJava {

    private double largura;
    private double altura;

    public RetanguloJava(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
