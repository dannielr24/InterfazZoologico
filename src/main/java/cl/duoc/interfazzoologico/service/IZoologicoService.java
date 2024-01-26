package cl.duoc.interfazzoologico.service;

import cl.duoc.interfazzoologico.dto.AmbienteDTO;
import cl.duoc.interfazzoologico.dto.AnimalDTO;
import cl.duoc.interfazzoologico.dto.EntradaDTO;
import cl.duoc.interfazzoologico.dto.VisitanteDTO;
import java.util.List;


public interface IZoologicoService {
    public void registrarVisitante(VisitanteDTO visitante);
    public void registrarAmbiente(AmbienteDTO ambiente);
    public void registrarAnimal(AnimalDTO animal);
    public void registrarEntrada(EntradaDTO entrada);
    
    public List<VisitanteDTO> obtenerTodosLosVisitantes();
    public List<AnimalDTO> obtenerTodosLosAnimales();
    public List<AmbienteDTO> obtenerTodosLosAmbientes();
    
    public void generarInformacionMantenimiento(AmbienteDTO ambiente);
    public void actualizarInformacionVisitante(VisitanteDTO visitante);
    public void eliminarAnimalDeAmbiente(AnimalDTO animal);
    
    double calcularIngresosTotales();
    void analizarDistribucionesEdades();
    int contarAnimalesEnAmbiente(AmbienteDTO ambiente);
    
    
    
}
