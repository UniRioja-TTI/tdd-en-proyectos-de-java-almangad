package com.tt1.test;

import java.util.Date;

public class ToDo {
    private String nombre;
    private String descripcion;
    private Date fechaLimite;
    private boolean completado;

    public ToDo() {
        this.nombre="";
        this.descripcion="";
        this.completado=false;
    }
    public ToDo(String nombre, String descripcion, Date fechaLimite, boolean completado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.completado = completado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaLimite() {
        return fechaLimite;
    }
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    public boolean isCompletado() {
        return completado;
    }
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
