public class Time {
    private String nome;
    private int pontos;

    //setters e getters iriam aqui. Omiti por simplicidade

    void adicionaPontos(int pontos){
        this.pontos += pontos;
    }

    void mostrarDados(){
        System.out.println("Nome do time: " + nome);
        System.out.println("Pontuação: " + pontos + " pontos");
    }
}


