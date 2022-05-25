package Heranca

class Preguica(nome: String, idade: Int) : Animal(nome, idade) {
    override fun emetindoSom() {
        println("Preguica emitindo som: zzzz")
    }

    override fun deslocamento() {
        println("Preguica, andando devagar")
    }
    fun subindoArvore (){
        println("Preguica subindo arvore")
    }
}