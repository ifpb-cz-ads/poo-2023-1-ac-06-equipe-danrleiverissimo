// Este programa utiliza o método "equals()" para comparar o conteúdo de duas Strings. Ao contrário do operador de igualdade,
// que compara as referências de objetos na memória, o método "equals()" compara o conteúdo das Strings.
// O TesteIgualdade2 faz as duas Strings apontarem para o mesmo objeto na memória, enquanto o TesteIgualdade cria duas Strings diferentes
// com o mesmo conteúdo, o que pode causar confusão ao compará-las utilizando o operador de igualdade.
class TesteIgualdade3 {

    public static void main(String args[]) {
        String frasel;
        String frase2;
        frasel = new String("Testando igualdade!");
        frase2= new String("Testando igualdade!"); 
        System.out.println("Frase 1: "+frasel);
        System.out.println( "Frase 2: "+frase2);
        System.out.println( "Frase 1 e Frase 2 possuem o mesmo conteudo? R: "+(frasel.equals(frase2)));
    }
}