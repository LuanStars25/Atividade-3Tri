fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    printIN("TABUADA DO $numero")
    for (multiplicador in 1..10) {
        val resultado = numero = multiplicador
        printIn("$numero x $multiplicador = $resultado")
    }
}

      
