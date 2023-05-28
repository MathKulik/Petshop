package Classe_n_exe;


public class dog extends Animais {

    //Atributos

    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    //Construtores Adicionados

    public dog(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }

    //Metodos



    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspito() {
        return estadoDeEspirito;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        dog.numeroDeCachorros = numeroDeCachorros;
    }

    public String pegar(){
        return "Bolinha de golfe";
    }
    public String interagir(String acao){

        switch (acao){
            case "carinho": this.estadoDeEspirito = "Feliz"; break;
            case "Vai mimir": this.estadoDeEspirito = "A mimir"; break;
            case "Pisar na patinha": this.estadoDeEspirito = "AIN AIN"; break;
            default: this.estadoDeEspirito = "Neutro"; break;
        }
            return estadoDeEspirito;
    }

    @Override //pega um metodo q é do pai da classe e altera o resultado
    public String toString() {
        return "dog{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Au Au");
    }
}
