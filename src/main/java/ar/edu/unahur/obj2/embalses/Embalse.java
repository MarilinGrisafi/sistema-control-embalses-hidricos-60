package ar.edu.unahur.obj2.embalses;

public class Embalse {

    private String id;
    private Integer volumen;

    public String getId() {
        return id;
    }
    public Integer getVolumen() {
        return volumen;
    }

    public void extraer(Integer agua){
        volumen -= agua;
    }

    public void inyectar(Integer agua){
        volumen += agua;
    }

    
}
