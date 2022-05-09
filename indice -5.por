programa
{
	
	funcao inicio()
	{
		real indice 
		escreva ( " Qual foi o indice medido")
		leia (indice)
		 se (indice <0.3){
		 	escreva (" Indice poluicao aceitavel")
		  } senao se ( indice >=0.3 e indice < 0.4){
		  	escreva (" Industrias do 1 grupo sao initidas a suspedenderem suas atividades")
		  } senao se ( indice >= 0.4 e indice <0.5){
		  escreva ( "industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades")
		 }senao se ( indice >= 0.5){
		 	escreva ("todos os grupos devem ser notificados a paralisarem suas atividades.")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */