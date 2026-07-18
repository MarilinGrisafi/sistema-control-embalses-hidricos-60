package ar.edu.unahur.obj2.embalses.command;

import ar.edu.unahur.obj2.embalses.excepciones.ExtraccionNoValidaException;

public class Invoker {

    public void ejecutar(Operacion operacion)
            throws ExtraccionNoValidaException {

        operacion.ejecutar();
    }
}

