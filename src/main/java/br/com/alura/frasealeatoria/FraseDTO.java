package br.com.alura.frasealeatoria;

public record FraseDTO(
        String titulo,
        String frase,
        String personagem,
        String poster) {

    public FraseDTO(Frase frase) {
        this(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
