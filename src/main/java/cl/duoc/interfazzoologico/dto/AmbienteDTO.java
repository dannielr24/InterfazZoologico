package cl.duoc.interfazzoologico.dto;

import java.time.LocalDate;
import java.time.Month;


public class AmbienteDTO {
    private String nombreJaula;
    private String descripcion;
    private String sector;
    private LocalDate fechaMantenimiento;
    private String ecoSistema;

    public AmbienteDTO(String nombreJaula, String descripcion, String sector, LocalDate fechaMantenimiento, String ecoSistema) {
        this.nombreJaula = nombreJaula;
        this.descripcion = descripcion;
        this.sector = sector;
        this.fechaMantenimiento = fechaMantenimiento;
        this.ecoSistema = ecoSistema;
    }
    
    public AmbienteDTO() {
        this.nombreJaula = "";
        this.descripcion = "";
        this.sector = "";
        this.fechaMantenimiento = LocalDate.of(2024, 2,25);
        this.ecoSistema = "";
    }

    public String getNombreJaula() {
        return nombreJaula;
    }

    public void setNombreJaula(String nombreJaula) {
        this.nombreJaula = nombreJaula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public LocalDate getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(LocalDate fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public String getEcoSistema() {
        return ecoSistema;
    }

    public void setEcoSistema(String ecoSistema) {
        this.ecoSistema = ecoSistema;
    }

    @Override
    public String toString() {
        return "AmbienteDTO{" + "nombreJaula=" + nombreJaula + ", descripcion=" + descripcion + ", sector=" + sector + ", fechaMantenimiento=" + fechaMantenimiento + ", ecoSistema=" + ecoSistema + '}';
    }
    
    
    
    
}
