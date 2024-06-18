package Iphone.src.aparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("VOCÊ ESTÁ LIGANDO PARA " + numero);
    }

    public void atender() {
        System.out.println("VOCÊ ATENDEU UMA LIGAÇÃO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("VOCE TEM 5 MENSAGENS NO CORREIO DE VOZ");
    }
    
}
