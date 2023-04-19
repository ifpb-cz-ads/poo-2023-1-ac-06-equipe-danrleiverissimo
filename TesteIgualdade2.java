// Este programa é semelhante ao TesteIgualdade, porém ele atribui a variável "frase3" para "frase4".
// Isso faz com que ambas as variáveis apontem para o mesmo objeto na memória, o que é diferente do TesteIgualdade em que 
// duas Strings diferentes foram criadas com o mesmo valor.
// Ao comparar as variáveis "frase3" e "frase4" utilizando o operador de igualdade (==), o resultado é "true"
// porque elas compartilham a mesma referência na memória.
class TesteIgualdade2 {

    public static void main(String args[]){
        String frase3;
        String frase4;
        frase3 = new String("Testando igualdade!");
        frase4 = frase3;
        System.out.println( "Frase 3: "+frase3);
        System.out.println( "Frase 4: "+frase4);
        System.out.println( "Frase 3 e Frase 4 possuem a mesma referencia? R: "+(frase3==frase4));
    }
}