package logica

fun main() {
    print("Qual a cor do semáforo neste momento? ")
    val cor = readLine()?.lowercase()

    val acao = when (cor) {
        "verde" -> "Siga em frente."
        "amarelo" -> "Atenção, prepare-se para parar."
        "vermelho" -> "Pare."
        else -> "Cor não existente nos semáforos."
    }
    println(acao)
}
