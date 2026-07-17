package ar.edu.unahur.obj2.embalses.command;


public class Inyeccion extends Operacion{


    @Override
    public void ejecutar() {
        embalse.inyectar(agua);
    }

}
