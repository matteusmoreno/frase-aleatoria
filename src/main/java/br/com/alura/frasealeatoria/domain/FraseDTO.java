package br.com.alura.frasealeatoria.domain;

import br.com.alura.frasealeatoria.domain.Frase;

public record FraseDTO(
        String titulo,
        String frase,
        String personagem,
        String poster) {

    public FraseDTO(Frase frase) {
        this(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
