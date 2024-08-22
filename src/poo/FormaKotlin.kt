package poo

abstract class Forma {
    abstract fun calcularArea(): Double
}

class Circulo(private val raio: Double) : Forma() {
    override fun calcularArea(): Double {
        return Math.PI * Math.pow(raio, 2.0)
    }
}

class Retangulo(private val largura: Double, private val altura: Double) : Forma() {
    override fun calcularArea(): Double {
        return largura * altura
    }
}

fun main() {
    val circulo: Forma = Circulo(5.0)
    val retangulo: Forma = Retangulo(3.0, 4.0)

    println("Área do círculo: ${circulo.calcularArea()}")
    println("Área do retângulo: ${retangulo.calcularArea()}")
}

