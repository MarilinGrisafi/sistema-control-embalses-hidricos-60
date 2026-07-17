package ar.edu.unahur.obj2.embalses.command;

import ar.edu.unahur.obj2.embalses.Embalse;

public abstract class Operacion {

    protected Embalse embalse;
    protected Integer agua;


    public abstract void ejecutar();

}
