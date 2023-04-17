public class Lampada {
    private String marca;
    private double preco;
    private boolean ligada;

    //setters e getters iriam aqui. Omiti por simplicidade

    public void ligar() {
        if (!ligada) {
            System.out.println("Ligando a lâmpada.");
            ligada = true;
        } else {
            System.out.println("A lâmpada já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            System.out.println("Desligando a lâmpada.");
            ligada = false;
        } else {
            System.out.println("A lâmpada já está desligada.");
        }
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Status: " + (ligada ? "Ligada" : "Desligada"));
    }


}
