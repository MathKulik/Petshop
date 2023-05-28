package Lojas;

import Classe_n_exe.Animais;
import Classe_n_exe.cato;

public class Petshop {
    public void darBanho(Animais animal){
        animal.setEstadoDeEspirito("Limpo");
    }
    public void tosar(cato gato){
        gato.setEstadoDeEspirito("tosado");
    }
    public void deixaNoHotel(Animais animal){
        animal.setEstadoDeEspirito("Saudades");
    }
}
