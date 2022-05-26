package calculadoraTest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{
    @Test
    fun somaIntTest() {
        assertEquals(2, Calculadora.soma(1,1))
    }
    @Test
    fun somaDoubleTest(){
        assertEquals(5, Calculadora.soma(2.5,2.5))
    }
    @Test
    fun multiTest (){
        assertEquals(4,Calculadora.mult() )

    }
    @Test
    fun diviTest (){
        assertEquals(8, Calculadora.divisao(4.0,2.0))
    }
    @Test
    fun raizTest (){
        assertEquals(5, Calculadora.raiz(25.00))
    }
    @Test
    fun potenciaTest (){
        assertEquals(4, Calculadora.potencia(2.0,2.0))
    }
}

