package logica

fun main() {
    println("Informe a nota 1: ")
    val nota1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Informe a nota 2: ")
    val nota2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Informe a nota 3: ")
    val nota3 = readLine()?.toDoubleOrNull() ?: 0.0

    val media = (nota1 + nota2 + nota3) / 3

    val situacao = if (media >= 7) {
        "Aprovado(a)"
    } else if (media >= 4) {
        "Recuperação"
    } else {
        "Reprovado(a)"
    }

    println("Média: %.1f - Situação: %s".format(media, situacao))
}

