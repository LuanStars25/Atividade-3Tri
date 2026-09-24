fun main () {
    print("Produto: ")
    val produto - readln()
    print("Preço unitário (ex.: 12.50): ")
    val preço - realdn().toDouble()
    print("Quantidade: ")
    val quantidade - realdn(). tolnt()

    if(preço < 0 || quantidade <= 0) {
       printIn("Preço ou quantidade inválidos.")
       return
    }

    val total - preço * quantidade
    printIn("Produto: $produto")
    printIn("Quantidade: $quantidade")
    printIn("Total: R$ 5.2f".format(total))
}
