import Classe_n_exe.Animais;
import Classe_n_exe.birdo;
import Classe_n_exe.cato;
import Classe_n_exe.dog;
import Lojas.Petshop;

public class Main {

    public static void main(String[] args) {

//        dog cachorro = new dog(); // define a classe, da a variavel de referencia e cria um novo objeto

//        criação de um cachorro longa
//        cachorro.setNome("Rocky");
//        cachorro.setCor("Preto e Marrom");
//        cachorro.setAltura(25);
//        cachorro.setPeso(10.6);
//        cachorro.setTamanhoDoRabo(5);

//        System.out.println(cachorro);
//        Brincar com o dog
//        cachorro.latir();
//        System.out.println("O cachorro pegou uma " + cachorro.pegar());
//        System.out.println("O cachorro está" + cachorro.interagir("carinho"));

//        dog cachorro1 = new dog("Rocky", "Preto e Marrom", 25, 10.6, 5, "carinho");
//
//        System.out.println(cachorro1.getNome());
//        System.out.println(cachorro1.getCor());
//        System.out.println(cachorro1.getPeso());
//

          dog cachorro1 = new dog("Rocky", "Preto e Branco", 25, 10.6, 5, "carinho");
          cato gato = new cato("Gato", "Cinza", 4.5);
          //Animais gato1 = new birdo("Cala", "Branco", 4.5);
          //Animais gato2 = new cato("Rosalina", "Preto e Branco", 4.5);
          birdo passaro = new birdo("Josias", "Branco", 0.5);

//          cachorro1.soar();
//          gato.soar();
//          passaro.soar();


        //Polimorfismo: a capacidade de um objeto de ser referenciado de varias formas
          Petshop petshop = new Petshop();

          petshop.darBanho(cachorro1);
            System.out.println(cachorro1.getEstadoDeEspito());
          petshop.darBanho(passaro);
            System.out.println(passaro.getEstadoDeEspirito());
          petshop.tosar(gato);
            System.out.println(gato.getEstadoDeEspirito());





    }
}