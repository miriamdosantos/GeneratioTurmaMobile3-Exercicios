
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
                1 -> {inserirItem(items)}
                2 -> {remover(items)}
                3 ->{atualizar(items)}
                4 -> imprimiItens(items)
            }

            }
            }

    fun inserirItem (Items:MutableList<String>):MutableList<String> {
            while(true) {
                println("Digite o item que deseja inserir:")
                val item = readln()
                if (item != "") {
                    Items.add(item)
                }else{
                    break
                }
            }
        return Items
    }
    fun remover (Items:MutableList<String>):MutableList<String>{
        println("Digite item que deseja remover:")
        val itemRemove = readln()
        if (Items.contains(itemRemove)) {
            Items.remove(itemRemove)
        }
        return Items
    }
    fun atualizar (Items:MutableList<String>):MutableList<String>{
        println("Digite item que deseja atualizar:")
        val editItem = readln()
        if (Items.contains(editItem)) {
            val index = Items.indexOf(editItem)
            println("Digite novo item:")
            val novoItem = readln()
            Items[index] = novoItem
        }
        return Items
    }

    fun imprimiItens (Items:MutableList<String>){
        println("Seu estoque contem: ${Items.forEach { println(it)  }}")
    }