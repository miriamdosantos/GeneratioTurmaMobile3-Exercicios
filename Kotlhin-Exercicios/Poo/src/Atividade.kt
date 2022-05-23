class Atividade {
    class main {




        fun main() {
            println("Digite 1 numero:")
            val num1 = readln().toInt()
            println("Digite o 2 numero:")
            val num2 = readln().toInt()
            println("Digite o 3 numero:")
            val num3 = readln().toInt()

            if (num1 > num2 && num1 > 3) {
                println("$num1 maior numero")

            } else if (num2 > num1 && num2 > num3) {
                println("$num2 maior numero")
            } else if (num3 > num2 && num3 > num1) {
                println("$num2 maior numero")
            }
        }
    }


    /*  println("Digite o diametro do circulo")
      val diametro = readln().toDouble()
      val pi = 3.14
      val raio = diametro/2
      val area = pi * raio.pow(2)
      val perimetro = 2* pi*raio
      println("com base no diametro: $diametro, temos:")
      println("A area do circulo: $area, e o perimetro do circulo: $perimetro")

     */

}