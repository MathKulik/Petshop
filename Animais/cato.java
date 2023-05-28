package Classe_n_exe;

public class cato extends Animais{
    static int numeroDeGatos;


    public cato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }
    @Override
    public void soar() {
        System.out.println("Miau Miau");
}
}
