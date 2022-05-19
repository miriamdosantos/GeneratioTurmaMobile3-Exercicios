import kotlin.math.pow
import kotlin.math.sqrt

fun main (){
        println(" *** Calculadora operacoes basicas ***")
        println("Digite 1 n, que deseja calcular:")
        val num1 = readln().toDouble()
        println("Digite 2 n, que deseja calcular:")
        val num2 = readln().toDouble()

    println("** A SOMA dos numeros digitados:")
    println(soma(num1,num2))
    println("** A SUBTRACAO dos numeros digitados:")
    println(subtracao(num1,num2))
    println("** A MULTIPLICACAO dos numeros digitados:")
    println(multiplicacao(num1,num2))
    println("** A divisao dos numeros digitados:")
    println(divisao(num1,num2))
    println("** A potencia do 1 numero:")
    println(potencia(num1))
    println("** A potencia do 2 numero:")
    println(potencia(num2))
    println("a raiz quadrado do 1 numero:")
    println(raiz(num1))
    println("a raiz quadrado do 1 numero:")
    println(raiz(num2))
    }
fun soma (num1:Double, num2: Double): Double{
    return num1 +num2
}
    fun subtracao (num1:Double, num2: Double): Double{
        return num1 -num2
    }
    fun multiplicacao (num1:Double, num2:Double): Double{
        return num1*num2
    }
    fun divisao (num1:Double, num2:Double):Double{
        return (num1 / num2)
    }
    fun potencia (num1:Double):Double{
        return num1.pow(2)

    }

   fun raiz (num1:Double): Double{
       return sqrt(num1)
   }
/*
fun main() {
    var x: Double
    println("Calculadora:")
    println("Me informe qual operação você quer: +  soma, - subtração, x multiplicação, / divisão, potencia ou raizquadrada:")
    val op = readln().toString()
    if (op == "raizquadrada") {
        println("Me informe qual o valor para a calcularmos a raiz quadrada:")
        val num1 = readln().toDouble()
        println("A raiz quadrada é:${raiz(num1)} ")
    } else if (op == "potencia") {
        println("Me informe qual número e qual o valor de potencia que você deseja:")
        var num1 = readln().toDouble()
        x = readln().toDouble()
        println("A potência para o $num1 elevado a $x é:${pot(num1, x)}")
    }
    println("Para começarmos me informe dois números:")
    val num1 = readln().toDouble()
    val num2 = readln().toDouble()
    when (op) {
        "+" -> println("O valor da soma é:${soma(num1, num2)}")
        "-" -> println("O valor da subtração é:${sub(num1, num2)}")
        "x" -> println("O valor da multiplicação é:${mult(num1, num2)}")
        "/" -> println("O valor da divisão é:${divisao(num1, num2)}")
    }
}
*/
