package ar.edu.unahur.obj2.embalses;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.embalses.observer.Observer;

public class Embalse {

    //observado
    private String id;
    private Integer volumen;
    private List<Observer>observadores = new ArrayList<>();

    public String getId() {
        return id;
    }
    public Integer getVolumen() {
        return volumen;
    }

    public void extraer(Integer agua){
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
