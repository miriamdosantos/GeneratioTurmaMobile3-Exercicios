import kotlin.math.pow
import kotlin.math.sqrt

class Ex4 {
    fun main() {
        println("Digite um numero:")
        val num = readln().toDouble()
        var quadrado = num.pow(2)
        var raiz = sqrt(num)

        if (num %2==0.0){
            println("esse numero e par")
            println(" a raiz do $num e $raiz")
        }else{
            println("esse numero e impar")
            println(" o quadrado do numero: $quadrado")
        }
    }
}