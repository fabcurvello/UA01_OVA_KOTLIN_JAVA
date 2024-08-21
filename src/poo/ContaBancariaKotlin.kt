package poo

class ContaBancariaKotlin(saldoInicial: Double) {
    private var saldo = saldoInicial

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
        }
    }

    fun consultarSaldo(): Double {
        return saldo
    }
}

fun main() {
    val conta = ContaBancariaKotlin(1000.0)
    conta.depositar(500.0)
    conta.sacar(200.0)
    println("Saldo atual: ${conta.consultarSaldo()}")
}
