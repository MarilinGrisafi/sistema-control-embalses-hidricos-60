package ar.edu.unahur.obj2.embalses.command;

public class Extraccion extends Operacion{

    @Override
    public void ejecutar() {
        embalse.inyectar(agua);
    }
}
