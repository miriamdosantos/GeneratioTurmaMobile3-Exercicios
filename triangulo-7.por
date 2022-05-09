programa
{
	
	funcao inicio()
	{
		inteiro base
		inteiro altura
		inteiro area
		escreva ( "Digita base do triangulo:")
		leia (base)
		escreva ("digita altura do triangulo:")
		leia (altura)
		se ( base > 0 e altura > 0){
			escreva ("Numeros validos")
			area = base*altura
			escreva ( "A area do triangulo : ", area)
		}senao{
				escreva( " Numero invalido, favor digitar um numero positivo ( maiores que zero")
				
			}
		}
}
	


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */