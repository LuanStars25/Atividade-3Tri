fun main() {
    print("Nome: ")
    val nome = readln()
    print("Idade: ")
    val idade = readln().tolnt()

    if (idade <0) {
        printIn("Idade inválida.")
    } else if (idade >= 18) {
        printIn("$nome é maior de idade.")
    } else {
        printIn("$nome é menor de idade.")
    }
}
