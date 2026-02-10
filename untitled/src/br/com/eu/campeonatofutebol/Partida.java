package br.com.eu.campeonatofutebol;

public class Partida {


    private Time timeCasa;
    private Time timeFora;

    private int golsCasa;
    private int golsFora;

    public Partida(Time timeCasa, Time timeFora) {
        this.timeCasa = timeCasa;
        this.timeFora = timeFora;
    }

    public void jogar(int golsCasa, int golsFora) {
        this.golsCasa = golsCasa;
        this.golsFora = golsFora;

        atualizarGolsDosTimes();
        decidirResultado();
    }



    private void atualizarGolsDosTimes() {
        timeCasa.adicionarGolsFeitos(golsCasa);
        timeCasa.adicionarGolsSofridos(golsFora);

        timeFora.adicionarGolsFeitos(golsFora);
        timeFora.adicionarGolsSofridos(golsCasa);
    }

    private void decidirResultado() {
        if (golsCasa > golsFora) {
            timeCasa.adicionarPontos(3);
        } else if (golsFora > golsCasa) {
            timeFora.adicionarPontos(3);
        } else {
            timeCasa.adicionarPontos(1);
            timeFora.adicionarPontos(1);
        }

    }
}
