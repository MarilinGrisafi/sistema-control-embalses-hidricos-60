package ar.edu.unahur.obj2.embalses.command;

import ar.edu.unahur.obj2.embalses.Embalse;

public class Inyeccion extends Operacion{


    public Inyeccion(Embalse embalse, Integer agua) {
        super(embalse, agua);
    }

    @Override
    public void ejecutar() {
        embalse.inyectar(agua);
    }

}
