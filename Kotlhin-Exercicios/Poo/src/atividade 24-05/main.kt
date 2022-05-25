fun main () {

        while(true){
        println("Digite o seu nome: ")
        val nome = readln()
        println("Digite seu telefone: ")
        val telefone = readln()
        try {
            val cliente1 = Cliente(nome, telefone)
             while (true) {
                 println("*** 1 - para inserir produto do cliente, 2- para remover produto, 3 para exibir lista de compras do cliente , 4 - Finalizar")
                 val opcao = readln().toInt()
                 when (opcao) {
                     1 -> {

                         cliente1.adicionarItem()
                     }
                     2 -> {
                         cliente1.removerItem()
                     }
                     3 -> {
                         cliente1.imprimiItens()
                     }
                     4 -> break
                 }
             }
            } catch (e: Exception) {
                println(e.message)

            }

    }
}










