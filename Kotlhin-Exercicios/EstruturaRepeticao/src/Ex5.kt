
    fun main() {
        var soma =0
        do{
            println("Digite um numero")
            val num = readln().toInt()
            soma +=num
        }while(num !=0)
        println("A soma dos numeros digitados sao : $soma")
    }

