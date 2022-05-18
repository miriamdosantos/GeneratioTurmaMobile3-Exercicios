
    fun main() {
        var media3=0
        var soma =0
        var qt =0
        do {
            println("Digite numero")
            val num = readln().toInt()
            qt++
            if (num %3 ==0){
                soma +=num
                media3=soma/qt
            }
        }while (num!=0)
        println("A media dos numeros multiplos de 3 : $media3")
    }
