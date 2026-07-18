package ar.edu.unahur.obj2.embalses.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.embalses.Embalse;

public class InyeccionTest {
    Embalse e1;
    Inyeccion in;

    @BeforeEach
    void setUp(){
        e1 = new Embalse("e1", 20);
        in = new Inyeccion(e1, 20);
        
    }

    @Test
    void dadoUnEmbalseDe20hSeInyectan20YEnTotalHayUnVolumenDe40() {
        in.ejecutar();
        assertEquals(40, e1.getVolumen());
    }
}
