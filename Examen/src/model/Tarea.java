package model;

import java.time.LocalDate;

public class Tarea {
    private String Titulo;
    private String Descripcion;
    private LocalDate fechaLimite;
    private String estado;

    public Tarea(String Titulo, String Descripcion, LocalDate fechaLimite, String estado) {
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.fechaLimite = fechaLimite;
        this.estado = estado;

    }
    public String getTitulo(){return Titulo;}
    public void setTitulo(String Titulo){this.Titulo=Titulo;}

    public String getDescripcion(){return Descripcion;}
    public void setDescripcion(String Descripcion){this.Descripcion=Descripcion;}


    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }


    public String getEstado(){return estado;}
    public void setEstado(String estado){this.estado=estado;}
}
