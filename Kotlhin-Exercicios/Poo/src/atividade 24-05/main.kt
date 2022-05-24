fun main () {


        println("Digite o seu nome: ")
        val nome = readln()
        println("Digite seu telefone: ")
        val telefone = readln()
    while (true) {
        try {
            val cliente1 = Cliente(nome, telefone)

            println("*** 1 - para inserir produto do cliente, 2- para remover produto, 3 para exibir lista de compras do cliente")
            val opcao = readln().toInt()
            when (opcao) {
                1 -> {
                    println("Digite o item que deseja inserir:")
                    var item = readln()
                    cliente1.adicionarItem(item)
                }
                2 -> {
                    cliente1.removerItem()
                }
                3 -> {
                    cliente1.imprimiItens()
                }
            }
            } catch (e: Exception) {
                println(e.message)
            break
            }

    }
}










