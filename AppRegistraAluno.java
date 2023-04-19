public class AppRegistraAluno { 
    public static void main(String args[]){

        //cria 3 objetos RegistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();

        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva"); 
        carlos.setNome("Carlos Alberto");

        System.out.println(ana.getNome());

        System.out.println("Contador: "+RegistraAluno.getQuantidadeAlunos());
    }
}
// a Saída do console será:
// Ana Machado
// Contador: 0

// O contador permanece em 0, pois não havia instrução de atualizar o contador no código