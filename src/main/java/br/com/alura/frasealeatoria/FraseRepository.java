package br.com.alura.frasealeatoria;

import br.com.alura.frasealeatoria.domain.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f ORDER BY RAND() LIMIT 1")
    Frase pegaFraseAleatoria();

}
