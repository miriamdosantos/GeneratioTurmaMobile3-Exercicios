
    fun main() {
        var pessoasCalmas = 0
        var mulheresNervosas = 0;var aux40 = 0; var aux18 = 0
        var calma = 0; var nervosa = 0; var agressiva = 0
        var homensAgressivos = 0; var outros = 0
        var i = 0
        while (i <= 10) {
            print("Insira sua idade: ")
            val idade = readln().toInt()
            print("\nInsira seu sexo (1-feminino / 2-masculino / 3-Outros): ")
            val sexo = readln().toInt()
            print("\nVocê é uma pessoa (1- calma / 2- nervosa / 3- agressiva)?: ")
            val temperamento = readln().toInt()
            if (temperamento == 1) {
                calma++
                pessoasCalmas++
                if (sexo == 3) {
                    outros++
                }
                if(idade < 18){
                    aux18++
                }
            } else if (temperamento == 2) {
                nervosa++
                if (sexo == 1) {
                    mulheresNervosas++
                }
                if (idade >= 40) {
                    aux40++
                }
            } else if (temperamento == 3) {
                agressiva++
                if (sexo == 2) {
                    homensAgressivos++
                }
            }
            i++
        }
        println("---TABELA DE DADOS---\n")
        println("Número de pessoas calmas   : $pessoasCalmas")
        println("Número de mulheres nervosas: $mulheresNervosas")
        println("Número de homens agressivos: $homensAgressivos")
        println("Número de outros calmos    : $outros")
        println("Número de pessoas nervosas com mais de 40 anos: $aux40")
        println("Número de pessoas calmas com menos de 18 anos: $aux18")
    }
   /*    -------------- REFATORAÇÃO --------------

        var pessoasCalmas = 0
        var mulheresNervosas = 0
        var aux40 = 0
        var aux18 = 0
        var homensAgressivos = 0
        var outros = 0
        var i = 1
        while (i <= 4) {
            print("Insira sua idade: ")
            val idade = readln().toInt()
            print("\nInsira seu sexo (1-feminino / 2-masculino / 3-Outros): ")
            val sexo = readln().toInt()
            print("\nVocê é uma pessoa (1- calma / 2- nervosa / 3- agressiva)?: ")
            val temperamento = readln().toInt()
            when (temperamento) {
                1 -> {pessoasCalmas++; if (idade <= 18) aux18++; if(sexo == 3 ) outros++}
                2 -> {if(idade >= 40) aux40++; if(sexo == 1) mulheresNervosas++}
                3 -> {if(sexo == 2) homensAgressivos++}
            }
            i++
        }
        println("\n---TABELA DE DADOS---\n")
        println("Número de pessoas calmas   : $pessoasCalmas")//1
        println("Número de mulheres nervosas: $mulheresNervosas")// 2
        println("Número de homens agressivos: $homensAgressivos")//1
        println("Número de outros calmos    : $outros")//1
        println("Número de pessoas nervosas com mais de 40 anos: $aux40")//1
        println("Número de pessoas calmas com menos de 18 anos: $aux18")//1
    }
    }
*/



