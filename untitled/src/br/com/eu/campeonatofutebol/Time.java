package br.com.eu.campeonatofutebol;

public class Time {
    private String nome;
    private int pontos;
    private int golsFeitos;
    private int golsSofridos;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public int getGolsFeitos() {
        return golsFeitos;
    }

    public void setGolsFeitos(int golsFeitos) {
        this.golsFeitos = golsFeitos;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golSofridos) {
        this.golsSofridos = golSofridos;
    }







    public void adicionarGolsFeitos(int golsFeitos) {
        this.golsFeitos += golsFeitos;

    }

    public void adicionarGolsSofridos(int golsSofridos) {
        this.golsSofridos += golsSofridos;
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }
}
