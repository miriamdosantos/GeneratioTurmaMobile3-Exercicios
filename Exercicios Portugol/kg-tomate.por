programa
{
	
	funcao inicio()
	{
		real peso 
		real pesoEstado = 50.00
		real excesso= 0.00
		real multa = 0.00
		escreva ("qual o kg do tomate")
		leia(peso)
		
		se( peso > pesoEstado){
		excesso = peso - pesoEstado
		multa = 4.00 * excesso
		escreva ("Sua multa foi de RS: ", multa, "e o excesso em kg: " , excesso)
		}senao{
			
			escreva ("Multa:", multa, "excesso : ", excesso)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */