package com.tt1.P5;

import java.util.Date;

/**
 * Representa una tarea
 */

public class ToDo {
    /** Identificador de la tarea*/
    private String nombre;
    /** Descripción de lo que se debe realizar*/
    private String descripcion;
    /** Fecha limite a realizar la tarea*/
    private Date fechaLimite;
    /** La tarea está realizada o pendiente*/
    private boolean completado;


    /**Crea una tarea vacía*/
    public ToDo() {
        this.nombre="";
        this.descripcion="";
        this.completado=false;
    }
    /**
     * Crea una tarea completa
     * @param nombre Nombre de la tarea
     * @param descripcion Detalle de la actividad
     * @param fechaLimite Fecha de vencimiento
     * @param completado Estado inicial (true si está hecha)
     */
    public ToDo(String nombre, String descripcion, Date fechaLimite, boolean completado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.completado = completado;
    }
    /**
     * Crea una tarea con la información básica
     * @param nombre Nombre de la tarea
     * @param fechaLimite Fecha de vencimiento
     */
    public ToDo(String nombre, Date fechaLimite) {
        this.nombre = nombre;
        this.fechaLimite = fechaLimite;
        this.completado=false;
        this.descripcion="";
    }

    /**
     * Obtiene el nombre de la tarea
     * @return El nombre actual
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Cambia el nombre de la tarea
     * @param nombre Nuevo nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la descripcion de la tarea
     * @return Texto descriptivo
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Cambia la descripcion de la tarea
     * @param descripcion Nueva descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Obtiene la fecha límite de la tarea
     * @return Objeto Date con la fecha límite
     */
    public Date getFechaLimite() {
        return fechaLimite;
    }
    /**
     * Cambia la fecha límite de la tarea
     * @param fechaLimite Nueva fecha de vencimiento
     */
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    /**
     * Devuelve si la tarea está completada
     * @return true si está terminada, false si sigue pendiente
     */
    public boolean isCompletado() {
        return completado;
    }
    /**
     * Cambia el valor de cmpletitud de la tarea
     * @param completado Nuevo estado booleano
     */
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}

