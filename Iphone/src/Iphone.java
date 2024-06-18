package Iphone.src;

import Iphone.src.ReprodutorMusical.Iphod;
import Iphone.src.ReprodutorMusical.ReprodutorMusical;
import Iphone.src.aparelhoTelefonico.AparelhoTelefonico;
import Iphone.src.aparelhoTelefonico.Telefone;
import Iphone.src.navegador.NavegadorNaInternt;
import Iphone.src.navegador.Safari;

public class Iphone {
    public static void main(String[] args) throws Exception {
        AparelhoTelefonico telefone = new Telefone();
        telefone.ligar("(21) 66mole666dura");

        NavegadorNaInternt safari = new Safari();
        safari.exibirPagina("https://github.com/medeirospatrik");
        ReprodutorMusical iphod = new Iphod();
        iphod.selecionarMusica("Californication");
    }
}
