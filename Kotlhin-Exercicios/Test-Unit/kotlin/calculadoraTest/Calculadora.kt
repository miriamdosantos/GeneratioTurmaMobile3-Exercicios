package calculadoraTest

import java.lang.Math.sqrt
import kotlin.math.pow

class Calculadora {
        companion object {
            var n1 = 0.0
            var n2 = 0.0

            fun soma(n1: Int, n2: Int): Int {
                //TODO("faça a função de soma")
                return n1 + n2
            }

            fun soma(n1: Double, n2: Double): Double {
                //TODO("faça a função de soma")
                return n1 - n2
            }

            fun mult() :Int{
                // uma outra forma que podemos executar essa funcao, interagindo com o usuario
                //TODO("faça a função de multiplicação")
                println("A multiplicação é do tipo Mn = (X1 x X2 x X3 ...x Xn), ou seja, n é o número de termos que você deseja multiplicar")
                print("Digite n: ")
                var n = readln().toInt()
                var multi = 0
                for (i in 1..n) {
                    if (i != 1) {
                        print("X$i = ")
                        var num = readln().toInt()
                        multi = multi * num

                    } else {
                        print("X$i = ")
                        var num = readln().toInt()
                        multi = num
                    }
                }
                return n * multi
            }

                fun divisao(n1: Double, n2: Double): Double {
                   // TODO("faça a função divisao")
                    return n1 / n2

                }

                fun subtracao(n1: Int, n2: Int): Int {
                    TODO("faça a função de divisao")
                }

                fun raiz(num1: Double): Double {
                    //TODO("faça a função de raiz")
                    return sqrt(num1)

                }

                fun potencia(n1: Double, n2: Double): Double {
                    return n1.pow(n2)
                }
            }

        }


