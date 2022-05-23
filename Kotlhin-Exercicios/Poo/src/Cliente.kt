class Cliente (var nome : String, var telefone: String, var codigo: Int, var total:Double) {

    fun comprar (){
        println("Parabens por adquirir esse produto !")
    }

    fun trocar (){
        println("Troca efetuada com sucesso !")
    }
    fun totalCompra (TotalPrecoProdutos:MutableList<Double>):MutableList<Double>{
        while(true) {
            println("Informe valor do produto")
            var preco = readln().toDouble()
            TotalPrecoProdutos.add(preco)
            TotalPrecoProdutos.forEach { println(it) }
            return TotalPrecoProdutos
            println("Para finalizar total digite0")
            if (preco ==0.0){
                break
            }
        }
        }

    }
