package Iphone.src.ReprodutorMusical;


public class Iphod implements ReprodutorMusical {
    public void tocar() {
        System.out.println("IPHONE ESTA TOCANDO MUSICA");
    }

    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    public void selecionarMusica(String musica) {
        System.out.println("VOCÊ ESTA ESCUTANDO " + musica);
    }
    
}
