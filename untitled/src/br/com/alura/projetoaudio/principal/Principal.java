package br.com.alura.projetoaudio.principal;

import br.com.alura.projetoaudio.modelos.principal.MinhasPreferidas;
import br.com.alura.projetoaudio.modelos.principal.Musica;
import br.com.alura.projetoaudio.modelos.principal.Podcast;

public class Principal {
    static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Amanhecer");
        minhaMusica.setCantor("BK");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
            
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Mustang");
        meuPodcast.setApresentador("eu mesmo");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();

        }


        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
