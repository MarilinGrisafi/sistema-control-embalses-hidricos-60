package ar.edu.unahur.obj2.embalses.command;

import ar.edu.unahur.obj2.embalses.Embalse;
import ar.edu.unahur.obj2.embalses.excepciones.ExtraccionNoValidaException;

public abstract class Operacion {

    protected Embalse embalse;
    protected Integer agua;


    
    public Operacion(Embalse embalse, Integer agua) {
        this.embalse = embalse;
        this.agua = agua;
    }



    public abstract void ejecutar() throws ExtraccionNoValidaException;

}
