package cl.duoc.interfazzoologico.dto;


public final class ElefanteDTO extends AnimalDTO{
    private double pesoTonelaje;

    public ElefanteDTO(double pesoTonelaje, int numeroRegistro, String nombre, int edad, String tipoClima, String descripcion) {
        super(numeroRegistro, nombre, edad, tipoClima, descripcion);
        this.pesoTonelaje = pesoTonelaje;
    }

    public ElefanteDTO(double pesoTonelaje) {
        super();
        this.pesoTonelaje = pesoTonelaje;
    }
    
    public ElefanteDTO() {
        super();
        this.pesoTonelaje = 0d;
    }

    public double getPesoTonelaje() {
        return pesoTonelaje;
    }

    public void setPesoTonelaje(double pesoTonelaje) {
        this.pesoTonelaje = pesoTonelaje;
    }

    @Override
    public String toString() {
        return "ElefanteDTO{" + "pesoTonelaje=" + pesoTonelaje + '}';
    }
    
    
    
    
}
