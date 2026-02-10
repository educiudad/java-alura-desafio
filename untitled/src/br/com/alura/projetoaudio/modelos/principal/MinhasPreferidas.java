package br.com.alura.projetoaudio.modelos.principal;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 7){
            System.out.println(audio.getTitulo() + " é cosiderado um sucesso absoluto");
        } else {
            System.out.println(" é uma escelente opcao para quem que ouvi daqu a pouco");
        }
    }
}
