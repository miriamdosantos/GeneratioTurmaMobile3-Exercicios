programa
{
	
	funcao inicio()
	{
	    inteiro num = 0
	    real soma = 0.0
	    real media = 0.0
	    real totalNum =0.0
	    
	    enquanto (num >=0){
	    	escreva("Digite numero:")
		leia (num)
		 soma += num
		 totalNum += num
		 media = soma / totalNum
	      se(num <0){
	      	escreva ("\n Voce saiu do program, Digite um numero positivo")
	      }
	      
	    }
	   escreva( " A soma dos numeros digitados: ", soma, " " , "media : ", media)
	    
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */