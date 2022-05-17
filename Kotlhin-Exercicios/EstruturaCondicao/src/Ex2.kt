class Ex2 {
    fun main() {
        print("Entre com o primeiro número:")
        val n1 = readln().toInt()
        print("Entre com o segundo número:")
        val n2 = readln().toInt()
        print("Entre com o terceiro número:")
        val n3 = readln().toInt()

        val listanum = listOf(n1, n2, n3)

        val ordcre = listanum.sorted()
        val orddec = listanum.sortedDescending()

        println("Os números em ordem crescente são: $ordcre")
        println("Os números em ordem decrescente são: $orddec")
    }
}
