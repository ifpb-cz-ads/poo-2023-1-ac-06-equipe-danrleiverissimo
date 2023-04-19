public class Time {
    private String nome;
    private int pontos;
    public int colocacao;
    //suponho que a lógica para alterar a colocação do time seja feita em outra classe

    //setters e getters iriam aqui. Omiti por simplicidade

    void adicionaPontos(int pontos){
        this.pontos += pontos;
    }

    void mostrarDados(){
        System.out.println("Nome do time: " + nome);
        System.out.println("Pontuação: " + pontos + " pontos");
        System.out.println("Colocação atual: " + colocacao);
    }
}


