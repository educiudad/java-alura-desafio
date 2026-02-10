package br.com.eu.campeonatofutebol;

import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Time> times;

    public Campeonato(){
        this.times = new ArrayList<>();
    }

    public void adicionarTime(Time time){
        times.add(time);
    }

    public void listarTimes(){
        for(Time time : times){
            System.out.println(time.getNome());
        }
    }
}
