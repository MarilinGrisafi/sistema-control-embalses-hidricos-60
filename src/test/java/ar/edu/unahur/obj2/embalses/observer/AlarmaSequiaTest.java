package ar.edu.unahur.obj2.embalses.observer;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.embalses.Embalse;

public class AlarmaSequiaTest {
    @Test
    void alarmaSequiaLanzaExcepcionCuandoElEmbalseTieneSaldoNegativo() {

        Embalse embalse = new Embalse("E1", -10);
        AlarmaSequia alarma = new AlarmaSequia();

        assertThrows(IllegalArgumentException.class, () -> {
            alarma.actualizar(embalse);
        });
    }
}
