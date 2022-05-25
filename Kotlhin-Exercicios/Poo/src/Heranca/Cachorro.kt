package Heranca

class Cachorro(nome: String, idade: Int) :Animal(nome, idade) {
    override fun emetindoSom() {
        println("Cachorro latindo : Au au")
    }

    override fun deslocamento() {
       println("Cachorro correndo rapido")
    }

}