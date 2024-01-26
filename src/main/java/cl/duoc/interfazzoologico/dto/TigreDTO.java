package cl.duoc.interfazzoologico.dto;


public final class TigreDTO extends AnimalDTO{
    private String origen;
    private String codigoUnicoGatuno;

    public TigreDTO(String origen, String codigoUnicoGatuno, int numeroRegistro, String nombre, int edad, String tipoClima, String descripcion) {
        super(numeroRegistro, nombre, edad, tipoClima, descripcion);
        this.origen = origen;
        this.codigoUnicoGatuno = codigoUnicoGatuno;
    }

    public TigreDTO(String origen, String codigoUnicoGatuno) {
        super();
        this.origen = origen;
        this.codigoUnicoGatuno = codigoUnicoGatuno;
    }
    
    public TigreDTO() {
        super();
        this.origen = "";
        this.codigoUnicoGatuno = "";
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCodigoUnicoGatuno() {
        return codigoUnicoGatuno;
    }

    public void setCodigoUnicoGatuno(String codigoUnicoGatuno) {
        this.codigoUnicoGatuno = codigoUnicoGatuno;
    }

    @Override
    public String toString() {
        return "TigreDTO{" + "origen=" + origen + ", codigoUnicoGatuno=" + codigoUnicoGatuno + '}';
    }
    
    
    
    
}
