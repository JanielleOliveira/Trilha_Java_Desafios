package interfaceAparelhoMultifuncional;

import aparelhoTelefonico.AparelhoTelefonico;
import iphone.Iphone;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class AparelhoMultifuncional {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        AparelhoTelefonico at = iphone;
        ReprodutorMusical rp = iphone;
        NavegadorInternet nv = iphone;


        System.out.println("*** PHONE ***");
        at.ligar(null);
        at.atender();
        at.iniciarCorreioVoz();
        System.out.println("\n");

        System.out.println("*** IPOD ***");
        rp.tocar();
        rp.pausar();
        rp.selecionarMusica(null);
        System.out.println("\n");

        System.out.println("*** SAFARI ***");
        nv.exibirPagina(null);
        nv.adicionarNovaAba();
        nv.atualizarPagina();

    }
}
