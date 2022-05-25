package Heranca

class Cavalo(nome: String, idade: Int) :Animal (nome, idade){
    override fun emetindoSom() {
        println("Cavalo rinchando : iiiihii")
    }

    override fun deslocamento() {
        println("Cavalo correndo galopando")
    }
}