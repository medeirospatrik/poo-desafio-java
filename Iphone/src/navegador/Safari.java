package Iphone.src.navegador;

public class Safari implements NavegadorNaInternt  {
    public void exibirPagina(String url) {
        System.out.println("VOCE ESTA NA PAGINA " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("VOCE ABRIU UMA NOVA ABA");
    }

    public void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA");
    }

};