package com.tt1.P5;

import java.util.ArrayList;
import java.util.List;
/** Emula una base de datos*/
public class DBStub {
    private List<ToDo> tareas;
    private List<String> emails;

    /** Corea un DBStub */
    public DBStub() {
        this.tareas= new ArrayList<>();
        this.emails= new ArrayList<>();
    }
    /**CREATE
     * @param t La tarea a persistir
     */
    public void create(ToDo t){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /**READ
     * @param nombre El nombre identificador de la tarea
     * @return La tarea encontrada
     */
    public ToDo read(String nombre){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /**UPDATE
     * @param t La tarea con los datos actualizados
     */
    public void update(ToDo t){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /**DELETE
     * @param t La tarea a borrar
     */
    public void delete(ToDo t){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /**
     * Añade una direccion email
     * @param correo El email que se desea registrar
     */
    public void addCorreo(String correo){
        emails.add(correo);
    }

    /**
     * Obtiene las tareas
     * @return {@link List} con todos los objetos {@link ToDo}
     * */
    public List<ToDo> getTareas() {
        return tareas;
    }
    /**
     * Obtiene los emails
     * @return Una {@link List} de {@link String} con las direcciones de email
     * */
    public List<String> getEmails() {
        return emails;
    }
}
