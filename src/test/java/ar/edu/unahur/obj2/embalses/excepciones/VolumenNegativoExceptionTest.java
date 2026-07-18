package ar.edu.unahur.obj2.embalses.excepciones;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.embalses.Embalse;
import ar.edu.unahur.obj2.embalses.command.Inyeccion;

public class VolumenNegativoExceptionTest {
    
@Test
public void noSePuedeCrearUnaOperacionConaaguaMenoroIgulaACero() {

    Embalse embalse = new Embalse("e1", 100);

    assertThrows(VolumenNegativoException.class, () -> {
        new Inyeccion(embalse, 0);
    });
    }
    }
