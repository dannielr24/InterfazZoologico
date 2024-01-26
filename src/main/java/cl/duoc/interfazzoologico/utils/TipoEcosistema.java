package cl.duoc.interfazzoologico.utils;


public enum TipoEcosistema {
    ARIDO("Árido"),
    TROPICAL("Tropical"),
    SELVA("Selva"),
    OTRO("Otro");
    
    private final String descripcion;
    
    TipoEcosistema(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
}
