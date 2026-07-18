package ar.edu.unahur.obj2.embalses.command;

import ar.edu.unahur.obj2.embalses.Embalse;
import ar.edu.unahur.obj2.embalses.excepciones.ExtraccionNoValidaException;

public class Extraccion extends Operacion{

    public Extraccion(Embalse embalse, Integer agua) {
        super(embalse, agua);
    }

    @Override
    public void ejecutar() throws ExtraccionNoValidaException {
       
        embalse.extraer(agua);
        
    }
}
