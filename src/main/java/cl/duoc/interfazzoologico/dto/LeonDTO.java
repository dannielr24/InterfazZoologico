package cl.duoc.interfazzoologico.dto;

import java.time.LocalDate;
import java.time.Month;


public final class LeonDTO extends AnimalDTO{
    private LocalDate fechaProximaVisitaDentista;

    public LeonDTO(LocalDate fechaProximaVisitaDentista, int numeroRegistro, String nombre, int edad, String tipoClima, String descripcion) {
        super(numeroRegistro, nombre, edad, tipoClima, descripcion);
        this.fechaProximaVisitaDentista = fechaProximaVisitaDentista;
    }

    public LeonDTO(LocalDate fechaProximaVisitaDentista) {
        super();
        this.fechaProximaVisitaDentista = fechaProximaVisitaDentista;
    }
    
    public LeonDTO() {
        super();
        this.fechaProximaVisitaDentista = LocalDate.of(2024, 5, 25);
    }

    public LocalDate getFechaProximaVisitaDentista() {
        return fechaProximaVisitaDentista;
    }

    public void setFechaProximaVisitaDentista(LocalDate fechaProximaVisitaDentista) {
        this.fechaProximaVisitaDentista = fechaProximaVisitaDentista;
    }

    @Override
    public String toString() {
        return "LeonDTO{" + "fechaProximaVisitaDentista=" + fechaProximaVisitaDentista + '}';
    }
    
    
    
    
}
