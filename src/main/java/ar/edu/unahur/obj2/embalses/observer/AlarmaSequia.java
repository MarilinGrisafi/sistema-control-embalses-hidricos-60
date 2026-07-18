package ar.edu.unahur.obj2.embalses.observer;

import ar.edu.unahur.obj2.embalses.Embalse;

public class AlarmaSequia implements Observer{

    @Override
    public void actualizar(Embalse embalse) {
        if (embalse.getVolumen()< 0){
            throw new IllegalArgumentException("El embalse tiene saldo negativo.");
    }

    }
}
