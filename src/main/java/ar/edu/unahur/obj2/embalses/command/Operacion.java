package ar.edu.unahur.obj2.embalses.command;

import ar.edu.unahur.obj2.embalses.Embalse;
import ar.edu.unahur.obj2.embalses.excepciones.ExtraccionNoValidaException;
import ar.edu.unahur.obj2.embalses.excepciones.VolumenNegativoException;

public abstract class Operacion {

    protected Embalse embalse;
    protected Integer agua;


    
    public Operacion(Embalse embalse, Integer agua) {
        if (agua<=0){
            throw new VolumenNegativoException("El volumen debe ser mayor a 0."); 
        }
            
        this.embalse = embalse;
        this.agua = agua;
    }



    public abstract void ejecutar() throws ExtraccionNoValidaException;

}
