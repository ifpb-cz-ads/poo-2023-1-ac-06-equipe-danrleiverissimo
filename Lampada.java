public class Lampada {
    private String marca;
    private double preco;
    private int estoque;

    //setters e getters iriam aqui. Omiti por simplicidade

    public void addEstoque(int estoque) {
        this.estoque += estoque;
    }

    public void rmEstoque(int estoque) {
        this.estoque -= estoque;
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque: " + estoque + "unidades");
    }


}
