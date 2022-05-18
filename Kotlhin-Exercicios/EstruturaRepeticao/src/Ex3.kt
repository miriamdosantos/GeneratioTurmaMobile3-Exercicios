
    fun main() {

        var idade =0
        var menor21 =0
        var maior50=0


        while(idade !=-99){
            println("Qual a sua idade")
             idade = readln().toInt()
            if (idade != -99) {
                if (idade < 21) {
                    menor21++
                } else if (idade > 50) {
                    maior50++
                }
            }
        }
        println("Total de pessoas com menos de 21 anos :$menor21 , Total de pessoas maior de 50 anos $maior50" )
    }

