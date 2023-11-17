package br.com.alura.frasealeatoria;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    private final FraseService fraseService;

    public FraseController(FraseService fraseService) {
        this.fraseService = fraseService;
    }

    @GetMapping("/frases")
    public ResponseEntity<FraseDTO> devolveFrase() {
        FraseDTO frase = fraseService.devolveFrase();
        return ResponseEntity.ok(frase);
    }
}
