## Atividade 6
### Questão 1
Escreva um modelo para representar uma lâmpada que está à venda em um supermercado. Que dados devem ser representados por esse modelo?
|Lâmpada		|      
|:-------------|
|String marca	|
|double preço	|
|boolean estaLigada|
|ligar()		|
|desligar()		|
|mostrarDados()	|
### Questão 2
Crie um modelo para representar um time de um esporte qualquer em um campeonato desse esporte. Que dados e operações esse modelo deve ter?
|Time		|      
|:-------------|
|String nome	|
|int pontos		|
|int colocacao	|
|adicionaPontos()|
|mostrarDados()	|
### Questão 3
A questão pede para modificar o modelo que está em pseudocódigo, então decidi deixar em pseudocódigo.
```java
operação  mostraDados()
início
	imprime "o nome do correntista é ";
	imprime nomeDoCorrentista;
	imprime "O saldo é ";
	imprime saldo;
	se (contaÉEspecial)
		imprime "A conta é especial.";
		se (saldo <  0)
			imprime "Alerta: saldo negativo.";
	senão
	imprime "A conta é comum.";
fim
```
### Questão 6
```java
void  abreContaSimples(String  nome){
	nomeDoCorrentista =  nome;
	saldo =  100.0;
	//modificando o saldo default de 0 para 100
	contaEspecial =  false;
}
```
### Questão 7
Identifique e explique o(s) erro(s) na classe abaixo:
```java
class Registro De Eleitor{ 
	int tituloDeEleitor;
	String nome; // nome do eleitor 
	short zonaEleitoral; // número da zona eleitoral
}
```
O nome da classe está separado por espaços: `class Registro De Eleitor`. Além disso, a classe em questão não apresenta a declaração dos modificadores de acesso, bem como a definição de construtores e métodos.
### Questão 8
Identifique e explique o(s) erro(s) na classe abaixo:
```java
class Teste2{  
	int num1,num2;
	int maior(){
		if (num1 > num2)
			return true;
		else 
			return false;
	}
	void menor(){
		if (num1 < num2) 
			return num1;
		else
			return num2;
	}
}
```
O método `maior()` está declarado como se retornasse int, e está retornando valores booleanos. <br> O método `menor()` está declarado como void, e não deveria retornar valor.
### Questão 9
Identifique e explique o(s) erro(s) na classe abaixo:
```java
class  TesteImpressao{
	main(String[] args){
		System.out.println(“7+2=”+(7+2));
		System.out.println(“7-2=”+(7-2));
		System.out.println(“7*2=”+(7*2));
		System.out.println(“7/2=”+(7/2));
	return  true;
	}
}
```
A declaração do método main() precisa necessariamente ser `public static void main(String[] args)`. <br> As aspas usadas nos `System.out.println()` “” não são aspas simples "" e o conteúdo entre elas não é reconhecido como string pelo compilador. <br> A divisão 7/2 está desconsiderando a parte decimal do resultado devido às partes serem inteiras. É necessário pelo menos um dos operandos da divisão ser do tipo float ou double.