# Desafio-Java
Pequenos projetos em Java

Desafio proposto pela Capgemini com tres questões distintas.

Projetos todos desenvolvidos em Java utilizando Spring Tools 4 para Eclipse

# Questão 01
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere *
e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter
nenhum espaço.

	Foi utilizado o ArrayList, pois a cada repetição ele adiciona uma String, também foi utilizado Java.util.List junto com o Java.util.Scanner para imprimir o que a questão 1 está pedindo.

	System.out.print("Se, N é para 6, então digite 1:");
		int qtdDegraus = entrada.nextInt();

		clico em run e é imprimido na tela a seguinte frase "Se, N é para 6, então digite 1: 1"


		*
		**
		***
		****
		*****
		******







# Questão 02
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma
senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

	Foi utilizado Java.util.Scanner para imprimir na tela, também o método match que retorna true ou false

	Clicar em run ele vai imprimir na tela

	"Nome" ao digitar o nome e dar enter, ele vai imprimir na tela "senha", ao digitar a senha ele retorna "3false" se a senha for menor que 6 ou "true"  se for igual ou maior que 6.



	Nome
	Debora
	Senha
	Ya3
	3false



	Nome
	Debora
	Senha
	Ya3&ab
	true





	# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.


		utilizado javax.swing.JOptionPane para criar uma caixa de diálogo e também vetores.


		Ao clicar em run aparecerá uma caixa de diálogo "Digite uma palavra de no mínimo 3 caracteres", ao digitar a palavra "ovo" e clicar em ok.


		impressão na tela:

		o v o 
		o o v 
		v o o 
		v o o 
		o v o 
		o o v 


