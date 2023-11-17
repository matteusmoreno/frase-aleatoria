package br.com.alura.frasealeatoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    private final FraseRepository fraseRepository;
    @Autowired
    public FraseService(FraseRepository fraseRepository) {
        this.fraseRepository = fraseRepository;
    }

    public FraseDTO devolveFrase() {
        Frase frase = fraseRepository.pegaFraseAleatoria();
        return new FraseDTO(frase);
    }
}
