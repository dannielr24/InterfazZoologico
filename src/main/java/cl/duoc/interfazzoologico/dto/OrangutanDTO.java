package cl.duoc.interfazzoologico.dto;


public final class OrangutanDTO extends AnimalDTO{
    private int mesesEnZoologico;

    public OrangutanDTO(int mesesEnZoologico, int numeroRegistro, String nombre, int edad, String tipoClima, String descripcion) {
        super(numeroRegistro, nombre, edad, tipoClima, descripcion);
        this.mesesEnZoologico = mesesEnZoologico;
    }

    public OrangutanDTO(int mesesEnZoologico) {
        super();
        this.mesesEnZoologico = mesesEnZoologico;
    }
    
    public OrangutanDTO() {
        super();
        this.mesesEnZoologico = 0;
    }

    public int getMesesEnZoologico() {
        return mesesEnZoologico;
    }

    public void setMesesEnZoologico(int mesesEnZoologico) {
        this.mesesEnZoologico = mesesEnZoologico;
    }

    @Override
    public String toString() {
        return "OrangutanDTO{" + "mesesEnZoologico=" + mesesEnZoologico + '}';
    }
    
    
    
    
}
