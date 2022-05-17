class Ex1 {

    fun main() {
        println("Digite 1 numero:")
        val num1 = readln().toInt()
        println("Digite o 2 numero:")
        val num2 = readln().toInt()
        println("Digite o 3 numero:")
        val num3 = readln().toInt()

        if (num1 > num2 && num1 > num3) {
            println("$num1 maior numero")

        } else if (num2 > num1 && num2 > num3) {
            println("$num2 maior numero")
        } else {
            // (num3 > num2 && num3 > num1){
            println("$num3 maior numero")
        }
    }
}
