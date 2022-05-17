class Ex3 {
    fun main() {
        println("Digite sua idade")
        val idade = readln().toInt()

        when (idade){
            in 10..14 -> println("Infantil")
            in 15..17 -> println("Junevil")
            in 18..25 ->println ("Adulto")
            else -> println(" Nao se encontra em nenhuma das categorias")
        }
    }
}