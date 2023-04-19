// Este programa tem como objetivo testar a igualdade entre duas Strings utilizando o operador de igualdade (==).
// No entanto, a comparação utilizando o operador de igualdade (==) retorna "false", mesmo que as Strings tenham o mesmo valor, 
// porque foram criados dois objetos diferentes na memória utilizando o construtor "new String()".
class TesteIgualdade {

    public static void main(String args[]) {
        String frasel;
        String frase2;
        frasel = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");
        System.out.println( "Frase 1: "+frasel);
        System.out.println( "Frase 2: "+frase2);
        System.out.println( "Frase 1 e Frase 2 são iguais? R: "+(frasel ==frase2));
    }
}