package cl.duoc.interfazzoologico.dto;


public class VisitanteDTO {
    private String rut;
    private String nombreCompleto;
    private String correoElectronico;
    private String telefono;
    private String direccion;
    private int edad;
    private String estadoCivil;

    public VisitanteDTO(String rut, String nombreCompleto, String correoElectronico, String telefono, String direccion, int edad, String estadoCivil) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }
    
    public VisitanteDTO() {
        this.rut = "";
        this.nombreCompleto = "";
        this.correoElectronico = "";
        this.telefono = "";
        this.direccion = "";
        this.edad = 0;
        this.estadoCivil = "";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getnombreCompleto() {
        return nombreCompleto;
    }

    public void setnombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "VisitanteDTO{" + "rut=" + rut + ", nombreCompleto=" + nombreCompleto + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + ", direccion=" + direccion + ", edad=" + edad + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    
    
    
}
