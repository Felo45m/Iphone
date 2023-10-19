package application;

import metodos.iPhone;

public class Application {
	
	public static void main(String[] args) {
        iPhone iPhone = new iPhone();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Nome da Música");
        iPhone.ligar("83988629272");;
        iPhone.atender();
        iPhone.iniciarConversaVoz();
        iPhone.exibirPagina("www.exemplo.com");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }

}
