package br.com.eu.campeonatofutebol;

public class Principal {
    public static void main(String[] args) {

        Time flamengo = new Time();
        flamengo.setNome("Flamengo");

        Time palmeiras = new Time();
        palmeiras.setNome("Palmeiras");

        Partida partida = new Partida(flamengo, palmeiras);
        partida.jogar(2, 1);

        System.out.println(flamengo.getNome() + " - Pontos: " + flamengo.getPontos());
        System.out.println(palmeiras.getNome() + " - Pontos: " + palmeiras.getPontos());
    }
}
