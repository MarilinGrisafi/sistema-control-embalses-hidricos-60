package ar.edu.unahur.obj2.embalses.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.embalses.Embalse;
import ar.edu.unahur.obj2.embalses.excepciones.ExtraccionNoValidaException;

public class ExtraccionTest {
    Embalse e1;
    Extraccion ex;

    @BeforeEach
    void setUp(){
        e1 = new Embalse("e1", 20);
        ex = new Extraccion(e1, 20);
        
    }

    @Test
    void dadoUnEmbalseDe20hSeExtraen20YEnTotalHayUnVolumenDe0() throws ExtraccionNoValidaException {
        ex.ejecutar();
        assertEquals(0, e1.getVolumen());
    }
}
