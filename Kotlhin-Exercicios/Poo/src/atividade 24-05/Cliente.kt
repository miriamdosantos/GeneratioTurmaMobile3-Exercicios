


class Cliente (private var nome: String, private var telefone: String) {

    private val listaDeCompras = mutableListOf<String>()
    private var id = 0

    constructor(nome: String, telefone: String, codigo: Int)
            : this(nome, telefone) {
        this.id = codigo
    }

    init {
        if (nome == "") {
            throw Exception("A classe foi instanciada de maneira incorreta!")
        }
    }

    fun adicionarItem() {

            while (true) {
                println("Digite produto que deseja inseiris")
                val produto = readln()
                if (produto != "") {
                    listaDeCompras.add(produto)
                } else {
                    println("item nao pode ser vazio")

                }
                break
            }

    }

    fun removerItem() {

            println("Digite item que deseja remover:")
            var itemRemove = readln()
            if (listaDeCompras.contains(itemRemove)) {
                listaDeCompras.remove(itemRemove)
            } else {
                println("$itemRemove, nao se encontra na lista")

            }
        }



    fun imprimiItens() {
        println("Seu estoque contém:")
        listaDeCompras.forEach{
            println(it)}
    }
}


    //constructor(nome: String, telefone: String, codigo: Int, listaDeCompras: MutableList<String >)





   /* fun comprar (){
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
*/