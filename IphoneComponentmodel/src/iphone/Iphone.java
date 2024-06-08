package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando via Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via Iphone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz via Iphone");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música via Iphone");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música via Iphone");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Música via Iphone");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página ");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");

    }
}
