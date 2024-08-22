package poo

open class Funcionario(val nome: String, val cargo: String) {
    fun exibirInformacoes() {
        println("Nome: $nome, Cargo: $cargo")
    }
}

class Gerente(nome: String) : Funcionario(nome, "Gerente")

class Desenvolvedor(nome: String) : Funcionario(nome, "Desenvolvedor")

fun main() {
    val gerente = Gerente("Alice")
    val desenvolvedor = Desenvolvedor("Paulo")

    gerente.exibirInformacoes()
    desenvolvedor.exibirInformacoes()
}
