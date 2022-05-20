
    fun main (){
        val items = mutableListOf<String>()
        while (true) {
            println("*** Controle de Estoque***")
            println(
                "Digite 1 para inserir novo item /  2 - para Remover item " +
                        "/ Digite 3 - para Atualizar item / 4 - Exibir itens / 5 - Finalizar"
            )
            val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    while (true) {
                        println("Digite o item que deseja inserir:")
                        val item = readln()
                        if (item != "") {
                            items.add(item)
                        } else {
                            println("O nome do produto nao pode ser vazio")
                            break
                        }
                    }
                }
                2 -> {
                    println("Digite item que deseja remover:")
                    val itemRemove = readln()
                    if (items.contains(itemRemove)) {
                        items.remove(itemRemove)
                        println("Produto removido com sucesso")
                    }else{
                        println("Produto nao existe na lista")
                    }
                }
                3 -> {
                    println("Lista de Produtos\n")
                    items.forEach { println(it) }
                    println("Digite item que deseja atualizar:")
                    val editItem = readln()
                    if (items.contains(editItem)) {
                        val index = items.indexOf(editItem)
                        println("Digite novo item:")
                        val novoItem = readln()
                        items[index] = novoItem
                        println("Produto atualizado com sucesso!")
                    }
                }
                4 -> println("Itens no estoque: $items")
                5 ->
                    break
                else -> println("Valor invalido")
            }

        }
    }
