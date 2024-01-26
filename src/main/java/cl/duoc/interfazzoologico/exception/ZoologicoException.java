package cl.duoc.interfazzoologico.exception;

import java.time.LocalDateTime;


public class ZoologicoException extends Exception{
    private LocalDateTime time;
    private String mensaje;    

    public ZoologicoException(LocalDateTime time, String mensaje) {
        this.time = time;
        this.mensaje = mensaje;
    }

    public ZoologicoException(LocalDateTime time, String mensaje, String message) {
        super(message);
        this.time = time;
        this.mensaje = mensaje;
    }
    
    public ZoologicoException() {
        super();
        this.time = LocalDateTime.now();
        this.mensaje = "";
    }

    public ZoologicoException(LocalDateTime time, String mensaje, String message, Throwable cause) {
        super(message, cause);
        this.time = time;
        this.mensaje = mensaje;
    }

    public ZoologicoException(LocalDateTime time, String mensaje, Throwable cause) {
        super(cause);
        this.time = time;
        this.mensaje = mensaje;
    }

    public ZoologicoException(LocalDateTime time, String mensaje, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.time = time;
        this.mensaje = mensaje;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "ZoologicoException{" + "time=" + time + ", mensaje=" + mensaje + '}';
    }
    
        
}
