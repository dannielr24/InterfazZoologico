package cl.duoc.interfazzoologico.dto;

import java.time.LocalDate;
import java.time.Month;

public class EntradaDTO {
    private int codigoEntrada;
    private VisitanteDTO visitante;
    private String tipoEntrada;
    private LocalDate fecha;
    private double valor;
    private boolean incluyeColacion;

    public EntradaDTO(int codigoEntrada, VisitanteDTO visitante, String tipoEntrada, LocalDate fecha, double valor, boolean incluyeColacion) {
        this.codigoEntrada = codigoEntrada;
        this.visitante = visitante;
        this.tipoEntrada = tipoEntrada;
        this.fecha = fecha;
        this.valor = valor;
        this.incluyeColacion = incluyeColacion;
    }
    
    public EntradaDTO() {
        this.codigoEntrada = 0;
        this.visitante = new VisitanteDTO();
        this.tipoEntrada = "";
        this.fecha = LocalDate.now();
        this.valor = 0.0;
        this.incluyeColacion = false;
    }

    public int getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(int codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public VisitanteDTO getVisitante() {
        return visitante;
    }

    public void setVisitante(VisitanteDTO visitante) {
        this.visitante = visitante;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isIncluyeColacion() {
        return incluyeColacion;
    }

    public void setIncluyeColacion(boolean incluyeColacion) {
        this.incluyeColacion = incluyeColacion;
    }

    @Override
    public String toString() {
        return "EntradaDTO{" + "codigoEntrada=" + codigoEntrada + ", visitante=" + visitante + ", tipoEntrada=" + tipoEntrada + ", fecha=" + fecha + ", valor=" + valor + ", incluyeColacion=" + incluyeColacion + '}';
    }
    
    
    
    
}
