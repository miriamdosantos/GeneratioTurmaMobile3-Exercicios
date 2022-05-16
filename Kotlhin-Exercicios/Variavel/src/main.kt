import kotlin.math.pow

class main {


    fun main() {


        println("Digite o diametro do circulo")
        val diametro = readln().toDouble()
        val pi = 3.14
        val raio = diametro/2
        val area = pi * raio.pow(2)
        val perimetro = 2* pi*raio
        println("com base no diametro: $diametro, temos:")
        println("A area do circulo: $area, e o perimetro do circulo: $perimetro")
    }
}