package ar.edu.unahur.obj2.embalses;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.embalses.excepciones.ExtraccionNoValidaException;
import ar.edu.unahur.obj2.embalses.excepciones.VolumenNegativoException;
import ar.edu.unahur.obj2.embalses.observer.Observer;

public class Embalse {

    //observado
    private String id;
    private Integer volumen;
    private List<Observer>observadores = new ArrayList<>();

    
    public Embalse(String id, Integer volumen) {
        if (volumen <=0){
            throw new VolumenNegativoException("El volumen no puede ser un valor negativo.");
        }
        this.id = id;
        this.volumen = volumen;
    }

    public String getId() {
        return id;
    }
    public Integer getVolumen() {
        return volumen;
    }

    public void extraer(Integer agua) throws ExtraccionNoValidaException{
        if (volumen - agua < -50){
            throw new ExtraccionNoValidaException("La extracción no puede dejar un saldo negativo mayor a -50");}
        volumen -= agua;
        this.notificar();
    }

    public void inyectar(Integer agua){
        volumen += agua;
        this.notificar();
    }

    public List<Observer> getObservadores() {
        return observadores;
    }

    public void agregarObservador(Observer obs){
        observadores.add(obs);
    }

    public void eliminarObservador(Observer obs){
        observadores.remove(obs);
    }
    
    public void notificar(){
        observadores.stream().forEach(o->o.actualizar());
    }
}
