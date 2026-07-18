package ar.edu.unahur.obj2.embalses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.embalses.excepciones.ExtraccionNoValidaException;
import ar.edu.unahur.obj2.embalses.observer.AlarmaSequia;

public class EmbalseTest {

    Embalse em;
    AlarmaSequia as = new AlarmaSequia();

    @BeforeEach
    void setUp(){
        em = new Embalse("em", 70);
    }
    @Test
    void dadoQueSeAgreganDosObservadoresALaListaSeConstataQueElTamanioDeLaListaEsDe2() {
        em.agregarObservador(as);
        em.agregarObservador(as);
        assertEquals(2, em.getObservadores().size());

    }

    @Test
    void dadoQueSeAgregan2ObservadoresYSeElimina1LaListaTieneUnoEnTotal() {
        em.agregarObservador(as);
        em.agregarObservador(as);
        em.eliminarObservador(as);

        assertEquals(1, em.getObservadores().size());

    }

    @Test
    void dadoUnVolumen70SeExtrae80YQuedaENMenos10() throws ExtraccionNoValidaException {
        em.extraer(80);
        assertEquals(-10, em.getVolumen());
    }

    @Test
    void testGetId() {
        assertEquals("em", em.getId());
    }


    @Test
    void dadoUnVolumen70SeAgrega30YQueda100() {
        em.inyectar(30);
        assertEquals(100, em.getVolumen());

    }

    
}
