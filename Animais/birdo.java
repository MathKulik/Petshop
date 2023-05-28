package Classe_n_exe;

public class birdo extends Animais {
    static int numeroDePassaros;

    public birdo(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }
    @Override
    public void soar() {
        System.out.println("Piu Piu");
}
}
