package poo

open class Funcionario2Kotlin {
    open fun calcularSalario(): Double {
        return 2500.0 // Salário base
    }
}

class Gerente2Kotlin : Funcionario2Kotlin() {
    override fun calcularSalario(): Double {
        return 9000.0 // Salário de gerente
    }
}

class Desenvolvedor2Kotlin : Funcionario2Kotlin() {
    override fun calcularSalario(): Double {
        return 6500.0 // Salário de desenvolvedor
    }
}

fun main() {
    val ger: Funcionario2Kotlin = Gerente2Kotlin()
    val dev: Funcionario2Kotlin = Desenvolvedor2Kotlin()
    val func: Funcionario2Kotlin = Funcionario2Kotlin()

    println("Salário do gerente: ${ger.calcularSalario()}")
    println("Salário do desenvolvedor: ${dev.calcularSalario()}")
    println("Salário do funcionário: ${func.calcularSalario()}")
}
