package cl.duoc.interfazzoologico.service;

import cl.duoc.interfazzoologico.dto.AmbienteDTO;
import cl.duoc.interfazzoologico.dto.AnimalDTO;
import cl.duoc.interfazzoologico.dto.EntradaDTO;
import cl.duoc.interfazzoologico.dto.VisitanteDTO;
import java.util.ArrayList;
import java.util.List;


public class ZoologicoService implements IZoologicoService{
    private List<VisitanteDTO> listaVisitantes = new ArrayList<>();
    private List<AmbienteDTO> listaAmbiente = new ArrayList<>();
    private List<AnimalDTO> listaAnimal = new ArrayList<>();
    private List<EntradaDTO> listaEntrada = new ArrayList<>();

    @Override
    public void registrarVisitante(VisitanteDTO visitante) {
        if(validarVisitante(visitante)){
            System.out.println("Registrando Visistante: " + visitante.getnombreCompleto());
            listaVisitantes.add(visitante);
        }else{
            System.out.println("Error al registrar el visitante. Datos inválidos.");
    }
    }

    @Override
    public void registrarAmbiente(AmbienteDTO ambiente) {
        System.out.println("Registrando Ambiente: " + ambiente.getNombreJaula());
        listaAmbiente.add(ambiente);
    }

    @Override
    public void registrarAnimal(AnimalDTO animal) {
        System.out.println("Registrando Animal: " + animal.getNombre());
        listaAnimal.add(animal);
    }

    @Override
    public void registrarEntrada(EntradaDTO entrada) {
        System.out.println("Registrando Entrada Para: " + entrada.getVisitante().getnombreCompleto());
        listaEntrada.add(entrada);
    }

    @Override
    public List<VisitanteDTO> obtenerTodosLosVisitantes() {
        return listaVisitantes;
    }

    @Override
    public List<AnimalDTO> obtenerTodosLosAnimales() {
        return listaAnimal;
    }

    @Override
    public List<AmbienteDTO> obtenerTodosLosAmbientes() {
        return listaAmbiente;
    }

    @Override
    public void generarInformacionMantenimiento(AmbienteDTO ambiente) {
        System.out.println("Generando información de mantenimiento para el ambiente: " + ambiente.getNombreJaula());
    }

    @Override
    public void actualizarInformacionVisitante(VisitanteDTO visitante) {
        System.out.println("Actualizando información del viitante: " + visitante.getnombreCompleto());
    }

    @Override
    public void eliminarAnimalDeAmbiente(AnimalDTO animal) {
        System.out.println("Eliminando animal del ambiente: " + animal.getNombre());
    }

    @Override
    public double calcularIngresosTotales() {
        double totalIngresos = 0.0;
        for(EntradaDTO entrada : listaEntrada){
            totalIngresos += entrada.getValor();
        }
        return totalIngresos;
    }

    @Override
    public void analizarDistribucionesEdades() {
        System.out.println("Analizando distribuciones de edades: ");
    }

    @Override
    public int contarAnimalesEnAmbiente(AmbienteDTO ambiente) {
        System.out.println("Contando animales en el ambiente: " + ambiente.getNombreJaula());
        return 0;
    }

    private boolean validarVisitante(VisitanteDTO visitante) {
        if(visitante != null){
            if(visitante.getRut() == null || visitante.getRut().isEmpty()){
                System.out.println("Error: El RUT del visitante es inválido. ");
                return false;
            }
            if(visitante.getEdad() <= 0){
                System.out.println("Error: La edad del visitante debe ser positiva.");
                return false;
            }
            return true;
        }else{
            System.out.println("Error: El visitante es nulo.");
            return false;
        }
    }
    
}

    
