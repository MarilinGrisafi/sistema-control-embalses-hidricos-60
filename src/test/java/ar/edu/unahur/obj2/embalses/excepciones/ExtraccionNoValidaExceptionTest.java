package ar.edu.unahur.obj2.embalses.excepciones;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.embalses.Embalse;
import ar.edu.unahur.obj2.embalses.command.Extraccion;

public class ExtraccionNoValidaExceptionTest {
    @Test
public void noSePuedeExtraerSiElSaldoQuedaMenorAMenosCincuenta() {

    Embalse embalse = new Embalse("e1", 20);

    Extraccion extraccion = new Extraccion(embalse, 80);

    assertThrows(ExtraccionNoValidaException.class, () -> {
        extraccion.ejecutar();
    });
}
}
