package poo

class Calculadora {
    fun somar(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun somar(num1: Int, num2: Int, num3: Int): Int {
        return num1 + num2 + num3
    }
}

fun main() {
    val calc = Calculadora()
    println("Soma de 2 números: ${calc.somar(10, 20)}")
    println("Soma de 3 números: ${calc.somar(10, 20, 30)}")
}
